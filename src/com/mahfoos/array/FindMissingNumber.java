package com.mahfoos.array;


public class FindMissingNumber {
    public static void main(String[] args) {
        int [] a = {1,2,4,5,6};
        System.out.println(getMissingNo(a, a.length));
    }

    public static int getMissingNo(int a[], int n){
        int total = 1;
        for (int i = 2; i <= (n+1); i++){
            total += i;
            total -= a[i - 2];
        }
        return total;
    }
}
