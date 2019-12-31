package chapter7_Exception_Assert_Logging;

/**
 * author lyn
 * create_date_time 2019/12/31 21:33
 */
public class RethrowingAndChainingException_7_2_3 {

    public static void main(String[] args) throws MyExceptionReThrow, MyException {
        System.out.println("RethrowingAndChainingException_7_2_3");
        RethrowingAndChainingException_7_2_3 r = new RethrowingAndChainingException_7_2_3();
        r.CallException(16);
        r.CallException(10);
    }

    void CallException(Integer i) throws MyExceptionReThrow {
        if (i > 10) {
            System.out.println("fine");
        } else {
            try {
                this.CallAnotherException(i); // throw Exception here
            } catch (Exception e) { // and catch the Exception here!!!!

                // handle the Exception as you want
                e.printStackTrace();
                throw e;
            }
        }
    }

    void CallAnotherException(Integer i) throws MyExceptionReThrow {
        if (i > 15) {
            System.out.println("fine in another");
        } else {
            throw new MyExceptionReThrow("another Exception"); // throw Exception to upper level
        }
    }
}


class MyExceptionReThrow extends Exception {
    public MyExceptionReThrow() {
    }

    public MyExceptionReThrow(String message) {
        super(message);
    }
}