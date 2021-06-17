package com.mahfoos.forloop;

import java.util.Scanner;

public class MaxNumber {

    public int process(int number1, int number2) {
        int max = number1;
        if (number1 < number2) {
            max = number2;
        } else {
            max = number1;

        }
        return max;

    }

    public static void main(String[] args) {
        System.out.println("Enter your first number");

        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        System.out.println("Enter your second number");
        int number2 = scanner.nextInt();

        int max = new MaxNumber().process(number1, number2);

        System.out.println("Max is " + max);

        scanner.close();
    }

}
