package chapter9_Collections.ConcreteCollections_9_2;

import java.time.LocalDate;
import java.util.PriorityQueue;

/**
 * author lyn
 * create_date_time 2020/1/6 23:47
 */
public class PriorityQueues_9_2_6 {
    public static void main(String[] args) {

        PriorityQueue<LocalDate> pq = new PriorityQueue<>();
        pq.add(LocalDate.of(1906, 12, 9));
        pq.add(LocalDate.of(1815, 12, 10));
        pq.add(LocalDate.of(1903, 12, 3));
        pq.add(LocalDate.of(1910, 6, 22));

        for (LocalDate date : pq) System.out.println(date);
        if (!pq.isEmpty()) {
            System.out.println(pq.remove());// remove the smallest element
        }
        System.out.println(pq);
    }
}
