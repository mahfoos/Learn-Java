package com.mahfoos.quiz;

public class itrate {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++){
            if (i%5 == 0){
                System.out.println(i + " It divisible by 5" );
            }else if(i%2 == 0){
                System.out.println(i + " It divisible 2");
            }else{
                System.out.println("Not divisible by 2 and 5");
            }

        }
    }

}
