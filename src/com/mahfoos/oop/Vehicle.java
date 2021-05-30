package com.mahfoos.oop;

public class Vehicle {

    private String name = "";
    private String color = "";
    private String model = "";
    private  String company = "";

    // Java compiler creating a default constructor
    // doesnt have a return type
    public Vehicle (){ }

    // Constructor Overloading defining method same name but provided different parameters
    public Vehicle(String name, String color, String model, String company) {
        this.name = name;  // this refers particular class property
        this.color = color;
        this.model = model;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
