package chapter5_inheritance.Object_cosmic_superclass_5_2;

import java.util.Objects;

/**
 * author lyn
 * create_date_time 2019/12/22 21:55
 */
public class Equals_5_2_1 {
    public static void main(String[] args) {
        String s = "Hello ";
        System.out.println(s.hashCode());
    }
}


class Employee {
    private String name;
    private Integer age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        // compare the pointer address, if == , identical
        // 指向内存中同一地址,肯定是同一对象,也就相等了
        // 优先比对内存地址,而不用去比较字段,算是一种优化

        if (o == null) return false;
        // if o is null, inequality is for sure


        if (getClass() != o.getClass()) return false;
        // if not the same class type, false for sure

        Employee employee = (Employee) o; // type casting
        return name.equals(employee.name) &&
                age.equals(employee.age);
        // return true if all fields are equals
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
