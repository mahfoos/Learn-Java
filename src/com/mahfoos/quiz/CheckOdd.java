package com.mahfoos.quiz;

import java.util.ArrayList;
import java.util.List;

public class CheckOdd {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<Integer>();
        list.add(3);
//        list.add(6);
//        list.add(8);
//        list.add(10);
        System.out.println(onlyOddNumbers(list));
    }

    public static boolean onlyOddNumbers(List<Integer> list){
        for (int i : list){
            if (i % 2 == 0){
                return false;
            }
        }
        return true;
    }
}
