package com.hillel.homeWork.lesson3.task6_polymorphism.obstaclecourse.obstacles;

import com.hillel.homeWork.lesson3.task6_polymorphism.obstaclecourse.members.Member;

public class RunningTrack extends Obstacle {

    private int difficultLevel;

    public RunningTrack(int distance) {
        this.difficultLevel = distance;
    }

    public RunningTrack() {
    }

    public int getDistance() {
        return difficultLevel;
    }

    public void setDistance(int distance) {
        this.difficultLevel = distance;
    }

    @Override
    public boolean overcome(Member member) {
        boolean result = true;
        if (member.getMaxDistance() >= getDistance()) {
            member.run();
            System.out.println("Distance:" + getDistance());
        } else {
            System.out.println("Member " + member.getClass().getSimpleName() + " " + member.getName() + " haven't run the RunningTrack on distance " +
                    getDistance() + ". Member have run only " + member.getMaxDistance());
            result = false;
        }
        return result;
    }
}
