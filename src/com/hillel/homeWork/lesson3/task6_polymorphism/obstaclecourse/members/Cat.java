package com.hillel.homeWork.lesson3.task6_polymorphism.obstaclecourse.members;

public class Cat extends Member {

    public Cat(String name, int maxDistance, int maxHeight) {
        super(name, maxDistance, maxHeight);
    }

    public Cat(String name) {
        super(name);
    }

    public Cat() {
    }

    public void run() {
        System.out.printf("Cat %s has run on the RunningTrack \n", getName());
    }

    public void jump() {
        System.out.printf("Cat %s has jumped on the Wall\n", getName());
    }
}
