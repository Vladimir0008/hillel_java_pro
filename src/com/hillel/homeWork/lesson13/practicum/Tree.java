package com.hillel.homeWork.lesson13.practicum;

public class Tree {
    private Node node;

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public void add(Integer value) {
        Node currentNode = node;
        while (true) {
            if(value == currentNode.getValue()) {
                break;
            }
            if (value > currentNode.getValue()) {
                if (currentNode.getRightNode() == null) {
                    currentNode.setRightNode(new Node(value));
                    break;
                } else
                    currentNode = currentNode.getRightNode();
            } else if (value < currentNode.getValue()) {
                if (currentNode.getLeftNode() == null) {
                    currentNode.setLeftNode(new Node(value));
                    break;
                } else
                    currentNode = currentNode.getLeftNode();
            }
        }
    }

    @Override
    public String toString() {
        return "Tree{" +
                "node=" + node +
                '}';
    }
}
