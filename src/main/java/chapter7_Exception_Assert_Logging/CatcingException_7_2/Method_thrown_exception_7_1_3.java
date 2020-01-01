package chapter7_Exception_Assert_Logging.CatcingException_7_2;

/**
 * author lyn
 * create_date_time 2019/12/28 0:01
 */
public class Method_thrown_exception_7_1_3 {
    public static void main(String[] args) {
        Method_thrown_exception_7_1_3 m = new Method_thrown_exception_7_1_3();
        m.throwException(5);
        m.throwException(10);
    }

    public void throwException(Integer i) {
        if (i < 10) {
            System.out.println("no exception");
        } else {
            String reason = "the Exception number input is " + i;
            throw new ArithmeticException(reason);
        }
    }
}
