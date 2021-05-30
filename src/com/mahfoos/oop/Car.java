package com.mahfoos.oop;

public class Car extends Vehicle {
    private boolean isDoor = false;
    private boolean ledScreen = true;


    public Car(String name, String color, String model, String company, boolean isDoor, boolean ledScreen) {
        super(name, color, model, company);
        this.isDoor = isDoor;
        this.ledScreen = ledScreen;
    }

    public boolean isDoor() {
        return isDoor;
    }

    public void setDoor(boolean door) {
        isDoor = door;
    }

    public boolean isLedScreen() {
        return ledScreen;
    }

    public void setLedScreen(boolean ledScreen) {
        this.ledScreen = ledScreen;
    }
}
