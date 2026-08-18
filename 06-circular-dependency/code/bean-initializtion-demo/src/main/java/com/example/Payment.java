package com.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Payment {
    public Payment(){
        System.out.println("Payment object created");
    }
    public void payment(){
        System.out.println("Payment done");
    }
}
