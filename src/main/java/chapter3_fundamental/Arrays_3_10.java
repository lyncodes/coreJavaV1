package chapter3_fundamental;

import java.util.Arrays;

public class Arrays_3_10 {
    public static void main(String[] args) {
        // init
        int[] a = new int[100];
        for (int i = 0; i < 100; i++) {
            a[i] = i;
        }
        System.out.println(Arrays.toString(a));


        // for each loop
        for (int value : a) {
            System.out.println(value);
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }


        // array sorting
        for (int i = 0; i < 100; i++) {
            a[i] = (int) (Math.random() * 10);
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
