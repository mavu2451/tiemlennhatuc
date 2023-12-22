package com.example.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("")
    public String homePage(){
        return "index";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }

}
