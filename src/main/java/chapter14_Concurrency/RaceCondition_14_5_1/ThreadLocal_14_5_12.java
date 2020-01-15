package chapter14_Concurrency.RaceCondition_14_5_1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * author lyn
 * create_date_time 2020/1/15 16:17
 */
public class ThreadLocal_14_5_12 {
    public static void main(String[] args) {
        String dateStamp = dateFormat.get().format(new Date());

        dateFormat.remove(); // set the thread to initial state
        System.out.println(dateStamp);

    }

    public static final ThreadLocal<SimpleDateFormat> dateFormat =
            ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd"));


}
