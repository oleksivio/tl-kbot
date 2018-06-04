package ru.ioleksiv.telegram.bot.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value="ru.ioleksiv.telegram.bot.api")
public class MyConfiguration {

    @Bean
    public String getService(){
        return "test";
    }
}