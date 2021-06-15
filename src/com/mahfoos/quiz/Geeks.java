package com.mahfoos.quiz;

import java.util.Scanner;

public class Geeks {

    public static void solve(String s) {
        int l = s.length();
        int x = l / 2;
        int y = l;

        // Calculating the two halves of
        // string s as first and second
        // The final string p
        String p = "";
        while (x > 0 && y > l / 2) {

            // It joins the characters to
            // final string in reverse order
            char ch = s.charAt(x - 1);
            p += ch;
            x--;

            // It joins the characters to
            // final string in reverse order
            ch = s.charAt(y - 1);
            p += ch;
            y--;
        }

        if (y > l / 2) {
            char ch = s.charAt(x + 1);
            p += ch;
            y--;
        }
        System.out.println(p);
    }

    // Driver method
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        // Calling function
        solve(input);

    }
}
