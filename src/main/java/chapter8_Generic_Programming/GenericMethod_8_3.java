package chapter8_Generic_Programming;

/**
 * author lyn
 * create_date_time 2020/1/2 20:03
 */
public class GenericMethod_8_3 {
    public static void main(String[] args) {
        String a = MyGenericMethod.getMiddle(
                "adsd",
                "dsadsad",
                "2131");
        System.out.println(a);
    }
}

class MyGenericMethod {
    @SafeVarargs
    public static <T> T getMiddle(T... a) {
        // <T> parameter type
        // T return typr
        return a[a.length / 2];
    }
}