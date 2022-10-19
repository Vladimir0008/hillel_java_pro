package com.hillel.homeWork.lesson5.task9_exceptions.exceptions;

public class ArrayDataException extends Exception {

    public ArrayDataException( int i, int j) {
        super("Data format is incorrect in position " + "[" + i + "]" + "[" + j + "]");
    }
}
