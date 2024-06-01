package com.javalesson.controlstatement;

public class forloop {
    public static void main(String[] args) {
        int factorialLimit = 10;
        int factorial = 1;

        for (int i = 1; i <= factorialLimit; i++) {
            factorial *= i;
            System.out.println("i = " + i);
        }

        System.out.println("factorial = " + factorial);
    }
}
