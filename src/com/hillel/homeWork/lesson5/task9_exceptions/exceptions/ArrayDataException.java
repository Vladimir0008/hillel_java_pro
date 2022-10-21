package com.hillel.homeWork.lesson5.task9_exceptions.exceptions;

public class ArrayDataException extends Exception {

    public ArrayDataException(Exception e, int fieldCount, int lineCount) {
        super("Data format is incorrect in position " + "[" + fieldCount + "]" + "[" + lineCount + "]", e);
    }
    public ArrayDataException(int fieldCount, int lineCount) {
        super("Data format is incorrect in position " + "[" + fieldCount + "]" + "[" + lineCount + "]");
    }
}
