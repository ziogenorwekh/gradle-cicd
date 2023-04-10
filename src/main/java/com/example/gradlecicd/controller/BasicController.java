package com.example.gradlecicd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class BasicController {

    @GetMapping("/")
    public String welcome(Model model) {
        model.addAttribute("controller_data", "Data from Controller");
        model.addAttribute("today", new Date());
        return "index";
    }
}
