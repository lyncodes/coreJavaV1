package chapter5_inheritance.Reflection_5_7;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Random;

/**
 * author lyn
 * create_date_time 2019/12/25 19:42
 */
public class Reflection_5_7 {
    public static void main(String[] args) throws
            ClassNotFoundException, IllegalAccessException, InstantiationException {
        Employee e = new Employee("hello");

//        public final native Class<?> getClass();
        Class cl = e.getClass();
        System.out.println(cl);


        System.out.println(e.getClass().getName() + "----" + e.getName());


        String className = "chapter5_inheritance.Reflection_5_7.Employee";
        Class cl2 = Class.forName(className);
        System.out.println(cl2.getClass().getName());
    }


}


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
class Employee {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
