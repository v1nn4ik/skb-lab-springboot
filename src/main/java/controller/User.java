package controller;

import lombok.Data;
import javax.validation.constraints.NotBlank;

@Data
public class User {
    @NotBlank(message = "ID is empty")
    private int id;
    @NotBlank(message = "Password is empty")
    private String password;
}
