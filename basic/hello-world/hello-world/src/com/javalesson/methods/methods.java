package com.javalesson.methods;

public class methods {
    public static void main(String[] args) {
        printMessage("Anton");

        int rectangleSquare = calculateRectangleSquare(5, 10);
        System.out.println("rectangle square is " + rectangleSquare);

        int square = calculateSquare(4);
        System.out.println("square is " + square);
    }

    static void printMessage(String name) {
        System.out.println("hello " + name);
    }

    static int calculateRectangleSquare(int x, int y) {
        return x * y;
    }

    static int calculateSquare(int x) {
        return x * x;
    }
}
