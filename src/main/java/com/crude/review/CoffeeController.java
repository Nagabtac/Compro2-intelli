package com.crude.review;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class CoffeeController {
    private List<Coffee> coffeeList = new ArrayList<>();

    public CoffeeController() {
        coffeeList.add(new Coffee(1, "Espresso", "Arabica", "Small", 3.50, "Dark", "Ethiopia", false, 10, Arrays.asList("Chocolate", "Nutty"), "Espresso"));
        coffeeList.add(new Coffee(2, "Latte", "Arabica", "Medium", 4.50, "Medium", "Brazil", false, 8, Arrays.asList("Creamy", "Sweet"), "Drip"));
    }
    @GetMapping("/")
    public String getCoffees(Model model, HttpSession request) {
        AppUser currentUser = (AppUser) request.getAttribute("user");
        if (currentUser == null) {
            return "redirect:/login"; // Redirect to login if not authenticated
        }
        model.addAttribute("coffees", coffeeList);
        return "index"; // <<< FIXED: no ".html"
    }
    @GetMapping("/add")
public String showAddForm(Model model) {
    model.addAttribute("coffee", new Coffee()); // Provide an empty Coffee object for form binding
    return "add"; // Ensure this matches your Thymeleaf template name
}@PostMapping("/add")
public String addCoffee(
        @Valid @ModelAttribute("coffee") Coffee coffee,
        BindingResult bindingResult,
        Model model
) {
    if (bindingResult.hasErrors()) {
        model.addAttribute("coffee", coffee);
        System.out.println("Validation errors: " + bindingResult.getAllErrors()); // ✅ Debug output
        return "add";
    }

    coffee.setId(coffeeList.size() + 1);
    coffeeList.add(coffee);
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
    public String updateCoffee(@RequestParam int id, @RequestParam String name, @RequestParam String type, @RequestParam String size, @RequestParam double price) {
        for (Coffee coffee : coffeeList) {
            if (coffee.getId() == id) {
                coffee.setName(name);
                coffee.setType(type);
                coffee.setSize(size);
                coffee.setPrice(price);
                break;
            }
        }
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String deleteCoffee(@RequestParam int id) {
        coffeeList.removeIf(coffee -> coffee.getId() == id);
        return "redirect:/";
    }
}