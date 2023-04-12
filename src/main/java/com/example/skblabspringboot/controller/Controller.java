package com.example.skblabspringboot.controller;


import com.example.skblabspringboot.dto.UserDto;
import com.example.skblabspringboot.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class Controller {
    private final UserService userService;

    @PostMapping()
    public UserDto user(@RequestBody UserDto user) {
        return userService.prepareUser(user);
    }
}
