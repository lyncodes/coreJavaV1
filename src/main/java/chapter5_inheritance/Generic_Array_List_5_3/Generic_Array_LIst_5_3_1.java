package chapter5_inheritance.Generic_Array_List_5_3;

import lombok.*;

import java.util.ArrayList;

/**
 * author lyn
 * create_date_time 2019/12/24 18:01
 */
public class Generic_Array_LIst_5_3_1 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>(2);
        // capacity is 2, and it will adjust the real data amount

        System.out.println("size: " + employees.size()); // 2
        employees.add(new Employee("jack", 18, 1));
        employees.add(new Employee("jack2", 19, 2));
        employees.add(new Employee("jack3", 20, 3));
        employees.add(new Employee("jack4", 21, 4));

        for (Employee e : employees) {
            System.out.println(e.toString()); // toString
        }
        System.out.println("size: " + employees.size()); // size 4

        employees.set(0, new Employee("set name", 123, 111));
        // replace element in position with another one

        employees.get(1).setName("jack new");
        // edit element in original position


        for (Employee e : employees) {
            System.out.println(e.toString());
        }

//        add elements in the middle

        employees.add(1, new Employee("add in the middle", 100, 1));
        // add a element in specific position

        for (Employee e : employees) {
            System.out.println(e.toString());
        }

        employees.remove(1);
        // remove element in specific position

        for (Employee e : employees) {
            System.out.println(e.toString());
        }

    }
}

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
class Employee {
    private String name;
    private Integer age;
    private Integer id;
}
