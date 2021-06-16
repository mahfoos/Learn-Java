package com.mahfoos.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

/* The ArrayList class implements the List interface.
It uses a dynamic array to store the duplicate element
of different data types. the Arraylist class maintains the insertion order
and is non-synchronized. the elements stored in the Arraylist class can be
randomly accessed
 */


public class Arraylist {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(); // Creating arraylist
        list.add("Ravi"); // Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");

        System.out.println(list.get(3)); // print third index element
//        list.set(3,"Mahfoos"); // set the item
//        list.remove(3);// remove the item
//        list.clear(); // clear the all items
//        System.out.println(list.size()); // get the arrylist size


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // for each loop
        for (String i : list) {
            System.out.println(i);
        }

        // Traversing list through iterator
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

/*
Iterable interface

- The iterable interface is the root interface for all the collection classes
the collection interface extends the iterable interface and therefore
all the subclasses of Collection interface also implement the iterable interface

- It contains only one abstract method

- Iterator <T> iterator()
 */
