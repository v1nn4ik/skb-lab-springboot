package com.example.skblabspringboot;

import org.springframework.stereotype.Component;

@Component
public class Screen {
    public String getResolution() {
        return "1920 * 1080";
    }
}
