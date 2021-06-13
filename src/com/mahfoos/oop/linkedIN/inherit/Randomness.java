package com.mahfoos.oop.linkedIN.inherit;



public class Randomness {

    public static void main(String[] args) {
        Extrarandom random = new Extrarandom();
        System.out.println(random.nextInt());
        System.out.println(random.nextBoolean());
        System.out.println(random.nextDouble());
        System.out.println(random.nextLetter());
    }
}
