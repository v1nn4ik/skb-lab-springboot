package com.example.skblabspringboot.dto;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Table(name = "users")
public class UserDatabaseDto {
    @Id
    private String id = UUID.randomUUID().toString();
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private int age;
    @Column
    private String profession;
}
