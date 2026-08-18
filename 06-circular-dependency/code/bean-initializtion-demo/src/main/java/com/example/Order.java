package com.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component

public class Order {
    private Payment pay;

    public Order(@Lazy Payment pay) {
        this.pay = pay;
        System.out.println("Order object created");
    }

    public void orderPlaced(){
        System.out.println("order placed");
        pay.payment();
    }



}
