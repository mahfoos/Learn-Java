package com.mahfoos.string;

public class RemoveWhiteSpcs {


    public static void main(String[] args) {
        System.out.println(removeWhiteSpaces("Mahfo   s"));
    }


    public static String removeWhiteSpaces(String input){
        StringBuilder output = new StringBuilder();

        char[] charArray = input.toCharArray();

        for(char c : charArray) {
            if (!Character.isWhitespace(c))
                output.append(c);
        }

        return output.toString();
    }

}
