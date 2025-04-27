package com.crude.review;

import java.net.http.HttpRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.ui.Model;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class AuthController {

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("user", new AppUser()); 
        return "login"; 
    }

    @PostMapping("/login")
    public String authenticate(@ModelAttribute("user") @Valid AppUser user, BindingResult bindingresult, HttpSession request, Model model) {
        if (bindingresult.hasErrors()) {
            return "login";
        }

        // authenticate
        String dummyUsername = "admin";
        String password = "password";

        if (user.getUsername().equals(dummyUsername) && user.getPassword().equals(password)) {
            request.setAttribute("user", user);
            return "redirect:/"; 
        }

        String error = "Hacker ka no? Tawag na ako pulis.";
        model.addAttribute("error", error); 
        return "login"; 
    }

    @GetMapping("/logout")
    public String logout(HttpSession request) {
        request.invalidate();
        return "redirect:/login";
    }
}
