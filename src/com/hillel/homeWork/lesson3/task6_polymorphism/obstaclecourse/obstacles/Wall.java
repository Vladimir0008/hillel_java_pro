package com.hillel.homeWork.lesson3.task6_polymorphism.obstaclecourse.obstacles;

import obstaclecourse.members.Member;

public class Wall extends Obstacle {

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public Wall() {
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Member member) {
        boolean result = true;
        if(member.getMaxHeight() >= getHeight()) {
            member.jump();
            System.out.println("Height:" + getHeight());
        } else {
            System.out.println("Member " + member.getClass().getSimpleName() + " " + member.getName() + " haven't jumped the Wall on height " +
                    getHeight() + ". Member have jumped only "  + member.getMaxHeight());
            result = false;
        }
        return result;
    }
}
