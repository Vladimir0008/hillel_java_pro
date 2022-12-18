package com.hillel.homeWork.Lesson18.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruits = new ArrayList<>();
    private float weight;

    public void addOneFruit(T fruit) {
        this.fruits.add(fruit);
        weight += fruit.getWeight();
    }

    @SafeVarargs
    public final void addSeveralFruit(T... fruit) {
        fruits.addAll(Arrays.asList(fruit));
        for (T someFruit : fruit) {
            weight += someFruit.getWeight();
        }
    }

    public boolean compare(Box otherBox) {
        return this.weight == otherBox.getWeight();
    }

    public void merge(Box<T> otherBox) {
        fruits.addAll(otherBox.getFruits());
        this.weight +=otherBox.getWeight();
        otherBox.getFruits().clear();
        otherBox.weight = 0;
    }

    public List<T> getFruits() {
        return fruits;
    }

    public float getWeight() {
        return weight;
    }
}
