package com.hillel.homeWork.lesson14.practicum;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MyHashMap hashMap = new MyHashMap();
        hashMap.put(3204, "Kyiv");
        hashMap.put(3204, "Kyiv");
        hashMap.put(3104, "Lviv");
        hashMap.put(3004, "Dnepr");
        hashMap.put(4, "Harkiv");

        hashMap.put(10, "Doneck");
        System.out.println(hashMap);

        Map<Integer, Integer> map = new HashMap<>();
        System.out.println();



    }
}
