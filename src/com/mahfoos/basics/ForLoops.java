package com.mahfoos.basics;

import java.util.Locale;
import java.util.Scanner;

public class ForLoops {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            System.out.println("Hello world " + i);
        }

        int x = 0;
        while (x > 0){
            System.out.println("Hello world " + x);
            x++;
        }

        Scanner sc = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")){
            System.out.println("Input: ");
            input = sc.next().toLowerCase();
        }

    }
}
