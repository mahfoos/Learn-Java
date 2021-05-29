package com.mahfoos;

public class MathClass {
    public static void main(String[] args) {
        int resultMax = Math.max(1,2);
        int resultMin = Math.min(1,2);
        int resultRandom = (int)Math.round(Math.random() * 100);
        System.out.println(resultMax);
        System.out.println(resultMin);
        System.out.println(resultRandom);

    }
}
