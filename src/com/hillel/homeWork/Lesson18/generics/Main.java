package com.hillel.homeWork.Lesson18.generics;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Box<Apple> appleBox = new Box<>();
        appleBox.addOneFruit(new Apple());
        appleBox.addOneFruit(new Apple());
        appleBox.addOneFruit(new Apple());
        appleBox.addOneFruit(new Apple());
        appleBox.addSeveralFruit(new Apple(), new Apple(), new Apple());

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addOneFruit(new Apple());
        appleBox2.addOneFruit(new Apple());
        appleBox2.addOneFruit(new Apple());
        appleBox2.addSeveralFruit(new Apple(), new Apple(), new Apple());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addOneFruit(new Orange());
        orangeBox.addOneFruit(new Orange());
        orangeBox.addOneFruit(new Orange());
        orangeBox.addOneFruit(new Orange());
        orangeBox.addSeveralFruit(new Orange(), new Orange(), new Orange());

        Box<Fruit> fruitBox = new Box<>();
        fruitBox.addOneFruit(new Orange());
        fruitBox.addOneFruit(new Apple());

        System.out.println(appleBox.getWeight());
        System.out.println(fruitBox.getWeight());
        System.out.println(orangeBox.getWeight());
        System.out.println(appleBox.compare(orangeBox));

        appleBox.merge(appleBox2);
        System.out.println(appleBox.getWeight());
        System.out.println(appleBox2.getWeight());

        Apple[] apples = new Apple[] { new Apple(), new Apple(), new Apple()};
        System.out.println(Arrays.toString(apples));
        List<Fruit> apples1 = toList(apples);
        System.out.println(apples1);

    }

    public static <T> List<T> toList(T[] elements) {
        return new ArrayList<>(Arrays.asList(elements));
    }
}
