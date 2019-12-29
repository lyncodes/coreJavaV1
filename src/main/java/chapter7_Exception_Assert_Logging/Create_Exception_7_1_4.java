package chapter7_Exception_Assert_Logging;

import java.io.IOException;

/**
 * author lyn
 * create_date_time 2019/12/29 16:15
 */
public class Create_Exception_7_1_4 {
    public static void main(String[] args) throws MyException {
        System.out.println("Create an Exception");
        Create_Exception_7_1_4 c = new Create_Exception_7_1_4();
        c.CallException(11);
        c.CallException(5);

    }

    public void CallException(Integer i) throws MyException {
        if (i > 10) {
            System.out.println("fine");
        } else {
            throw new MyException("a new Exception with: " + i);
        }
    }
}


class MyException extends IOException {
    /**
     * Constructs an {@code IOException} with {@code null}
     * as its error detail message.
     */
    public MyException() {
    }

    /**
     * Constructs an {@code IOException} with the specified detail message.
     *
     * @param message The detail message (which is saved for later retrieval
     *                by the {@link #getMessage()} method)
     */
    public MyException(String message) {
        super(message);
    }
}
