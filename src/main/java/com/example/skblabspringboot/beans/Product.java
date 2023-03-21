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
}
