package com.mahfoos.collection.hashmap;

import java.util.HashMap;

public class Hashmap {


//    In the ArrayList chapter, you learned that Arrays store items as an ordered collection,
//    and you have to access them with an index number (int type). A HashMap however,
//    store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).
//
//    One object is used as a key (index) to another object (value). It can store different types:
//    String keys and Integer values, or the same type, like: String keys and String values:

    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);

        System.out.println(capitalCities.get("England"));  // To access a value in the HashMap, use the get() method and refer to its key:
        capitalCities.remove("England");    // To remove an item, use the remove() method and refer to the key:
        capitalCities.clear();  // To remove all items, use the clear() method:
        System.out.println(capitalCities.size());   // To find out how many items there are, use the size() method:


        // Print keys
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

        // Print values
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }

        // Print keys and values
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }


    }

}
