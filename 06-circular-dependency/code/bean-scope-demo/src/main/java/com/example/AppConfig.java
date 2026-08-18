package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {
   /*  @Bean
    public Order getOrder(){
        return new Order();
    }

    @Bean
    public Order getOrder2(){
        return new Order();
    } */ // here 2 seperate beans of Order is created which are singleton
}
