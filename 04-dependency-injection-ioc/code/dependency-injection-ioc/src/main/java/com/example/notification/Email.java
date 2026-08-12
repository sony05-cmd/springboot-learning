package com.example.notification;

public class Email implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("Email sent successfully");
    }
}
