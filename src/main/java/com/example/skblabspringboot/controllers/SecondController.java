package com.example.skblabspringboot.controllers;

import com.example.skblabspringboot.beans.Product;
import org.springframework.web.bind.annotation.*;

@RestController
public class SecondController {
    @GetMapping("/json")
    public Product takeJson(@RequestBody Product product) {
        return product;
    }
}
