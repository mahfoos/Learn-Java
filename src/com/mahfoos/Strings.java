package com.mahfoos;

public class Strings {

    public static void main (String[] args) {
        int addition = 10+3;
        int subtraction = 10-3;
        int divide = 10/4 ;
        int multiply = 10*3;
        double result = (double)10 / (double)3;

        System.out.println(result);
        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(divide);
        System.out.println(multiply);

        System.out.println();

        int x = 1;
        x++; // incrementing post fix
        System.out.println(x);

        int y = 2;
        ++y; //prefix
        int z = y++;
        System.out.println(y);
        System.out.println(z);

        int a = 1;
        a+=2; // augment or compound assignment operator
        System.out.println(a);

        // Order of operation
        /* ()
           *  /
           + -
         */
        int order = 10 + 3 * 2;
        System.out.println(x);






    }
}
