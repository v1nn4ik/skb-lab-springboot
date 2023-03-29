package com.example.skblabspringboot.controller;

import com.example.skblabspringboot.dto.User;
import com.example.skblabspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class Controller {
    @Autowired
    private UserService service;

    @PostMapping
    public User user(@RequestBody @Valid User user) {
        return service.setId(user);
    }
}
