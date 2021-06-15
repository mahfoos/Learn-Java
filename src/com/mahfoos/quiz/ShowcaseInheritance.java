package com.mahfoos.quiz;

public class ShowcaseInheritance {
    class Animal {
        String color;
    }

    class Cat extends Animal {
        void meuw(){
            System.out.println("Meuw");
        }
    }

}
