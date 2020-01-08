package chapter9_Collections.Maps_9_3;

import java.util.LinkedHashMap;

/**
 * author lyn
 * create_date_time 2020/1/8 23:02
 */
public class LinkedHashMap_9_3_5 {
    public static void main(String[] args) {
        LinkedHashMap<String, Employee> lh = new LinkedHashMap<>();
        lh.put("1", new Employee("a"));
        lh.put("3", new Employee("c"));
        lh.put("2", new Employee("b"));

        for (Employee e : lh.values()) {
            System.out.println(e);
        }
    }
}

