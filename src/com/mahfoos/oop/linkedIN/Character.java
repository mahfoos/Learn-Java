package com.mahfoos.oop.linkedIN;

public class Character {

    private String name;
    private String species;

    public Character(String name, String species) {
        this.name = name;  // first one is state next one is parameter
        this.species = species;
    }

    public static void main(String[] args) {
        Character bilbo = new Character("Mahfoos", "two");
        System.out.println(bilbo);
    }
}
