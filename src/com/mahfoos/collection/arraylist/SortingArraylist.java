package com.mahfoos.collection.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArraylist {
     public static void main(String[] args) {
            ArrayList<Integer> cars = new ArrayList<Integer>();
            cars.add(4);
            cars.add(10);
            cars.add(40);
            cars.add(40);
            Collections.sort(cars);  // Sort cars
            for (Integer i : cars) {
                System.out.println(i);
            }
        }
    }


