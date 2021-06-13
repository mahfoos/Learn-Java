package com.mahfoos.oop.linkedIN.stat;

public class Marathon {

    public static void main(String[] args) {

        Athlete mike = new Athlete("mike", 200);
        Athlete betsy = new Athlete("betsy", 12);


        mike.setMarathonLocation("Colombo");
        //betsy.setMarathonLocation("London");
        System.out.println(mike);
        System.out.println(betsy);

        System.out.println("Runners in race " + Athlete.getRunnerInRace());
    }
}
