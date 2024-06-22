package com.javalesson.oop;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("bobik");
        dog.setSize(Size.SMALL);
        dog.bite();

        Dog dog2 = new Dog();
        dog2.setName("шарик");

        Dog dog3 = new Dog();
        dog3.setName("алтай");

        Dog dog4 = new Dog();
        dog4.setName("лёля");

        dog.bite();

        Size[] values = Size.values();
        for(int i = 0; i < values.length; i++) {
            System.out.println("[Size.values()] value " + i + " is " + values[i]);
        }
    }
}
