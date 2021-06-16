package com.mahfoos.collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

    /*
    HashSet class implements Set interface. It represents the collection that uses
    a hash table for storage. Hashing is used to store the elements in
    the HashSet. It contains unique items
 */

    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);

        System.out.println(cars.contains("Mazda")); // To check whether an item exists in a HashSet, use the contains() method:
        cars.remove("Volvo");   // To remove an item, use the remove() method:
        cars.clear();   // To remove all items, use the clear() method:
        System.out.println(cars.size());    // To find out how many items there are, use the size method:

        //Loop through the items of an HashSet with a for-each loop:
        for (String i : cars) {
            System.out.println(i);
        }



        // Traversing elements
        Iterator<String> itr = cars.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
