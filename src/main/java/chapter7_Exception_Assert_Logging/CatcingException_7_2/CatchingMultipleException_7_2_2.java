package chapter7_Exception_Assert_Logging.CatcingException_7_2;

/**
 * author lyn
 * create_date_time 2019/12/30 23:42
 */
public class CatchingMultipleException_7_2_2 {
    public static void main(String[] args) { throw1();throw2();throw3(); }
    private static void throw1() {
        try { CatchingMultipleException_7_2_2 c = new CatchingMultipleException_7_2_2();
            c.throwException1();c.throwException2();c.throwException3(); }
        catch (MultipleException1 | MultipleException2 | mulitpleException3 e) { e.printStackTrace(); }
    }
    private static void throw2() {
        try { CatchingMultipleException_7_2_2 c = new CatchingMultipleException_7_2_2();
            c.throwException2();c.throwException1();c.throwException3(); }
        catch (MultipleException1 | MultipleException2 | mulitpleException3 e) { e.printStackTrace(); }
    }
    private static void throw3() {
        try { CatchingMultipleException_7_2_2 c = new CatchingMultipleException_7_2_2();
            c.throwException3();c.throwException1();c.throwException2(); }
        catch (MultipleException1 | MultipleException2 | mulitpleException3 e) { e.printStackTrace(); }
    }
    private void throwException1() throws MultipleException1 { throw new MultipleException1(); }
    private void throwException2() throws MultipleException2 { throw new MultipleException2(); }
    private void throwException3() throws mulitpleException3 { throw new mulitpleException3(); }
}
class MultipleException1 extends Exception { }
class MultipleException2 extends Exception { }
class mulitpleException3 extends Exception { }