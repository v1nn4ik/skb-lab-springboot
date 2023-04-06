package com.example.skblabspringboot.controller;

import com.example.skblabspringboot.dto.UserDto;
import com.example.skblabspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class Controller {
    @Autowired
    private UserService userService;
    @PostMapping()
    public UserDto user(@RequestBody UserDto user) {
        return userService.prepareUser(user);
    }
}
