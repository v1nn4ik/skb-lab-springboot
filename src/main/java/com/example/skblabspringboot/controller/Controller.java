package com.example.skblabspringboot.controller;

import com.example.skblabspringboot.dto.UserDto;
import com.example.skblabspringboot.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {
    private UserService service;

    @Autowired
    public Controller(UserService service) {
        this.service = service;
    }

    @PostMapping("user")
    private UserDto getUser(@RequestBody UserDto user) {
        return service.setAgeOrProfession(user);
    }

}
