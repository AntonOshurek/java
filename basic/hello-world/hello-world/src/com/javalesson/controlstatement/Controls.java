package com.javalesson.controlstatement;

public class Controls {
    public static void main(String[] args) {
        int testScore = 84;

        if (testScore >= 90) {
            System.out.println(">= 90");
        } else if (testScore < 90 && testScore >= 80){
            System.out.println("testScore < 90 && testScore >= 80");
        }
        else {
            System.out.println("< 90");
        }
    }
}
