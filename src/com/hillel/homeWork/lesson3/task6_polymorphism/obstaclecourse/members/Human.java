package com.hillel.homeWork.lesson3.task6_polymorphism.obstaclecourse.members;

public class Human extends Member {
    public Human(String name) {
        super(name);
    }

    public Human(String name, int maxDistance, int maxHeight) {
        super(name, maxDistance, maxHeight);
    }

    public void run() {
        System.out.printf("Human %s has run on the RunningTrack \n", getName());
    }

    public void jump() {
        System.out.printf("Human %s has jumped on the Wall\n", getName());
    }
}
