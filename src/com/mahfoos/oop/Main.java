package com.mahfoos.oop;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();  // Create a new vehicle , vehicle 1 is a data type
        System.out.println(vehicle1.getName());
        vehicle1.setName("hero");
        System.out.println(vehicle1.getName());

        Vehicle vehicle2 = new Vehicle("Honda", "Black", "Vezal", "Honda");
//      System.out.println(vehicle2.color); // not a good practice calling like
        System.out.println(vehicle2.getColor());


        Car car1 = new Car("Honda", "Black", "Vezal", "Honda",true,false);
        System.out.println(car1.isDoor());
        System.out.println(car1.isLedScreen());

    }
}
