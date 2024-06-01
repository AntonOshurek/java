package com.javalesson.controlstatement;

public class switchcase {
    public static void main(String[] args) {
        String dayOfWeek = args[0];

        switch (dayOfWeek.toLowerCase()) {
            case "monday":
                System.out.println("Today is Monday.");
                break;
            case "tuesday":
                System.out.println("Today is Tuesday.");
                break;
            case "wednesday":
                System.out.println("Today is Wednesday.");
                break;
            case "thursday":
                System.out.println("Today is Thursday.");
                break;
            case "friday":
                System.out.println("Today is Friday.");
                break;
            case "saturday":
                System.out.println("Today is Saturday.");
                break;
            case "sunday":
                System.out.println("Today is Sunday.");
                break;
            default:
                System.out.println("Invalid day of the week.");
                break;
        }
    }
}
