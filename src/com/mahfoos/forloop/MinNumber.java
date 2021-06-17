package com.mahfoos.forloop;

import java.util.Scanner;

public class MinNumber {

    public int process(int number1, int number2) {
        int min = number1;
        if (number1 > number2) {
            min = number2;
        } else {
            min = number1;

        }
        return min;

    }

    public static void main(String[] args) {
        System.out.println("Enter your first number");

        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        System.out.println("Enter your second number");
        int number2 = scanner.nextInt();

        int min = new MinNumber().process(number1, number2);

        System.out.println("min is " + min);

        scanner.close();
    }

}