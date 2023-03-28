package com.example.skblabspringboot.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@Slf4j
public class FisrtController {
    @GetMapping("/headersList")
    public Map<String, String> headersList(@RequestHeader Map<String, String> headers){
        return headers;
    }
}
