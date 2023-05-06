package com.example.skblabspringboot.controller;

import com.example.skblabspringboot.dto.UserDto;
import com.example.skblabspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final UserService service;

    @Autowired
    public Controller(UserService service) {
        this.service = service;
    }

    @PostMapping("user")
    private UserDto getUser(@RequestBody UserDto user) {
        var user1 = service.setAgeAndProfession(user);
        service.saveUser(user1);
        return user;
    }

}
