package chapter14_Concurrency.RaceCondition_14_5_1;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * author lyn
 * create_date_time 2020/1/16 9:56
 */
public class ReentrantReadWriteLock_14_5_14 {
    public static void main(String[] args) {
        System.out.println("ReentrantReadWriteLock_14_5_14");
        ReentrantReadWriteLock_14_5_14 r = new ReentrantReadWriteLock_14_5_14();
        r.getTotalBalance();
        r.transfer();
    }

    private ReentrantReadWriteLock rwl  = new ReentrantReadWriteLock();
    private ReentrantReadWriteLock.ReadLock readLock = rwl.readLock();
    private ReentrantReadWriteLock.WriteLock wrriteLock = rwl.writeLock();

    public double getTotalBalance(){
        readLock.lock();
        try{
            return 1000.0;
        }finally {
            readLock.unlock();
        }
    }

    public void transfer(){
        wrriteLock.lock();
        try {
            System.out.println("transfer done");
        }finally {
            wrriteLock.unlock();
        }
    }
}
