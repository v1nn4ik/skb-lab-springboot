package controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Validated
public class Controller {
    @PostMapping("/user")
    public User user(@Valid @RequestBody User name) {
        return name;
    }
}
