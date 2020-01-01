package chapter7_Exception_Assert_Logging.CatcingException_7_2;

/**
 * author lyn
 * create_date_time 2019/12/31 23:12
 */
public class Finally_7__2_4 {
    public static void main(String[] args) {
        System.out.println("finally clause");

        try{
            System.out.println("open resource");
            // business code
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("close resource");
        }

    }
}
