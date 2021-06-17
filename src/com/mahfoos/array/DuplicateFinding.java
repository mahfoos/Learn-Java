package com.mahfoos.array;

public class DuplicateFinding {

    public static void main(String[] args) {
        String [] arr1 = {"abc", "java", "javahungry", "java","javahungry"};

        for (int i = 0; i < arr1.length-1; i++){
            for (int j=i+1; j < arr1.length; j++){
                if (arr1[i].equals(arr1[j]) && i!=j){
                    System.out.println("Duplicate in Array is: " + arr1[j]);
                }
            }
        }
    }
}
