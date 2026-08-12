package com.example;

import com.example.notification.Email;
import com.example.notification.Notification;
import com.example.notification.Sms;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Notification email = new Email();
        Notification sms = new Sms();
        OrderService orderService = new OrderService(email);
        orderService.placeOrder();

        orderService.setNotification(sms);
        orderService.placeOrder();
    }
}