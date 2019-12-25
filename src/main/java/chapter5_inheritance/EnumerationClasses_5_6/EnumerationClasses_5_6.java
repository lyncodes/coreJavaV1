package chapter5_inheritance.EnumerationClasses_5_6;

import com.sun.corba.se.impl.interceptors.PINoOpHandlerImpl;
import lombok.ToString;

import java.util.Arrays;

/**
 * author lyn
 * create_date_time 2019/12/24 23:36
 */
public class EnumerationClasses_5_6 {

    public static void main(String[] args) {

        Size mySize = Size.MEDIUM;  // field in enum has type of the enum class
        System.out.println(mySize.getClass()); // return its class
        System.out.println(mySize.toString()); // toString will return its field name, (String Type)


        System.out.println(Arrays.toString(Size.values()));

        System.out.println(Size2.SMALL.toString()); // single field to String

        System.out.println(Enum.valueOf(Size2.class, "SMALL"));
        // using field name to fetch the field inside enum class
        //

        // ordinal return the index, started from 0
        // not recommended
        System.out.println(Size.X_LARGE.ordinal());

        for (Size2 s : Size2.values()) {
            System.out.print(s.name()); // return single Size2 type element's name
            System.out.print("--");
            System.out.print(s.getDes()); // the des para inside each element
            System.out.print("--");
            System.out.println(s.getNum()); // another para
        }
    }
}


enum Size {
    // 4 instance in the enum class
    // can't construct a new obj from a enum class
    // simply using == is enough
    SMALL,
    MEDIUM,
    LARGE,
    X_LARGE
}

enum Size2 {
    SMALL("S", "0"),
    MEDIUM("M", "5"),
    LARGE("L", "10"),
    X_LARGE("XL", "15");


    // these field are required in the enum class initialization
    // using custom methods to manipulate them
    private String des;
    private String num;


    public String getDes() {
        return des;
    }

    public String getNum() {
        return num;
    }

    // constructor is a must
    Size2(String des, String num) {
        this.des = des;
        this.num = num;
    }
}