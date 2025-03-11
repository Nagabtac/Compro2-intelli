package com.myuniquesite.Nagabtac;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Controller
public class HomeController {
    private List<Coffee> coffeeList = new ArrayList<>();

    public HomeController() {
        coffeeList.add(new Coffee(1, "Espresso", "Arabica", "Small", 3.50, "Dark", "Ethiopia", false, 10, Arrays.asList("Chocolate", "Nutty"), "Espresso"));
        coffeeList.add(new Coffee(2, "Latte", "Arabica", "Medium", 4.50, "Medium", "Brazil", false, 8, Arrays.asList("Creamy", "Sweet"), "Drip"));
        coffeeList.add(new Coffee(3, "Cappuccino", "Robusta", "Large", 5.00, "Medium", "Colombia", false, 12, Arrays.asList("Fruity", "Bold"), "French Press"));
        coffeeList.add(new Coffee(4, "Mocha", "Arabica", "Medium", 4.75, "Dark", "Guatemala", false, 6, Arrays.asList("Chocolate", "Smooth"), "Espresso"));
        coffeeList.add(new Coffee(5, "Americano", "Robusta", "Large", 3.25, "Light", "Kenya", false, 15, Arrays.asList("Citrus", "Balanced"), "Drip"));
    }

    @GetMapping("/")
    public String getCoffees(Model model) {
        model.addAttribute("coffees", coffeeList);
        return "index";
    }

    @GetMapping("/delete")
    public String deleteCoffee(@RequestParam int id) {
        coffeeList.removeIf(coffee -> coffee.getId() == id);
        return "redirect:/";
    }
    @GetMapping("/add")
    public String add(){
        return "new";
    }
    @PostMapping("/save")
    public String save(@RequestParam String name, @RequestParam String type,@RequestParam String size,@RequestParam String price,@RequestParam String roastLevel,@RequestParam String origin,@RequestParam boolean isDecaf,@RequestParam int stock,@RequestParam String brewMethod){
        Coffee s = new Coffee(0, name, type, size, 0, roastLevel, origin, false, 0, null, brewMethod);
        s.setId(coffeeList.getLast().getId() + 1);
        s.setName(name);
        s.setType(type);
        //add new student to the array list
        coffeeList.add(s);
        return "redirect:/";
    }
//     @PostMapping("/add")
//     public String add(@RequestParam String name, @RequestParam String type,@RequestParam String size,@RequestParam String price,@RequestParam String roastLevel,@RequestParam String origin,@RequestParam boolean isDecaf,@RequestParam int stock,@RequestParam String brewMethod){
//         Coffee s = new Coffee(0, name, type, size, 0, roastLevel, origin, false, 0, null, brewMethod);
//         s.setId(coffeeList.getLast().getId() + 1);
//         s.setName(name);
//         s.setType(type);
//         s.setSize(size);
//         s.setRoastLevel(roastLevel);
//         s.setOrigin(origin );
//         s.setDecaf(isDecaf );
//         s.setStock(stock );
//         s.setBrewMethod(brewMethod );
//
//         coffeeList.add(s);
//         return "redirect:/";
//     }
}