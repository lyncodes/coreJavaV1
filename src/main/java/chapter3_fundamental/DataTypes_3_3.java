package chapter3_fundamental;

public class DataTypes_3_3 {
    public static void main(String[] args) {
        int myInt = 2147483647; // -2147483648---->2147483647
        System.out.println(myInt + 2147483646); // overflow
    }
}