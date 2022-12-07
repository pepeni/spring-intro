package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {
    @Bean
    public MyNameMessageService myNameMessageService(){
        return new MyNameMessageService();
    }
}
