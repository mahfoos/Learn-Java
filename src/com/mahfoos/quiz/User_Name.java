package com.mahfoos.quiz;



import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User_Name {

    public static String CodelandUsernameValidation(String str) {
        Pattern p = Pattern.compile("[a-zA-Z][a-zA-Z0-9_]");
        Matcher matcher = p.matcher(str);
        return matcher.matches() ? "true" : "false";
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(CodelandUsernameValidation(s.nextLine()));
    }

}
