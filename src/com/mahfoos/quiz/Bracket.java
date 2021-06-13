package com.mahfoos.quiz;

import java.util.Scanner;

public class Bracket {

    public static long BracketCombinations(int edges) {

        // as per https://fr.wikipedia.org/wiki/Arbre_(th%C3%A9orie_des_graphes)
        int vertices = edges + 1;
        return factorial(edges * 2) / (factorial(edges)*factorial(vertices));

    }

    public static long factorial(int N)
    {
        long multi = 1;
        for (int i = 1; i <= N; i++) {
            multi = multi * i;
        }
        return multi;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(BracketCombinations(s.nextInt()));
    }

}

