package chapter9_Collections.JavaCollectionFramework_9_1.ConcreteCollections_9_2;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * author lyn
 * create_date_time 2020/1/6 20:22
 */
public class TreeSet_9_2_4 {
    public static void main(String[] args) {
        TreeSet<String> ss = new TreeSet<>();
        ss.add("1");
        ss.add("5");
        ss.add("6");
        ss.add("3");

        for(String s:ss){
            // iterator element in Treeset in order
            // that dependend the implementation of compareTo method.
            System.out.println(s);
        }
        //

    }

}
