package com.example.skblabspringboot.controller;

import com.example.skblabspringboot.controller.dto.ValidPassword;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class User {
    @Size(max=20, message = "Username must be between 3 and 20 characters")
    private String username;
    @Email(message = "Email must be correct")
    private String email;
    @ValidPassword
    @NotBlank
    @Size(min = 8, max = 40, message = "Password must be between 8 and 40 characters")
    private String password;
}
