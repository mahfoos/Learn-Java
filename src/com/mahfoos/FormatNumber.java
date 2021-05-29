package com.mahfoos;

import java.text.NumberFormat; // Its a abstract class cannot be initiated

public class FormatNumber {

    public static void main(String[] args) {

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        NumberFormat percent = NumberFormat.getPercentInstance();
        String result = currency.format(1234567.891); // it will be print $1,234,567.89
        String resultPercent = percent.format(0.1);
        String chinMethod = NumberFormat.getPercentInstance().format(2.3); // Method chaining
        System.out.println(result);
        System.out.println(resultPercent);
        System.out.println(chinMethod);

    }
}
