package com.crude.review;

import java.net.http.HttpRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class AuthController {
    
    @RequestMapping(value = "/login", method = RequestMethod.GET)//GetMapping("/login") && //PostMapping("/login")
        public String login(HttpServletRequest request) {
            if(request.getMethod().equalsIgnoreCase("GET")){
                // Logic for handling login
            return "login"; // Return the name of the login view (e.g., login.html)
            }else if(request.getMethod().equalsIgnoreCase("POST")){
            
            }return "redirect:/index";
        }

}

