package com.hillel.homeWork.lesson8.task11;

public class ValueCalculator {
    private float[] array = new float[1000000];
    private int arraySize = array.length;
    private int halfArraySize = array.length / 2;

    public void doCalc() throws InterruptedException {
        long start = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            array[i] = 1.0f;
        }
        float[] partArray1 = new float[halfArraySize];
        float[] partArray2 = new float[halfArraySize];
        System.arraycopy(array, 0, partArray1, 0, halfArraySize);
        System.arraycopy(array, halfArraySize, partArray2, 0, halfArraySize);
        Thread thread1 = new Thread(new ArrayCalcThread(partArray1));
        Thread thread2 = new Thread(new ArrayCalcThread(partArray2));
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.arraycopy(partArray1, 0, array, 0, halfArraySize);
        System.arraycopy(partArray2, 0, array, halfArraySize, halfArraySize);
        System.out.println(System.currentTimeMillis() - start);
    }

    public float[] getArray() {
        return array;
    }

    public void setArray(float[] array) {
        this.array = array;
    }

    public int getArraySize() {
        return arraySize;
    }

    public void setArraySize(int arraySize) {
        this.arraySize = arraySize;
    }

    public int getHalfArraySize() {
        return halfArraySize;
    }

    public void setHalfArraySize(int halfArraySize) {
        this.halfArraySize = halfArraySize;
    }
}
