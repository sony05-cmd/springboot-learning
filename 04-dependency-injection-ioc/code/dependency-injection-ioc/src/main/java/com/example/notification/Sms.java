package com.example.notification;

public class Sms implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("SMS sent successfully");
    }
}
