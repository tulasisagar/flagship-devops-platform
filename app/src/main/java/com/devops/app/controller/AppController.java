package com.devops.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "DevOps Flagship Project Running 🚀");
        model.addAttribute("status", "SUCCESS");
        return "index";
    }
}
