package com.example.skblabspringboot;

import org.springframework.stereotype.Component;

@Component
public class Steam implements Program {
    @Override
    public String getName() {
        return "Apex Legends";
    }
}
