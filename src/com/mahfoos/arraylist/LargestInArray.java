package com.mahfoos.arraylist;

public class LargestInArray {

    public static void main(String[] args) {
        int [] array = {3,5,10,50,100};
        System.out.println(findSecondHighest(array));
    }

    private static int findSecondHighest(int[] array) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i : array) {
            if (i > highest) {
                secondHighest = highest;
                highest = i;
            } else if (i > secondHighest) {
                secondHighest = i;
            }

        }
        return secondHighest;
    }
}
