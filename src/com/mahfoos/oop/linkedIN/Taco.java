package com.mahfoos.oop.linkedIN;

public class Taco {

    String filling;
    String tortilla;

    public void setFilling(String filling) {  // setter always void
        this.filling = filling; // parameter assign to state
    }

    public void setTortilla(String tortilla) {
        this.tortilla = tortilla;
    }

    public static void main(String[] args) {
        Taco taco = new Taco();

        taco.setFilling("carne asada"); // its pass to setFilling method
    }
}
