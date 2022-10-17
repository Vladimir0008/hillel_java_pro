package com.hillel.homeWork.lesson3.task5_inheritance;

import com.hillel.homeWork.lesson3.task5_inheritance.exception.DistanceException;
import com.hillel.homeWork.lesson3.task5_inheritance.exception.SwimmingException;

import java.util.Formatter;

public class Cat extends Animal {


    private String name;
    private static int instanceCount;

    public static int getInstanceCount() {
        return instanceCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat(String name) {
        this();
        this.name = name;
    }

    public Cat() {
        instanceCount++;
    }


    public void run(int distance) throws DistanceException {
        if (distance > 200 || distance <= 1) {
            throw new DistanceException("Distance is incorrect");
        }
        Formatter formatter = new Formatter()
                .format("Cat %s have run " + distance + " m\n", getName());
        System.out.println(formatter.toString());
    }


    public void swim(int distance) throws SwimmingException {
        throw new SwimmingException("Cats can't swim!");
    }
}
