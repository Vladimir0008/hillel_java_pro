package com.hillel.homeWork.lesson8.task12.first_part;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadSafeList<Integer> threadSafeList =new ThreadSafeList<Integer>(new ArrayList<>());

        ThreadSafeListFlow threadSafeListFlow = new ThreadSafeListFlow("Thread1",threadSafeList);
        ThreadSafeListFlow threadSafeListFlow2 = new ThreadSafeListFlow("Thread2",threadSafeList);
        ThreadSafeListFlow threadSafeListFlow3 = new ThreadSafeListFlow("Thread3",threadSafeList);

        Thread thread1 = new Thread(threadSafeListFlow);
        Thread thread2 = new Thread(threadSafeListFlow2);
        Thread thread3 = new Thread(threadSafeListFlow3);

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        for (int i = 0; i < 30; i++) {
            System.out.println(threadSafeList.get(i));
        }
    }
}
