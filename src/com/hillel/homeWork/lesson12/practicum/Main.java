package com.hillel.homeWork.lesson12.practicum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {2,3,6,1,8,3,8,5,9,12};
        Sorting sorting = new Sorting();
        sorting.sort(array);
        System.out.println(Arrays.toString(sorting.sort(array)));

    }

}
