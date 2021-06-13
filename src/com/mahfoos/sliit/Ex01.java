package com.mahfoos.sliit;

public class Ex01 {

    static int no = 10;

    static {
        no = no + add(no);
        System.out.println(no);
    }

    static int add (int no){
        return no;
    }

    {
        System.out.println(no);
    }

    public Ex01(){
        System.out.println("Constructor");
    }

    public static void main (String[] args){
        Ex01 ex01 = new Ex01();
    }
}
