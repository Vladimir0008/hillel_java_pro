package com.hillel.homeWork.lesson3.task5_inheritance;

import com.hillel.homeWork.lesson3.task5_inheritance.exception.DistanceException;
import com.hillel.homeWork.lesson3.task5_inheritance.exception.SwimmingException;

public class Animal {
    private String name;
    private static int instanceCount;

    public Animal() {
        instanceCount++;
    }

    public Animal(String name) {
        this();
        this.name = name;
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


    public void run(int distance) throws DistanceException, DistanceException {
        System.out.println("Animal have run " + distance + " m");
    }

    public void swim(int distance) throws DistanceException, SwimmingException {
        System.out.println("Animal have swum " + distance + " m");
    }
}
