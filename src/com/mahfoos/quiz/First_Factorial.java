package com.mahfoos.quiz;

import java.util.*;


public class First_Factorial {

    int FirstFactorial(int num) {

            if(num <= 1){
                return 1;
            }

            return num * FirstFactorial(num-1);
        }

        public static void main (String[] args) {
            // keep this function call here
            Scanner  s = new Scanner(System.in);
            First_Factorial c = new First_Factorial();
            System.out.print(c.FirstFactorial(s.nextInt()));
        }

    }

