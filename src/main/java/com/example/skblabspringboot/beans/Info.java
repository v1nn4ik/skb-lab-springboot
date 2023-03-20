package com.example.skblabspringboot.beans;

import lombok.Getter;
import lombok.Setter;

public class Info {
    @Getter
    @Setter
    private int id;

    @Getter
    @Setter
    private String date;

    public Info(int id, String date) {
        this.id = id;
        this.date = date;
    }
}
