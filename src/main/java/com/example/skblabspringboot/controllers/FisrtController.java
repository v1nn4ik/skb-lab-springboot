package com.example.skblabspringboot.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import java.util.Map;

@RestController
@Slf4j
public class FisrtController {
    @GetMapping("/headersList")
    public String headersList(@RequestHeader Map<String, String> headers){
        try {
            return new ObjectMapper().writeValueAsString(headers);
        } catch (IOException e) {
            return e.getMessage();
        }
    }
}
