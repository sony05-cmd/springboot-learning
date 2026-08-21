package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.payment.Payment;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
       /*  Payment payment=context.getBean("payment",Payment.class);
         payment.paying();
         Payment p =context.getBean(Payment.class);
        Payment pay=(Payment)context.getBean("gateway");
        pay.paying();
        p.paying(); */
        Order order = context.getBean("order",Order.class);
        order.placeOrder();
        User user = context.getBean(User.class);
        user.display();

        context.close();
    }
}