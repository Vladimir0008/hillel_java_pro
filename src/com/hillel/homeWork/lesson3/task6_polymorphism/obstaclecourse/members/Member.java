package com.hillel.homeWork.lesson3.task6_polymorphism.obstaclecourse.members;

public abstract class Member {

    private String name;
    private int maxDistance;
    private int maxHeight;

    public Member(String name, int maxDistance, int maxHeight) {
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
    }

    public Member(String name) {
        this.name = name;
    }

    protected Member() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    public abstract void run();

    public abstract void jump();
}
