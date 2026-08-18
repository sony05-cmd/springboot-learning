package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    @Autowired
    private PaymentService  pay;

   /*  public OrderService(PaymentService pay){
        this.pay=pay;
    } */

    public void orderPlaced(){
        System.out.println("Order Placed successfully");
        pay.payment();
    }
    public void getOrder(){
        System.out.println("Order Details");
    }
}
