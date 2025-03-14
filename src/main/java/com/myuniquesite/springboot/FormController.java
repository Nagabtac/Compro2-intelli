package com.myuniquesite.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class FormController {

    @GetMapping("/form")
    public String showForm() {
        return "form"; // This should match your Thymeleaf template (e.g., form.html)
    }


    @PostMapping("/submit")
    @ResponseBody
    public String processForm(@RequestParam Map<String, String> formData) {
        System.out.println("Form Data Received:");
        formData.forEach((key, value) -> System.out.println(key + ": " + value));
        return "Form submitted successfully! Check terminal for output.";
    }
}