package com.mahfoos.thread;

public class HelloThread extends Thread {

    public void run(){
        System.out.println("Hello from " + Thread.currentThread().getName() + " created by "+ "extending thread class!");
    }
}
