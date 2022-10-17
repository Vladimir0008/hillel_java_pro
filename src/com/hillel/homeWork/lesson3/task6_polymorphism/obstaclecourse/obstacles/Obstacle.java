package com.hillel.homeWork.lesson3.task6_polymorphism.obstaclecourse.obstacles;

import com.hillel.homeWork.lesson3.task6_polymorphism.obstaclecourse.members.Member;

public abstract class Obstacle {
    public int difficultLevel;

    public abstract boolean overcome(Member member);

}
