package chapter7_Exception_Assert_Logging;

import java.util.Arrays;

/**
 * author lyn
 * create_date_time 2019/12/30 0:08
 */
public class Cataching_Exception_7_2_1 {
    public static void main(String[] args) throws Exception {
        System.out.println("catching an Exception");


        // any code inside the try block throws an Exception
        // will be caught in the catch block
        try {
            Create_Exception_7_1_4 c = new Create_Exception_7_1_4();
            c.CallException(11);
        } catch (MyException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }

        try {
            Create_Exception_7_1_4 c = new Create_Exception_7_1_4();
            c.CallException(9);
        } catch (MyException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
