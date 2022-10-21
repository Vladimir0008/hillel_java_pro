package com.hillel.homeWork.lesson5.task9_exceptions;

import com.hillel.homeWork.lesson5.task9_exceptions.exceptions.ArrayDataException;
import com.hillel.homeWork.lesson5.task9_exceptions.exceptions.ArraySizeException;

public class Main {
    public static void main(String[] args) {

        String[][] arr = new String[][]{{"1", "2", "3", "4"}, {"1", "2", "3", "4"},
                                        {"101", "102", "103", "104"}, {"201", "202", "203", "aaa"}};

        try {
            System.out.println(ArrayValueCalculator.doCalc(arr));
        } catch (ArraySizeException e) {
            e.printStackTrace();
        } catch (ArrayDataException e) {
            e.printStackTrace();
        }
    }
}
