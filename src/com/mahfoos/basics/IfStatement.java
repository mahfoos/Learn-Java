package com.mahfoos.basics;

public class IfStatement {

    public static void main(String[] args) {
        int temp = 32;
        if (temp > 30) {
            System.out.println("It's a hot day");
            System.out.println("Drink water");
        } else if (temp > 20 && temp <= 30) {
            System.out.println("Beautiful day");
        } else {
            System.out.println("Cold day");
        }
        // Ternary Operator
        int income = 120_000;
        String className = income > 100_000 ? "First" : "Economy";
        System.out.println(className);

    }
}



