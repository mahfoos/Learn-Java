package com.mahfoos.array;

public class sumOfArrayValues {

    public static void main(String[] args) {
        int [] inputArr = {10,243,27,89,191};
        int sum = 0;

        // Iterating through the Array
        for (int num : inputArr){
            sum = sum + num;
        }

        System.out.println(sum);
    }
}
