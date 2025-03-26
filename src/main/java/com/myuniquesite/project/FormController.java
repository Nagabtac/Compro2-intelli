package com.myuniquesite.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class FormController {

    @GetMapping("/")
    public String showForm() {
        return "form";
    }


    @PostMapping("/submit")
    @ResponseBody
    public String processForm(@RequestParam Map<String, String> formData) {
        System.out.println("Form Data Received:");
        formData.forEach((key, value) -> System.out.println(key + ": " + value));
        return "Form submitted successfully! Check terminal for output.";
    }
    @GetMapping("/error")
    public String error() {
        return "error: WhiteLabel Warnings";
    }
}