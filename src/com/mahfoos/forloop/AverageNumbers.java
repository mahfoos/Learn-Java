package com.mahfoos.forloop;

import java.util.Scanner;

public class AverageNumbers {

    public float process(float number1, float number2) {

        return (number1 + number2) / 2.0f;

    }

    public static void main(String[] args) {
        System.out.println("Enter your first number");

        Scanner scanner = new Scanner(System.in);
        float number1 = scanner.nextFloat();
        System.out.println("Enter your second number");
        float number2 = scanner.nextFloat();

        float average = new AverageNumbers().process(number1, number2);

        System.out.println("Average is " + average);

        scanner.close();

    }

}
