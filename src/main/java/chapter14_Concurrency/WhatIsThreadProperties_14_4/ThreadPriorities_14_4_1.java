package chapter14_Concurrency.WhatIsThreadProperties_14_4;

import java.util.Random;

/**
 * author lyn
 * create_date_time 2020/1/12 14:23
 */
public class ThreadPriorities_14_4_1 {
    public static void main(String[] args) throws InterruptedException {
        Random ran = new Random();

        Runnable r = () -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("new thread" + i);
                try {
                    Thread.sleep(ran.nextInt(50) + 50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t = new Thread(r);
        t.setPriority(1); // new thread will be slightly slower
        // because there is only 2 thread waiting to be scheduled
        t.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("main thread" + i);
            Thread.sleep(ran.nextInt(50) + 50);
        }
    }
}
