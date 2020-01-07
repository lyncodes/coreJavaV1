package chapter9_Collections.Maps_9_3;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.function.BiConsumer;

/**
 * author lyn
 * create_date_time 2020/1/7 10:44
 */
public class BasicMapOps_9_3_1 {
    public static void main(String[] args) {
        System.out.println("BasicMapOps_9_3_1");
        HashMap<String, Employee> hashMap = new HashMap<>();
        hashMap.put("1", new Employee("1"));
        hashMap.put("5", new Employee("2"));
        hashMap.put("3", new Employee("3"));
        hashMap.put("3", new Employee("4")); // overridden here
        hashMap.put("2", new Employee("4"));
        System.out.println(hashMap);
        hashMap.remove("3");
        System.out.println(hashMap);

        System.out.println("-------------");
        TreeMap<String, Employee> treeMap = new TreeMap<>();
        treeMap.put("1", new Employee("1"));
        treeMap.put("5", new Employee("2"));
        treeMap.put("3", new Employee("3"));
        treeMap.put("3", new Employee("4")); // overridden here
        treeMap.put("2", new Employee("4"));
        System.out.println(treeMap);

    }
}

@AllArgsConstructor
@ToString
class Employee {
    private String name;
}
