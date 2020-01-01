package chapter7_Exception_Assert_Logging.Logging_7_5;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * author lyn
 * create_date_time 2020/1/1 22:09
 */
public class BasicLogging_7_5_1 {
    public static void main(String[] args) {
        System.out.println("BasicLogging_7_5_1");
        Logger.getGlobal().info("first logging");
        Logger.getGlobal().setLevel(Level.OFF);
        Logger.getGlobal().info("second logging");
    }
}
