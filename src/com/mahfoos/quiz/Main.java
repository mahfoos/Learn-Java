package com.mahfoos.quiz;

import java.util.Scanner;

public class Main {
    String ABCheck(String str) {
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a'&& (i + 4) < chars.length && chars[i + 4] == 'b') {
                return "true";
            } else if (chars[i] == 'b'&& (i + 4) < chars.length && chars[i + 4] == 'a') {
                return "true";
            }
        }

        return "false";

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        Main c = new Main();
        System.out.print(c.ABCheck(s.nextLine()));
    }
}