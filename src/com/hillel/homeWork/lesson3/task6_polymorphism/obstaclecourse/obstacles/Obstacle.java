package com.hillel.homeWork.lesson3.task6_polymorphism.obstaclecourse.obstacles;

import obstaclecourse.members.Member;

public abstract class Obstacle {
    public int difficultLevel;

    public abstract boolean overcome(Member member);

}
