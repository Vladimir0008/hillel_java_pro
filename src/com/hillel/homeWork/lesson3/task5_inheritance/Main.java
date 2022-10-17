package com.hillel.homeWork.lesson3.task5_inheritance;

import com.hillel.homeWork.lesson3.task5_inheritance.exception.DistanceException;
import com.hillel.homeWork.lesson3.task5_inheritance.exception.SwimmingException;

public class Main {
    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal cat = new Cat("Tom");

        try {
            dog.run(500);
        } catch (DistanceException e) {
            System.err.println(e.getMessage());
        }

        try {
            dog.run(-1000);
        } catch (DistanceException e) {
            System.err.println(e.getMessage());
        }

        try {
            dog.run(1000);
        } catch (DistanceException e) {
            System.err.println(e.getMessage());
        }

        try {
            dog.swim(10);
        } catch (DistanceException | SwimmingException e) {
            System.err.println(e.getMessage());
        }

        try {
            cat.swim(-100);
        } catch (DistanceException | SwimmingException e) {
            System.err.println(e.getMessage());
        }

        try {
            dog.swim(-10);
        } catch (DistanceException | SwimmingException e) {
            System.err.println(e.getMessage());
        }

        Cat cat2 = new Cat();
        Animal cat3 = new Cat();
        Cat cat4 = new Cat();

        System.out.println("We created " + Cat.getInstanceCount() + " cats.");
        System.out.println("We created " + Dog.getInstanceCount() + " dogs");
        System.out.println("We created " + Animal.getInstanceCount() + " animals");
    }
}
