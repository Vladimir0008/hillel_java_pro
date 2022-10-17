package com.hillel.homeWork.lesson3.task5_inheritance;

import com.hillel.homeWork.lesson3.task5_inheritance.exception.DistanceException;

import java.util.Formatter;

public class Dog extends Animal {


    private String name;
    private static int instanceCount;

    public Dog(String name) {
        this();
        this.name = name;
    }

    public Dog() {
        instanceCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }


    public void run(int distance) throws DistanceException {
        if (distance > 500 || distance <= 1) {
            throw new DistanceException("Distance is incorrect");
        }
        Formatter formatter = new Formatter()
                .format("Dog %s have run " + distance + " m", getName());
        System.out.println(formatter.toString());

    }

    public void swim(int distance) throws DistanceException {
        if (distance > 10 || distance <= 0) {
            throw new DistanceException("Distance is incorrect");
        }
        Formatter formatter = new Formatter()
                .format("Dog %s have swum " + distance + " m", getName());
        System.out.println(formatter.toString());
    }
}
