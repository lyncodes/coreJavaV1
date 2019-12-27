package chapter6_Interface_Lambda_InnerClass.interface_6_1;

import lombok.AllArgsConstructor;
import lombok.ToString;

/**
 * author lyn
 * create_date_time 2019/12/26 23:02
 */
public class Interface_with_static_method  {
    public static void main(String[] args) {
        MyClass m = new MyClass("myNmae");
        m.introduce();
        System.out.println(m.toString());
        InterfaceWithStaticMethod.hi();
    }
}


@ToString
@AllArgsConstructor
class MyClass implements InterfaceWithStaticMethod {
    private String name;

    @Override
    public void introduce() {
        System.out.println("implement the method declared in the interface");
    }
}


interface InterfaceWithStaticMethod {
    // add static method inside interface
    // to use it as a abstract class
    // the spirit of interfaces as abstract specifications.
    static void hi() {
        System.out.println("this is a static method inside a interface");
    }

    void introduce();
}