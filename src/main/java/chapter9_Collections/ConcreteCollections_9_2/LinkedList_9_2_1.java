package chapter9_Collections.ConcreteCollections_9_2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * author lyn
 * create_date_time 2020/1/5 21:20
 */
public class LinkedList_9_2_1 {
    public static void main(String[] args) {
        List<String> a = new LinkedList<>();
        a.add("Amy");
        a.add("Carl");
        a.add("Erica");

        List<String> b = new LinkedList<>();
        b.add("Bob");
        b.add("Doug");
        b.add("Frances");
        b.add("Gloria");

        ListIterator<String> aIter = a.listIterator();
        Iterator<String> bIter = b.iterator();

        while (bIter.hasNext()){
            if (aIter.hasNext()){
                aIter.next();
            }
            aIter.add(bIter.next());
        }

        System.out.println(a);

        bIter = b.iterator();
        while (bIter.hasNext()){
            bIter.next();
            if (bIter.hasNext()){
                bIter.next();
                bIter.remove();
            }
        }
        System.out.println(b);

        a.removeAll(b);
        System.out.println(a);
    }
}
