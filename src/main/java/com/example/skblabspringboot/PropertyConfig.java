package com.example.skblabspringboot;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties") //можем создать свой конфиг файл и зарегистрировать его
public class PropertyConfig {

}
