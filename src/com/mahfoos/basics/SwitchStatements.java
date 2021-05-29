package com.mahfoos.basics;

public class SwitchStatements {

    public static void main(String[] args) {
        String role = "admin";
        if (role == "admin"){
            System.out.println("You're an admin");
        }
        else if (role == "se"){
            System.out.println("You're a se");
        }
        else{
            System.out.println("You're a guest");
        }

        // Switch case
        switch (role) {
            case "admin":
                System.out.println("You're an admin");
                break;
            case "se":
                System.out.println("You're a se");
                break;
            default:
                System.out.println("You're a guest");
                break;

        }


    }
}
