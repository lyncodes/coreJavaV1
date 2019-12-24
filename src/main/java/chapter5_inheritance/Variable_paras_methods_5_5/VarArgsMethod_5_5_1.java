package chapter5_inheritance.Variable_paras_methods_5_5;

import java.util.ArrayList;

/**
 * author lyn
 * create_date_time 2019/12/24 23:15
 */
public class VarArgsMethod_5_5_1 {
    public static void main(String[] args) {
        System.out.println("VarArgsMethod_5_5_1");

        System.out.println(max(1, 2, 3, 4, 5, 6, 6, 7, 7));
        System.out.println(sum(1, 2, 3, 4, 4, 5, 6, 6));


        double[] a = {1.0, 2.0};
        // java support passing a array to a method
        // that accept variable paras method
        System.out.println(sum(a));
    }

    static double max(double... values) {
        // using ... to indicate the method support variable params
        double LARGEST = Double.NEGATIVE_INFINITY;
        for (double v : values) {
            if (v > LARGEST) {
                LARGEST = v;
            }
        }
        return LARGEST;
    }

    static double sum(double... values) {
        // sum method using variable paras
        double sum = 0.0;
        for (double v : values) {
            sum += v;
        }
        return sum;
    }


}


