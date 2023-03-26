package com.example.skblabspringboot.controller;

import lombok.Data;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class User {
    @Size(min=3, max=20)
    private String username;
    @NotBlank(message = "Password is empty")
    private String password;
}
