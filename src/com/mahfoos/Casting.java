package com.mahfoos;

public class Casting {

    public static void main(String[] args) {
        // Implicit casting
        // byte > short > int > long > float > double
        short x = 1;
        int y = x +2;
        System.out.println(y);

        // explicit casting
        double a = 1.1;
        int b = (int) a + 2;
        System.out.println(b);

        String str = "1";
        String dob = "1.2";
        int ab = Integer.parseInt(str) + 2;
        double abc = Double.parseDouble(dob) + 2;
        System.out.println(ab);
        System.out.println(abc);


    }
}
