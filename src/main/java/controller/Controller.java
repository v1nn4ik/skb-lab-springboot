package controller;

import controller.dto.Dto;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Validated
public class Controller {
    @GetMapping("/user")
    public User user(@Valid @RequestBody User name) throws HttpMediaTypeNotAcceptableException{
        return name;
    }
}
