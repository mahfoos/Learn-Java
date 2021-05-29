package com.mahfoos;

import java.util.Scanner;

public class ReadingInput {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in); // System in mean reading from terminal
        System.out.print("Enter your age");
        byte age = sc.nextByte();
        System.out.print("Name : ");
        String name = sc.next().trim(); // next read only one token instead we use nextLine
        System.out.println("My Name " + name);
        System.out.println("Your age" + age);


    }
}
