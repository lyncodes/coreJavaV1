package chapter14_Concurrency.WhatIsThread_14_1;

import java.util.Random;

/**
 * author lyn
 * create_date_time 2020/1/11 21:53
 */
public class UsingThreads_14_1_1 {
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
//        t.run();  do not use run
        // run will execute in the current thread
        t.start();
        // only start() will form a new thread
        for (int i = 0; i < 1000; i++) {
            System.out.println("main thread" + i);
            Thread.sleep(ran.nextInt(50) + 50);
        }
    }
}
