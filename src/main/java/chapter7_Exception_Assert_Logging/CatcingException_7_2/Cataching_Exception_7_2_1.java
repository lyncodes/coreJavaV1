package chapter7_Exception_Assert_Logging.CatcingException_7_2;

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
        } catch (ArithmeticException e) {
            // c.CallException(9) will throw a MyException that defined before
            // if the Exception type can't match the Exception that thrown out
            // the code will not continue to execute

            // it will not printStackTrace & re-throw the Exception to upper level
            // Exception handler in this case
            e.printStackTrace();
            throw e;
        }
    }
}
