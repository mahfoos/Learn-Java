package com.mahfoos.forloop;

public class ReplaceChar {

    public String process(String str) {

        String replacedString = "";
        int i = 0;

        while (i < str.length()) {
            if (str.charAt(i) == ('a') || str.charAt(i) == ('e') || str.charAt(i) == ('i') || str.charAt(i) == ('o')
                    || str.charAt(i) == ('u')) {
                replacedString += 'X';
            } else {
                replacedString += str.charAt(i);
            }
            i++;
        }

        return replacedString;
    }

    public static void main(String[] args) {
        String s = "Java is fun";
        String replacedString = new ReplaceChar().process(s);
        System.out.println(replacedString);
    }
}