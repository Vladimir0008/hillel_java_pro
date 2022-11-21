package com.hillel.homeWork.lesson13.practicum;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        Node node = new Node(4);
        node.setLeftNode(new Node(2));
        node.setRightNode(new Node(6));

        node.getRightNode().setRightNode(new Node(12 ));

        tree.setNode(node);

        tree.add(15);
        tree.add(3);
        tree.add(2);

        System.out.println(tree);

        Map<Integer,Integer> map = new TreeMap<>();
    }
}
