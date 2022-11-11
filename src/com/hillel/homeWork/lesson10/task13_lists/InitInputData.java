package com.hillel.homeWork.lesson10.task13_lists;

import java.util.ArrayList;
import java.util.List;

public class InitInputData {

    private List<String> listTask1 = new ArrayList<>();
    private int[] arrayTask2  = new int[] {1,2,3,4,5,6,7,8,9,0};
    private List<Integer> listTask3 = new ArrayList<>();

    public InitInputData() {
        listTask1.add("mother");
        listTask1.add("father");
        listTask1.add("sister");
        listTask1.add("brother");
        listTask1.add("aunt");
        listTask1.add("uncle");
        listTask1.add("mother");
        listTask1.add("father");
        listTask1.add("sister");
        listTask1.add("brother");
        listTask1.add("aunt");
        listTask1.add("uncle");
        listTask1.add("grandma");
        listTask1.add("grandpa");

        listTask3.add(1);
        listTask3.add(2);
        listTask3.add(3);
        listTask3.add(4);
        listTask3.add(5);
        listTask3.add(1);
        listTask3.add(2);
        listTask3.add(3);
    }

    public List<String> getListTask1() {
        return listTask1;
    }

    public int[] getArrayTask2() {
        return arrayTask2;
    }

    public List<Integer> getListTask3() {
        return listTask3;
    }
}

