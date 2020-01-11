package chapter14_Concurrency.WhatIsThread_14_1;

/**
 * author lyn
 * create_date_time 2020/1/11 21:32
 */
public class ThreadSleep {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 9; i < 100; i++) {
            System.out.println(i);
// thread sleep
            Thread.sleep(100);
        }
    }
}
