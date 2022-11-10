package com.hillel.homeWork.lesson10.practicum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

       MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(3);

        for (int i = 0; i < myLinkedList.getSize(); i++) {
            System.out.println(myLinkedList.get(i));
        }
        myLinkedList.addFirst(0);
        myLinkedList.addFirst("ddd");
        System.out.println(myLinkedList. getSize());
        for (int i = 0; i < myLinkedList.getSize(); i++) {
            System.out.println(myLinkedList.get(i));
        }


        System.out.println(Arrays.toString(myLinkedList.toArray()));
        myLinkedList.clear();
        System.out.println(Arrays.toString(myLinkedList.toArray()));

    }
}
