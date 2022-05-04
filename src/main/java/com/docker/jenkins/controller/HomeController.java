package com.docker.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/test")
    public String Test(){
        return "Test API is working...";
    }
}
