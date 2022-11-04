package com.hillel.homeWork.lesson8.task12.first_part;

import java.util.ArrayList;

public class ThreadSafeListFlow implements Runnable {
    private String name;
    private ThreadSafeList<Integer> threadSafeList1 = new ThreadSafeList<>(new ArrayList<>());

    public ThreadSafeListFlow(ThreadSafeList<Integer> threadSafeList1) {
        this.threadSafeList1 = threadSafeList1;
    }

    public ThreadSafeListFlow(String name, ThreadSafeList<Integer> threadSafeList1) {
        this.name = name;
        this.threadSafeList1 = threadSafeList1;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
                    threadSafeList1.add(i);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
            }
        }
    }
}

