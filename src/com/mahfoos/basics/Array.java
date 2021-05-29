package com.mahfoos.basics;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 2;
        numbers[3] = 4;

        int [] number = { 1,6,6,6};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(number.length);
        System.out.println(Arrays.toString(number));


        // 2D array
        int [][] Array2D = new int [3][5] ;// 3 Rows and 5 column
        Array2D[0][0] = 1;

        int [][] Array2DNew = {{1,2,3}, {3,4,5}, {9,4,8}};

        System.out.println(Arrays.deepToString(Array2D));

    }



}
