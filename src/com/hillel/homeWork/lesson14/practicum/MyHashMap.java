package com.hillel.homeWork.lesson14.practicum;

import java.util.ArrayList;
import java.util.Arrays;

public class MyHashMap implements LearningMap {
    private ArrayList<Node>[] nodeLists = new ArrayList[10];
    private int bucketsCount;
    private int size;

    public int findIndex(Integer key) {
        return key % nodeLists.length;
    }

    private void arrayRedistribute() {
        bucketsCount = 0;
        size = 0;
        ArrayList<Node>[] arrayToCopy = nodeLists.clone();
        nodeLists = new ArrayList[nodeLists.length * 2];
        for (ArrayList<Node> nodes : arrayToCopy) {
            if (nodes != null) {
                for (Node node : nodes) {
                    put(node.key, node.value);
                }
            }
        }
    }

    @Override
    public void put(Integer key, String value) {
        int index = findIndex(key);

        if (nodeLists[index] == null) {
            nodeLists[index] = new ArrayList<Node>();
            bucketsCount++;
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
        size++;
        if (bucketsCount > (int) (nodeLists.length * 0.75D)) {
            arrayRedistribute();
        }
    }

    @Override
    public String get(Integer key) {
        int index = findIndex(key);

        if (nodeLists[index] != null) {
            for (Node node : nodeLists[index]) {
                if (node.key == key) {
                    return node.value;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "MyHashMap{" +
                "nodeLists=" + Arrays.toString(nodeLists) +
                '}';
    }

    public int getBucketsCount() {
        return bucketsCount;
    }

    public int getSize() {
        return size;
    }

    public ArrayList<Node>[] getNodeLists() {
        return nodeLists;
    }

    private static class Node {
        private final int key;
        private String value;

        private Node(int key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "key=" + key +
                    ", value='" + value + '\'' +
                    '}';
        }
    }
}
