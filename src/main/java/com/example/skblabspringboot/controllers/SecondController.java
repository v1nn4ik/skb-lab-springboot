package com.example.skblabspringboot.controllers;

import com.example.skblabspringboot.CustomException;
import com.example.skblabspringboot.beans.Product;
import com.example.skblabspringboot.beans.CustomErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.status;

@RestController
public class SecondController {
    @GetMapping("/json")
    public Product takeJson(@RequestBody Product product,
                            @RequestParam(required = false) boolean exception) throws CustomException {
        if (exception) {
            throw new CustomException("There was an error :(");
        }
        return product;
    }

    @ExceptionHandler(CustomException.class)
    private ResponseEntity<CustomErrorMessage> handleException(Exception e) {
        var result = new CustomErrorMessage();
        result.setMessage(e.getMessage());
        return status(HttpStatus.BAD_GATEWAY).body(result);
    }
}
