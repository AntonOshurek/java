package com.javalesson.controlstatement;

public class whiledo {
    public static void main(String[] args) {
        int balanceTarget = 100000;
        double currentBalance = 0;
        int yearlyPayment = 10000;
        int years = 0;
        double interestRate = 0.1;

//        while (currentBalance < balanceTarget) {
//            currentBalance = currentBalance + yearlyPayment;
//            currentBalance = currentBalance + currentBalance * interestRate;
//            years++;
//        }

        do {
            currentBalance = currentBalance + yearlyPayment;
            currentBalance = currentBalance + currentBalance * interestRate;
            years++;
        } while (currentBalance < balanceTarget && years < 15);

        System.out.println("result years = " + years + ". current balance = " + String.format("%.2f", currentBalance));
    }
}
