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
    
    // @RequestMapping(value = "/login", method ={ RequestMethod.GET,RequestMethod.POST})//GetMapping("/login") && //PostMapping("/login")
    //     public String login(HttpServletRequest request) {
    //         if(request.getMethod().equalsIgnoreCase("GET")){
    //             // Logic for handling login
    //         return "login"; // Return the name of the login view (e.g., login.html)
    //         }else if(request.getMethod().equalsIgnoreCase("POST")){
            
    //         }return "redirect:/index";
    //     }
    //OR

    @GetMapping("/login")
    public String login(Model model){
            model.addAttribute("user", new AppUser()); // Add a login form object to the model
            
            return "Login"; // Return the name of the login view (e.g., login.html)
    }

    @PostMapping("/login")
    public String authenticate(@ModelAttribute("user")@Valid AppUser user, BindingResult bindingresult, HttpSession request, Model model) {
        if (bindingresult.hasErrors()) {
            return "login";
    
    //authenticate 
    String dummyUsername = "admin";
    String password = "password";
    if(user.getUsername().equals(dummyUsername) && user.getPassword().equals(password)){

        request.setAttribute("user", user); // Store the user in the session
        return "/index"; // Redirect to the index page after successful login
    }
    String Error ="Hacker ka no? Tawag na ako pulis.";
    model.addAttribute("error", Error); // Add an error message to the model
}

    @GetMapping("/logout")
    public String  logout(HttpSession request){
        request.invalidate();
        return "redirect:/login"; // Redirect to the login page after logout
    }
}