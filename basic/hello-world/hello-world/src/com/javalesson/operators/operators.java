package com.javalesson.operators;

public class operators {
    public static void main(String[] args) {
        double a = 10;
        double b = 3;

        double plus = a + b;
        double minus = a - b;
        double multiply = a * b;
        double divide = a / b;
        double remainderOfTheDivision = a % b;

//        System.out.println("plus = " + plus);
//        System.out.println("minus = " + minus);
//        System.out.println("multiply = " + multiply);
//        System.out.println("divide = " + divide);
//        System.out.println("remainderOfTheDivision = " + remainderOfTheDivision);

//        a = a + 10;
        a += 5; // short method
        a++;
        a--;
//        System.out.println("new value in a = "+a);

        double n = 7;
        double m = 7;
//        System.out.println("res1 = " + 2*n++);
//        System.out.println("res2 = " + 2*++m);

        int x = 3;
        int y = 5;
        int z = 8;

//        == != < > <= >= && || ?:
        boolean boolVal = x < y;
        System.out.println("boolVal = " + boolVal);

        boolean boolVal2 = y >= z;
        boolean boolResult = boolVal2 || boolVal;
        System.out.println("boolResult = " + boolResult);

        int res = x < 5 ? x : y;
        System.out.println("res = " + res);

        System.out.println("NOT = " + !(x>y));

    }
}
