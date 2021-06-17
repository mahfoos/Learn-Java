package com.mahfoos.array;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {
        int [] array = {23,16,19,30};
        Arrays.sort(array);

        for (int temp : array){
            System.out.println(temp + " ");
        }
    }
}
