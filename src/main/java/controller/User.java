package controller;

import lombok.Data;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class User {
    @NotEmpty(message = "Username is empty")
    @Size(min = 4, max = 15, message = "Username should be between 4 and 15 characters")
    private int username;
    @NotBlank(message = "Password is empty")
    @Size(min = 6, max = 20, message = "Password should be between 6 and 20 characters")
    private String password;
}
