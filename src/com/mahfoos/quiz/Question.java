package com.mahfoos.quiz;

import java.util.*;
import java.io.*;
import java.util.regex.*;
public class Question  {
    public static String QuestionsMarks(String str) {

        // code goes here
    /* Note: In Java the return type of a function and the
       parameter types being passed are defined, so this return
       call must match the return type of the function.
       You are free to modify the return type. */
        str = str.replaceAll("[a-z]", "");
        Pattern pattern = Pattern.compile("([0-9])([?])([?])([?])([0-9])");
        Pattern falseP1 = Pattern.compile("([0-9])([?])([?])([0-9])");
        Pattern falseP2 = Pattern.compile("([0-9])([?])([0-9])");
        Matcher falseMatchP1 = falseP1.matcher(str);
        Matcher falseMatchP2 = falseP2.matcher(str);
        Matcher matchPattern = pattern.matcher(str);
        if (falseMatchP1.find() || falseMatchP2.find()){
            return "false";
        }
        if (matchPattern.find()){
            return "true";
        }
        return "false";

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(QuestionsMarks(s.nextLine()));
    }

}
