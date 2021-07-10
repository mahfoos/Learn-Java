package com.mahfoos.oop.eduraka;

// Textual Representation how an object will look like in the memory
// Whatever we write in class is in actual the property of object as we are describing the object
// If you wnt anything which should belong to class make it static !!
class Product {

    // Attributes (State)
//    private int pid;
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

    // Setter
    void setPid(int pid){
        this.pid = pid; // this means reference to current object
        // LHS belongs to the Object and RHS belongs to method
    }

    // Getter
    int getPid(){
        return pid;
    }
}

class Mobile extends Product{  // IS-A relation, Mobile IS-A Product, Mobile is child, Product is Parent

    // Additional Attribute of Mobile other than the Product
    String os;
    int ram;
    int sdCardSize;

    Mobile(){
        System.out.println(">> Mobile Object Constructed");
    }

    // We have redefined the same method from the parent into the child with different inputs
    // We have 2 methods in child, 1 from Parent and i of Child
    // both are different as in based on inputs (even though name is same)
    // METHOD OVERLOADING : Same Method Name with different Inputs
    void setProductDetails(int pid, String name, int price, String os, int ram, int sdCardSize ){
        this.pid = pid;
        this.price = price;
        this.name = name;
        this.os = os;
        this.ram =ram;
        this.sdCardSize = sdCardSize;
        System.out.println(">> Data Written in Product Objects");

    }


    // Lets Redefined showProductDetails as well
    // But here we have same inputs
    // 2 methods, 1 from parent 1 in child and we have some signature !!
    // child methods will be executed and not the parent method

    // METHOD OVERRIDING : Same method Name with same Input in Parent Child Relationship
    void showProductDetails(){
        System.out.println("-------Product ID: " + pid + "--------");

        System.out.println("Name:\t" + name);
        System.out.println("Price:\t" + price);
        System.out.println("OS:\t" + os);
        System.out.println("RAM:\t" + ram);
        System.out.println("SDCard:\t" + sdCardSize);

        System.out.println("----------------------------------------");
    }

}

public class InheritanceApp {

    // main is executed by JVM when my program will run !
    public static void main(String[] args) {

        /*
        // Create an Object : Product
        Product product1 = new Product();

        // product is not an object its a reference variable which holds the hashCode
        // of the object in hexadecimal notation

        System.out.println("product is: " +product1); // we get 677327b6 as a hashCode, so product
        // so product is a ref var not an object

        // Writing data in Object
        product1.setProductDetails(101,"iPhoneX", 7000);

        // Reading data from Objects
        product1.showProductDetails();

        // Lets write the data directly
        Product product2 = new Product();
//        product2.pid = 201; error now since attribute marked as private cannot be accessed !!
        product2.name = "Nike Shoes";
        product2.price = 5000;
        product2.showProductDetails();

         */

        // Requesting to get Mobile Object Constructed
        Mobile mobile = new Mobile();
        // Product Object gets constructed before the Mobile Object !!
        // rule to Inheritance (Object to Object)

        //mobile.setProductDetails(301,"iPhoneX",7000);
        // mobile.showProductDetails();
        
        mobile.setProductDetails(201,"IphoneX",7000,"iOS", 4, 8);
        mobile.showProductDetails();
        
    }
}