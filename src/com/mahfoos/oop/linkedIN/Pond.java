package com.mahfoos.oop.linkedIN;

public class Pond {

    public static void main(String[] args) {
        String me = "Mahfoos";
        //<type> <name> = new "type"();

        Duck mobyDuck = new Duck("Moby", 90/3,"celery");
        Duck wolfDuck = new Duck("wolf", 60/3,"celery");

        mobyDuck.waddle();
        mobyDuck.waddle();
        mobyDuck.waddle();
        mobyDuck.waddle();
        mobyDuck.waddle();


        System.out.println(mobyDuck);

    }
}
