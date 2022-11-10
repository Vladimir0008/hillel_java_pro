package com.hillel.homeWork.lesson10.practicum;

import java.util.Arrays;

public class MyArrayList implements List {

    private Object[] array = new Object[10];
    private int elementCount = 0;
    private int extensionNumber = array.length/2;

    @Override
    public boolean add(Object e) {
        if(array.length == (elementCount)) {
            Object[] newArr = Arrays.copyOf(array, array.length  + extensionNumber);
            array = newArr;
        }
        array[elementCount] = e;
        elementCount++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < elementCount; i++) {
            if(array[i].equals(o)) {
                System.arraycopy(array, i + 1 , array,i, elementCount-i-1);
                elementCount--;
                return true;
            }
        }
        return false;
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(array,elementCount);
    }

    @Override
    public boolean isEmpty() {
        return elementCount == 0;
    }

    @Override
    public int size() {
        return elementCount;
    }

    @Override
    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
        elementCount = 0;
    }

    @Override
    public Object get(int index) {
        return array[index];
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "array=" + Arrays.toString(toArray()) +
                ", elementCount=" + elementCount +
                '}';
    }
}
