package com.mahfoos.basics;

public class Operators {

    public static void main(String[] args) {

        // Comparison Operators
        int x = 1;
        int y = 1;
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x < y);
        System.out.println(x <= y);
        System.out.println(x > y);
        System.out.println(x >= y);



        // Logical Operators
        // AND Operator
        int temp = 22;
        boolean isWarm = temp > 20 && temp < 30 ;
        System.out.println(isWarm);

        // OR operator
        boolean hasHighIncome = true;
        boolean hashGoodCredit = true;
        boolean isEligible = hasHighIncome || hashGoodCredit;


    }
}
