package chapter7_Exception_Assert_Logging.CatcingException_7_2;

import java.io.Closeable;
import java.io.IOException;

/**
 * author lyn
 * create_date_time 2020/1/1 12:42
 */
public class TryWithResource_7_2_5 {
    public static void main(String[] args) throws Exception {
        System.out.println("TryWithResource_7_2_5");

        try (MyConnection mc = new MyConnection()) {
            mc.send(15);
            mc.send(9);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


class MyConnection implements Closeable {

    // an Object that need to be autoRecycle the resource
    // must implement the Closable interface.`
    @Override
    public void close() {
        System.out.println("Now release the resource.");
    }

    public void send(Integer i) throws Exception {
        System.out.println("sent data");
        if (i > 10) {
            System.out.println("fine");
        } else {
            throw new Exception("new Exception");
        }
    }
}