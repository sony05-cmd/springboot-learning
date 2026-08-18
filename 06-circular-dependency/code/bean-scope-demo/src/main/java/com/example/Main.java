package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
        Order o = context.getBean(Order.class);
        Order o2=context.getBean(Order.class);
        System.out.println(o==o2);
    }
}