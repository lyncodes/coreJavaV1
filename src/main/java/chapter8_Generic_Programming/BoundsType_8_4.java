package chapter8_Generic_Programming;

import java.io.Serializable;

/**
 * author lyn
 * create_date_time 2020/1/2 20:38
 */
public class BoundsType_8_4 {
    public static void main(String[] args) {
        Exception a = BoundType.middle(
                new Exception("1Exception"),
                new Exception("2Exception"),
                new Exception("3Exception")
        );
        a.printStackTrace();
    }
}


class BoundType {
    @SafeVarargs
    public static <T extends Exception> T middle(T... a) {

        // <T extends Exception> indicate the T
        // must be the subclasses of Exception due to the extends
        return a[a.length / 2];
    }
}
