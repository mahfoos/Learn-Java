package com.mahfoos.forloop;

import java.util.Scanner;

public class MultiplicationTable {

    public void process(int number) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter your number");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        new MultiplicationTable().process(number);

        scanner.close();
    }

}
