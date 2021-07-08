package com.mahfoos.oop.eduraka;

// Textual Representation how an object will look like in the memory
// Whatever we write in class is in actual the property of object as we are describing the object
// If you wnt anything which should belong to class make it static !!
class Product {

    // Attributes (State)
    int pid;
    String name;
    int price;

    // Constructor
    Product(){
        System.out.println(">> Product Object Constructed");
    }

    // Method (Behavior)
    // To write data in Product Object we have this method
    void setProductDetails(int pid, String name, int price){
        this.pid = pid;
        this.price = price;
        this.name = name;
        System.out.println(">> Data Written in Product Objects");

    }

    // To read data from Product object
    void showProductDetails(){
        System.out.println("-------Product ID: " + pid + "--------");

        System.out.println("Name:\t" + name);
        System.out.println("Price:\t" + price);

        System.out.println("----------------------------------------");
    }
}


public class InheritanceApp {

    // main is executed by JVM when my program will run !
    public static void main(String[] args) {

        // Create an Object : Product
        Product product = new Product();

        // product is not an object its a reference variable which holds the hashCode
        // of the object in hexadecimal notation

        System.out.println("product is: " +product); // we get 677327b6 as a hashCode, so product
        // so product is a ref var not an object

        // Writing data in Object
        product.setProductDetails(101,"iPhoneX", 7000);

        // Reading data from Objects
        product.showProductDetails();
    }
}
