package com.mahfoos.forloop;

public class BackwardCounting {

        public void backwardCounter() {
            for (int i = 100; i >= 0; i = i - 5) {
                System.out.println(i);
            }
        }

        public static void main(String[] args) {
            new BackwardCounting().backwardCounter();
        }
    }

