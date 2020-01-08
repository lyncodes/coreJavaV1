package chapter8_Generic_Programming;

import lombok.*;

/**
 * author lyn
 * create_date_time 2020/1/1 23:20
 */


public class DefiningGenericClass_8_2 {
    public static void main(String[] args) {
        MyGeneric<Integer> dg = new MyGeneric<>();
        dg.setX(12);
        dg.setY(13);
        System.out.println(dg.toString());

        MyGeneric<Double> dg2 = new MyGeneric<>();
        dg2.setX(12.0);
        dg2.setY(13.0);
        System.out.println(dg2.toString());


        SeparateGeneric<String, Integer> sg = new SeparateGeneric<>("12",12);
        System.out.println(sg.toString());
    }



}

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
class MyGeneric<T>{
    private T x;
    private T y;
}

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
class SeparateGeneric<T,U>{
    // using T U to specify multiple type of parameter
    private T x;
    private U y;
}