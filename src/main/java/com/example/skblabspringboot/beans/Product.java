package com.example.skblabspringboot.beans;

import lombok.Getter;
import lombok.Setter;

public class Product {
    @Getter
    @Setter
    private double price;

    @Getter
    @Setter
    private Info info;

    public Product(double price, Info info) {
        this.price = price;
        this.info = info;
    }
}
