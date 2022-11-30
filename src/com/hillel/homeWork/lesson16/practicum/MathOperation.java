package com.hillel.homeWork.lesson16.practicum;

public class MathOperation {
    ItemSource itemSource;

    public MathOperation(ItemSource itemSource) {
        this.itemSource = itemSource;
    }

    public int sum() {
        int result = 0;
        for (Integer i : itemSource.getItems()) {
            result += i;
        }
        return result;
    }

    public int avg() {
        int result = 0;
        for (Integer i : itemSource.getItems()) {
            result += i;
        }
        return  result / itemSource.getItems().size();
    }

    public int max() {
        int result = Integer.MIN_VALUE;
        for (Integer i : itemSource.getItems()) {
            if (i >= result) {
                result = i;
            }
        }
        return result;
    }
}


