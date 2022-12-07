package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class myConfiguration {
    @Bean
    @Scope("prototype")
    public MyNameMessageService myNameMessageService() {
        return new MyNameMessageService();
    }

    @Bean
    @Scope("prototype")
    public RandomTextMessageService randomMessageService() {
        return new RandomTextMessageService();
    }
}
