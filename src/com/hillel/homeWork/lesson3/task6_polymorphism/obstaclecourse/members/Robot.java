package com.hillel.homeWork.lesson3.task6_polymorphism.obstaclecourse.members;

public class Robot extends Member {

    public Robot(String name, int maxDistance, int maxHeight) {
        super(name, maxDistance, maxHeight);
    }

    public Robot(String name) {
        super(name);
    }

    public Robot() {
    }


    public void run() {
        System.out.printf("Robot %s has run on the RunningTrack \n", getName());
    }

    public void jump() {
        System.out.printf("Robot %s has jumped on the Wall\n", getName());
    }
}
