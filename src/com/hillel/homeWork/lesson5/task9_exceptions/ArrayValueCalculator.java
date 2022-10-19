package com.hillel.homeWork.lesson5.task9_exceptions;

import com.hillel.homeWork.lesson5.task9_exceptions.exceptions.ArrayDataException;
import com.hillel.homeWork.lesson5.task9_exceptions.exceptions.ArraySizeException;

public class ArrayValueCalculator {

    public static int doCalc(String[][] arr) throws ArraySizeException, ArrayDataException {
        int result = 0;
        if (arr.length != 4) {
            throw new ArraySizeException("Array size is incorrect. Expected size = 4.");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new ArraySizeException("Array size is incorrect. Expected size = 4.");
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    result = result + Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException(i, j);
                }
            }
        }
        return result;
    }
}
