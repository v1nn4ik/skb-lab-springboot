package com.example.skblabspringboot.controllers;

import com.example.skblabspringboot.CustomException;
import com.example.skblabspringboot.Dto;
import com.example.skblabspringboot.beans.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.status;

@RestController
public class SecondController {
    @GetMapping("/json")
    public Product takeJson(@RequestBody Product product, boolean exception) throws CustomException {
        if (exception) {
            throw new CustomException("There was an error :(");
        }
        return product;
    }

    @ExceptionHandler(CustomException.class)
    private ResponseEntity<Dto> handleException(Exception e) {
        var result = new Dto();
        result.setMessage(e.getMessage());
        return status(HttpStatus.BAD_GATEWAY).body(result);
    }
}
