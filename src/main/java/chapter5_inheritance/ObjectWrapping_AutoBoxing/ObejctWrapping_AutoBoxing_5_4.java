package chapter5_inheritance.ObjectWrapping_AutoBoxing;

import java.beans.AppletInitializer;
import java.util.ArrayList;

/**
 * author lyn
 * create_date_time 2019/12/24 21:13
 */
public class ObejctWrapping_AutoBoxing_5_4 {
    public static void main(String[] args) {
        System.out.println("ObejctWrapping_AutoBoxing_5_4");


        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        // 2 statements are equaled, this is called autoBoxing
        integerArrayList.add(Integer.valueOf(1));
        // autoBoxing here

        int i = integerArrayList.get(1);
        // autoUnboxing here
        int j = integerArrayList.get(1).intValue();
        System.out.println("i: " + i + " j: " + j);

        System.out.println(integerArrayList);

        Integer k = 3;
        k++;
        // wrapper support arithmetic
        // autoBoxing & autoUnboxing support by Compiler here
        System.out.println(k);

        Integer a = 100;
        Integer b = 100;
        System.out.println(a == b); // unBoxing here.
        System.out.println(a.equals(b)); // equals are the best choice


        // convert string into a number

        int x = Integer.parseInt("123"); // parseInt is a static method
        System.out.println(x);


    }
}
