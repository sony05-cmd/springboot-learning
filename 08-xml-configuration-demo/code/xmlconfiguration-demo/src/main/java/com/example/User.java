package com.example;

public class User {
    private String name;
    private int age;
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println("Name "+name+ " age "+ age);
    }
}
