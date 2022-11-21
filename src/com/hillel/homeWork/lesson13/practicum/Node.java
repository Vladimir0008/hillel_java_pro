package com.hillel.homeWork.lesson13.practicum;

public class Node {
    private Integer value;
    private Node leftNode;
    private Node rightNode;

    public Node(Integer value, Node leftNode, Node rightNode) {
        this.value = value;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public Node(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", leftNode=" + (leftNode == null ? "No" : leftNode) +
                ", rightNode=" + (rightNode == null ? "No" : rightNode)  +
                '}';
    }
}
