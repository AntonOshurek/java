package com.javalesson.oop;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("bobik");
        dog.setSize(Size.SMALL);

        Dog dog2 = new Dog();
        dog2.setName("шарик");

        Dog dog3 = new Dog();
        dog3.setName("алтай");

        Dog dog4 = new Dog();
        dog4.setName("лёля");
    }
}
