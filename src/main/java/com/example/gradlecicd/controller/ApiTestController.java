package com.example.gradlecicd.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiTestController {
    @GetMapping("/api")
    public String test() {
        return "test_ok";
    }
}
