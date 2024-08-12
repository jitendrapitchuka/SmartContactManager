package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model) {
        return "home";
    }
    
    @RequestMapping("/about")
    public String aboutPage(Model model) {
        return "about";
    }
    
    @RequestMapping("/services")
    public String servicesPage(Model model) {
        return "services";
    }

    @RequestMapping("/signup")
    public String signupPage(Model model) {
        return "register";
    }

    @RequestMapping("/login")
    public String loginPage(Model model) {
        return "login";
    }
    


}
