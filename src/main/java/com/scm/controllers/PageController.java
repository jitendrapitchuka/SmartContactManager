package com.scm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

import com.scm.entities.User;
import com.scm.forms.UserForm;
import com.scm.services.UserService;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;





@Controller
public class PageController {

    @Autowired
    private UserService userService;

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

        UserForm userForm=new UserForm();
        model.addAttribute( "userForm",userForm);

        return "register";
    }

    @RequestMapping("/login")
    public String loginPage(Model model) {
        return "login";
    }
    
    @PostMapping("/do-register")
    public String processRegister(@ModelAttribute UserForm userForm) {
        System.out.println(userForm);
        User user=User.builder()
        .name(userForm.getName())
        .email(userForm.getEmail())
        .password(userForm.getPassword())
        .about(userForm.getAbout())
        .phoneNumber(userForm.getPhoneNumber())
        .build();
        
        User savedUser = userService.saveUser(user);
        
        System.out.println(savedUser);

        return "redirect:/signup";
    }
    


}
