package com.hillel.homeWork.lesson8.task12.first_part;

import java.util.ArrayList;
import java.util.List;

public class ThreadSafeList<E> {
    private List<E> list = new ArrayList<>();

    public ThreadSafeList(List<E> list) {
        this.list = list;
    }

    public synchronized void add(E e) {
        list.add(e);
    }

    public synchronized void remove(int index) {
        list.remove(index);
    }

    public synchronized E get(int i) {
        return list.get(i);
    }


}

