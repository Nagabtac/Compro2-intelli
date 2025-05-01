package com.crude.review;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class CoffeeController {
    private List<Coffee> coffeeList = new ArrayList<>();
    private final CsvDataService csvDataService; 
    public CoffeeController(CsvDataService csvDataService) {
        this.csvDataService = csvDataService;
        coffeeList.add(new Coffee(1, "Espresso", "Arabica", "Small", 3.50, "Dark", "Ethiopia", false, 10, Arrays.asList("Chocolate", "Nutty"), "Espresso", null));
        coffeeList.add(new Coffee(2, "Latte", "Arabica", "Medium", 4.50, "Medium", "Brazil", false, 8, Arrays.asList("Creamy", "Sweet"), "Drip", null));
    }
    @GetMapping("/")
    public String getCoffees(Model model, HttpSession request) {
        AppUser currentUser = (AppUser) request.getAttribute("user");
        if (currentUser == null) {
            return "redirect:/login"; 
        }
        model.addAttribute("coffees", coffeeList);
        return "index"; 
    }
    @GetMapping("/add")
public String showAddForm(Model model) {
    model.addAttribute("coffee", new Coffee()); 
    return "add"; 
}

@PostMapping("/add")
public String addCoffee(@Valid @ModelAttribute("coffee") Coffee coffee,
                        BindingResult bindingResult,
                        @RequestParam("imageFile") MultipartFile imageFile,
                        Model model) {

    if (bindingResult.hasErrors()) {
        model.addAttribute("coffee", coffee);
        return "add";
    }

    // Handle file upload
    if (!imageFile.isEmpty()) {
        try {
            // Save file in a local folder "uploads"
            byte[] bytes = imageFile.getBytes();
            Path uploadPath = Paths.get("uploads");
            if (!Files.exists(uploadPath)) {
                Files.createDirectories(uploadPath);
            }

            String fileName = imageFile.getOriginalFilename();
            Path filePath = uploadPath.resolve(fileName);
            Files.write(filePath, bytes);

            // Save the file path in the Coffee object
            coffee.setProfilePicture("/uploads/" + fileName);

        } catch (IOException e) {
            e.printStackTrace();
            return "add"; // Show error on the same page
        }
    }

    coffee.setId(coffeeList.size() + 1);
    coffeeList.add(coffee);
    csvDataService.saveToCsv(coffeeList);

    return "redirect:/";
}






    @GetMapping("/edit")
    public String editCoffee(@RequestParam int id, Model model) {
        for (Coffee coffee : coffeeList) {
            if (coffee.getId() == id) {
                model.addAttribute("coffee", coffee);
                return "edit";
            }
        }
        return "redirect:/";
    }

    @PostMapping("/update")
    public String updateCoffee(@RequestParam int id, @RequestParam String name, @RequestParam String type, @RequestParam String size, @RequestParam double price,@RequestParam String roastLevel, @RequestParam String origin, @RequestParam boolean isDecaf, @RequestParam int stock, @RequestParam List<String> flavorNotes, @RequestParam String brewMethod, @RequestParam String profilePicture) {
        for (Coffee coffee : coffeeList) {
            if (coffee.getId() == id) {
                coffee.setName(name);
                coffee.setType(type);
                coffee.setSize(size);
                coffee.setPrice(price);
                coffee.setRoastLevel(roastLevel);
                coffee.setOrigin(origin);
                coffee.setDecaf(isDecaf);
                coffee.setStock(stock);
                coffee.setFlavorNotes(flavorNotes);
                coffee.setBrewMethod(brewMethod);
                coffee.setProfilePicture(profilePicture);
                
                break;
            }
        }
        csvDataService.saveToCsv(coffeeList); 
        return "redirect:/";
    }

    @GetMapping("/delete")
public String deleteCoffee(@RequestParam int id) {
    coffeeList.removeIf(coffee -> coffee.getId() == id);
    csvDataService.saveToCsv(coffeeList); 
    return "redirect:/";
}
    @PostMapping("/save")
@ResponseBody
public String saveCoffees() {
    boolean success = csvDataService.saveToCsv(coffeeList);
    return success ? "saved" : "error";
}
}
