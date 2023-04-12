package com.example.skblabspringboot.config;


import com.example.skblabspringboot.dto.BeanDto;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Configuration
public class BeansConfig {
    @Bean("testProfile")
    @Profile("test")
    public BeanDto testProfile() {
        var bean = new BeanDto();
        bean.setName("testBean");
        System.out.println("Active profile: TEST");
        return bean;
    }

    @Bean("isTestProfileActive")
    @ConditionalOnBean(name = "testProfile")
    public BeanDto isTestProfileActive() {
        var bean = new BeanDto();
        bean.setName("isTestProfileActiveBean");
        System.out.println("TEST profile is active");
        return bean;
    }

    @Bean("isMainNotDefault")
    @ConditionalOnExpression("!'${main}'.equals('default')")
    public BeanDto isMainNotDefault() {
        var bean = new BeanDto();
        bean.setName("isMainNotDefault");
        System.out.println("MAIN (ENV VAR) isn't default");
        return bean;
    }
}
