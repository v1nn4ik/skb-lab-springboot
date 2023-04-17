package com.example.skblabspringboot;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Data
@Entity
@Table
public class ToDoListInfo {
    private String name;
    private List<String> events;
}
