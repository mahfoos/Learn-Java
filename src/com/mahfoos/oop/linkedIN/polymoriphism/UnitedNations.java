package com.mahfoos.oop.linkedIN.polymoriphism;

import java.util.List;

public class UnitedNations {

    public static void main(String[] args) {
        Country country = new Country();
        country.dance();

        Ireland ireland = new Ireland();
        ireland.dance();

        Brazil brazil = new Brazil();
        brazil.dance();

//        Country country = new Country();
//        Ireland ireland = new Ireland();
//        Brazil brazil = new Brazil();
//
//        List<Country> countries = List.of(ireland,brazil);
//        for (Country country2 : countries){
//            country2.dance();
//        }
    }
}
