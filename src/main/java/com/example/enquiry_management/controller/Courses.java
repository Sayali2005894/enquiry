package com.example.enquiry_management.controller;

import com.example.enquiry_management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Courses {
    //___________injection----------------------------------
@Autowired
public UserService userService;
public Courses(UserService userService)
{
    this.userService=userService;
}
//__________________________________________________________





    @GetMapping("/")
    public String index() {
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }
}
