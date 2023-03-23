package controller;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class User {
    @NotBlank
    public String id;
    @NotBlank
    public String password;
}
