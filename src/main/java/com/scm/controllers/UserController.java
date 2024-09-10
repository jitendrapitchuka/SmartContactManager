package com.scm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.scm.entities.User;
import com.scm.helper.Helper;
import com.scm.services.UserService;

import org.springframework.web.bind.annotation.GetMapping;



@Controller
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;

    @GetMapping("/dashboard")   
    public String userDashboard() {
        return "user/dashboard";
    }
    
    @GetMapping("/profile")
    public String userProfile(Model model,Authentication authentication) {

        // String username = Helper.getEmailOfLoggedInUser(authentication);

        // User user=userService.getUserByEmail(username);

        // model.addAttribute("loggedInUser", user);
        
        return "user/profile";
    }

}
