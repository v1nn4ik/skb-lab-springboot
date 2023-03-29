package com.example.skblabspringboot.dto;

import com.example.skblabspringboot.validation.ValidPassword;
import lombok.Data;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class User {
    private int id;
    @Size(min=3, max=20, message = "Username must be between 3 and 20 characters")
    private String username;
    @Email(message = "Email must be correct")
    private String email;
    @ValidPassword
    @NotBlank
    @Size(min = 8, max = 40, message = "Password must be between 8 and 40 characters")
    private String password;
}
