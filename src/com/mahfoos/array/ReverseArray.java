package com.mahfoos.array;

public class ReverseArray {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println("Original Array ");
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Array in reverse Order: ");
        // loop through the arry in revrese ordr
        for (int i = arr.length-1; i >= 0; i--){
            System.out.println(arr[i] + " ");
        }
    }
}
