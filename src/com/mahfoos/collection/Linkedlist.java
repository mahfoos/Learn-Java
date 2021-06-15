package com.mahfoos.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

    /* The LinkedList class implements the Collection interface.
It uses a doubly linked to store the elements.It can store the duplicate
elements. It maintains the insertion order and is not synchronized
 */

    public static void main(String[] args) {

        LinkedList<String> al = new LinkedList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");

        Iterator<String> itr = al.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
