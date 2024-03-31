package com.example.app1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/app1")
public class APIcontroller {

    @GetMapping("/name")
    public String getName(){
        return "app1";
    }
}
