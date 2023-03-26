package com.example.skblabspringboot.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @PostMapping("/user")
    public User user(@RequestBody User name) {
        return name;
    }
}
