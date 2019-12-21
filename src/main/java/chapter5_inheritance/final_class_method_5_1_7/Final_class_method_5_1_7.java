package chapter5_inheritance.final_class_method_5_1_7;

import java.time.LocalDate;
import java.util.EnumMap;

/**
 * author lyn
 * create_date_time 2019/12/22 0:02
 */
public class Final_class_method_5_1_7 {
    public static void main(String[] args) {
        Object a = new Employee("i am employee", 100.0, LocalDate.now());
        System.out.println(a.toString());
    }


}


//class Exe extends Manager{
//    // final modified class can not be extended
//}

final class Manager extends Employee {

    public Manager(String name, Double salary, LocalDate hireDate) {
        super(name, salary, hireDate);
    }

    // ---------final modified method in super class
    // can not be overridden
//    @Override
//    public void hi() {
//        System.out.println("i am Employee");
//    }
    public void Hi() {
        System.out.println("i am manager");
    }
}


class Employee {
    private String name;
    private Double salary;
    private LocalDate hireDate;

    public Employee(String name, Double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDate=" + hireDate +
                '}';
    }

    public final void hi() {
        System.out.println("i am Employee");
    }
}