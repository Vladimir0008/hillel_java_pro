package com.hillel.homeWork.lesson14.practicum;

import java.util.ArrayList;

public class MyHashMap implements LearningMap {
    private ArrayList<Node>[] nodeLists = new ArrayList[10];

    @Override
    public void put(Integer key, String value) {
        int index = key % nodeLists.length;

        if (nodeLists[index] == null) {
            nodeLists[index] = new ArrayList<Node>();
        }

        if (!nodeLists[index].isEmpty()) {
            for (Node node : nodeLists[index]) {
                if (node.key == key) {
                    node.value = value;
                    return;
                }
            }
        }
        nodeLists[index].add(new Node(key, value));
    }

    @Override
    public String get(Integer key) {
        int index = key % nodeLists.length;
        for (Node node : nodeLists[index]) {
            if (node.key == key) {
                return  node.value;
            }
        }
        return null;
    }


    private static class Node {
        private final int key;
        private String value;

        private Node(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}
