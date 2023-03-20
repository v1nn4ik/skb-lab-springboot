package com.example.skblabspringboot.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@Slf4j
public class FisrtController {
    @GetMapping("/headersList")
    public ResponseEntity<String> headersList(@RequestHeader Map<String, String> headers) {
        log.info("");
        headers.forEach((key, value) -> log.info(String.format("%s = %s", key, value)));
        return new ResponseEntity<>(String.format("The number of headings: %s", headers.size()), HttpStatus.OK);
    }
}
