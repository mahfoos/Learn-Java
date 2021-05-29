package com.mahfoos;

public class Strings {

    public static void main (String[] args) {

        String message = "Hello World";
        System.out.println(message.endsWith("!!")); // Output the true / false based on the condition
        System.out.println(message.startsWith("ee"));
        System.out.println(message.length());
        System.out.println(message.indexOf("jw"));
        System.out.println(message.replace("H", "m"));
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim()); // deleting the space

        //  c:\windows\...
        String msg = "c:\\Windows\\";
        String nextLine = "c\ns";
        System.out.println(msg);
        System.out.println(nextLine);




    }
}
