package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.payment.PaymentService;

@Component
public class OrderService {
    private  PaymentService payment;

    @Autowired
    public OrderService(@Qualifier("upi")PaymentService payment){
        this.payment=payment;
    }

    public void orderplaced(){
        System.out.println("order placed successfully");
        payment.pay();
    }
}
