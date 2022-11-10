package com.hillel.homeWork.lesson10.practicum;

public interface List {

    boolean add(Object e);

    boolean remove(Object o);

    Object[] toArray();

    boolean isEmpty();

    int size();

    void clear();

    Object get(int index);
}
