package com.example;

import com.example.notification.Notification;

public class OrderService {
    private Notification notification;

    public OrderService(Notification notification) {
        this.notification = notification;
    }

    public OrderService() {
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    public void placeOrder() {
        System.out.println("Order placed successfully");
        notification.sendNotification();
    }
}
