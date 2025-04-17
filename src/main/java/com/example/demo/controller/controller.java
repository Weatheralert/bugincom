package com.example.demo.controller;

import com.example.demo.model.model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


public class controller {
    @GetMapping("/greet")
    public model greet(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new model(String.format("Hello, %s!", name));
    }
}
