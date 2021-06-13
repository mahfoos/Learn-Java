package com.mahfoos.oop.linkedIN.stat;

public class Athlete {

    private String name;
    private int speed;
    private static String marathonLocation; // this static member belong to the class doesnt belong the object mike
    private int bibNumber;
    private static int runnerInRace;

    public Athlete(String name, int speed){
        this.name = name;
        this.speed = speed;
        runnerInRace++;
        this.bibNumber = runnerInRace;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setMarathonLocation(String marathonLocation) {
        this.marathonLocation = marathonLocation;
    }

    @Override
    public String toString() {
        return "Athlete " + this.name + " is running at " + this.speed + " miles per hour at " + this.marathonLocation + " " +  bibNumber;
    }

    public static int getRunnerInRace() {
        return runnerInRace;
    }
}
