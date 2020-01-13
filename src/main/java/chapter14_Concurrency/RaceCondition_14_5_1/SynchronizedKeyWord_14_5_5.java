package chapter14_Concurrency.RaceCondition_14_5_1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * author lyn
 * create_date_time 2020/1/13 23:54
 */
public class SynchronizedKeyWord_14_5_5 {
    public static void main(String[] args) throws InterruptedException {
        SynchronizedKeyWord_14_5_5 synchronizedKeyWord_14_5_5 = new SynchronizedKeyWord_14_5_5();
        synchronizedKeyWord_14_5_5.myNormalMethod();
        synchronizedKeyWord_14_5_5.mySyncMethod();
    }


    public synchronized void mySyncMethod() throws InterruptedException {
        wait(); //wait on intrinsic object lock
        System.out.println("hello");
        notifyAll(); // notify all thread waiting on the condition
    }


    public void myNormalMethod() {
        Lock lock = new ReentrantLock();
        lock.lock();
        try {
            System.out.println("hello");
        } finally {
            lock.unlock();
        }
    }
}
