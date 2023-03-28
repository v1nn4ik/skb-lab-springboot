package com.example.skblabspringboot.controller;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class User {
    @Size(min=3, max=20, message = "Username must be between 3 and 20 characters")
    private String username;
    @Email(message = "Email must be correct")
    private String email;
    @NotBlank(message = "Password is empty")
    private String password;
}
