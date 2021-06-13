package com.mahfoos.oop.linkedIN;

public class Duck {

    // member variables : data
    private String name;
    private int lifeExpectancy;
    private String favouriteFood;

    public Duck(String name, int lifeExpectancy, String favouriteFood) {
        this.name = name;
        this.lifeExpectancy = lifeExpectancy;
        this.favouriteFood = favouriteFood;
    }

    // methods : functionality
    void waddle() {
        lifeExpectancy++;
        System.out.println(this.name +" is waddling");
    }

    void quick() {
        System.out.println("quick quick");
    }

    @Override
    public String toString() {
        return "My Name is " + this.name +" I like to eat " +  this.favouriteFood + " LifeExpectancy " + this.lifeExpectancy;
    }
}
