package com.mahfoos.intreview;

import java.util.Scanner;

public class SumArray {

    public static void main(String[] args) {

        int sum = 0;
        // Create a scanner object for taking input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an Array: ");
        // Take the number of elements and store it
        int n = sc.nextInt();

        // Create an array of size n
        int array[] = new int[n];

        System.out.println("Enter the elements in an Array: ");

        for(int i = 0; i<n; i++){
            array[i] = sc.nextInt();
        }

        // 10, 20, 30
        for(int i : array){
            sum = sum + i;
        }

        System.out.println("Sum of Array : " + sum);
    }
}
