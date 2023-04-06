package com.example.skblabspringboot;

import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class Controller {
    @PostMapping
    public String user(@RequestBody User user) {
        return user.getName();
    }
}
