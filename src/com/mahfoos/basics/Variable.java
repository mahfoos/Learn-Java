package com.mahfoos.basics;

public class Variable {


//    Java Variables
//    Variables are containers for storing data values.
//
//    In Java, there are different types of variables, for example:
//
//    String - stores text, such as "Hello". String values are surrounded by double quotes
//    int - stores integers (whole numbers), without decimals, such as 123 or -123
//    float - stores floating point numbers, with decimals, such as 19.99 or -19.99
//    char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
//    boolean - stores values with two states: true or false


//    Declaring (Creating) Variables
//    To create a variable, you must specify the type and assign it a value:

//    type variable = value;



    public static void main(String[] args) {
        int age = 10;  // int is type of variable and age is identifier
        System.out.println(age);

//        Create a variable called name of type String and assign it the value "John":
        String name = "John";
        System.out.println(name);

//        Create a variable called myNum of type int and assign it the value 15:
        int myNum = 15;
        System.out.println(myNum);


//        You can also declare a variable without assigning the value, and assign the value later:
        int myNum2;
        myNum2 = 15;
        System.out.println(myNum2);

    }
}
