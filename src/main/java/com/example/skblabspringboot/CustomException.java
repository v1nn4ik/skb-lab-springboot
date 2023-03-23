package com.example.skblabspringboot;

import lombok.Getter;



public class CustomException extends Exception{
    @Getter
    private final String message;
    public CustomException(String message) {
        this.message = message;
    }
}