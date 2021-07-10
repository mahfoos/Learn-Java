package com.mahfoos.intreview;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in); // Take the uer input from command line
        int sum = 0;
        int mul = 1;
        int n = args.length; // nu,ber of command line arguments

        System.out.println("1 - SUM");
        System.out.println("2 - AVERAGE");
        System.out.println("3 - MULTIPLICATION");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.println("Enter numbers to perform operation: ");
        Scanner sc1 = new Scanner(System.in);
        String inputNumbers = sc1.next();
        String numbers[] = inputNumbers.split(",");

        for(int i = 0; i < numbers.length; i++){
            sum = sum + Integer.parseInt(numbers[i]);
        }

        switch(choice) {
            case 1:
                System.out.println("Sum is = " + sum);
                break;

            case 2:
                System.out.println("Average is = " + sum/ numbers.length);
                break;

            case 3:
                for (String string : numbers){
                    mul = mul * Integer.parseInt(string);
                }


            System.out.println("Multiplication is " + mul);
        }




    }

}
