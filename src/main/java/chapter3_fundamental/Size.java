package chapter3_fundamental;

enum SizeEnum {
    S,
    M,
    L,
    XL
}

public class Size {
    public static void main(String[] args) {
        for (SizeEnum se : SizeEnum.values()) {
            System.out.print(se.name());
            System.out.print("  ");
            System.out.println(se.ordinal());
        }

    }
}


