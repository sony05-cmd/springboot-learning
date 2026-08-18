package com.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype") //lazy initialization, by default scope is sigleton and eager initialization
public class Order {

    public Order() {
        System.out.println("order constructer created");
    }
    public void placeOrder(){
        System.out.println("Order placed");
    }
}
