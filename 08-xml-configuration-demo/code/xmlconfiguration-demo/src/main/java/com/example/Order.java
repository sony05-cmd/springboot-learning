package com.example;

import com.example.payment.Payment;

public class Order {
    private Payment payment;

    public Order(Payment payment) {
        this.payment=payment;
    }
    public void placeOrder(){
        payment.paying();
        System.out.println("Order placed");
    }
    public void start(){
        System.out.println("init-method running");
    }
    public void cleanup(){
        System.out.println("destroy method running");
    }
}
