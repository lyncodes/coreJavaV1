package chapter6_Interface_Lambda_InnerClass.interface_6_1;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * author lyn
 * create_date_time 2019/12/25 21:16
 */
public class Interface_6_1_1 {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("name1", 25000.0);
        staff[1] = new Employee("name2", 50000.0);
        staff[2] = new Employee("name3", 28000.0);


//        ArrayList<Employee> staff = new ArrayList<>();
//        staff.add(new Employee("name1",25000.0));
//        staff.add(new Employee("name2",50000.0));
//        staff.add(new Employee("name3",28000.0));

        Arrays.sort(staff);


        for (Employee e : staff) {
            System.out.println(e.toString());
        }
    }
}

@AllArgsConstructor
@ToString
class Employee implements Comparable {

    // all methods in a interface are public

    private String name;
    private double salary;


    @Override
    public int compareTo(Object other) {

        // override the compareTo to customize the
        // comparison logic, by salary in this case
        Employee o = (Employee) other;
        return Double.compare(salary, o.salary);
    }

}

