package com.hillel.homeWork.lesson3.task6_polymorphism.obstaclecourse;

import com.hillel.homeWork.lesson3.task6_polymorphism.obstaclecourse.members.Cat;
import com.hillel.homeWork.lesson3.task6_polymorphism.obstaclecourse.members.Human;
import com.hillel.homeWork.lesson3.task6_polymorphism.obstaclecourse.members.Member;
import com.hillel.homeWork.lesson3.task6_polymorphism.obstaclecourse.members.Robot;
import com.hillel.homeWork.lesson3.task6_polymorphism.obstaclecourse.obstacles.Obstacle;
import com.hillel.homeWork.lesson3.task6_polymorphism.obstaclecourse.obstacles.RunningTrack;
import com.hillel.homeWork.lesson3.task6_polymorphism.obstaclecourse.obstacles.Wall;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Member human = new Human("Peter", 100, 100);
        Member cat = new Cat("Tom",900,9);
        Member robot = new Robot("Bender",99,10);

        List<Member> memberList = new ArrayList<>();
        memberList.add(human);
        memberList.add(cat);
        memberList.add(robot);

        Obstacle runningTrack = new RunningTrack(100);
        Obstacle wall = new Wall(10);

        List<Obstacle> obstacleList = new ArrayList<>();
        obstacleList.add(runningTrack);
        obstacleList.add(wall);

        for (int i = 0; i < memberList.size(); i++) {
            memberList.get(i);
            for (int j = 0; j < obstacleList.size(); j++) {
                if (!obstacleList.get(j).overcome(memberList.get(i)))
                break;
            }
        }

//        runningTrack.overcome(human);
//        runningTrack.overcome(cat);
//        runningTrack.overcome(robot);
    }
}
