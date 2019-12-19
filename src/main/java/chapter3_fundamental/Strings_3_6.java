package chapter3_fundamental;


public class Strings_3_6 {
    public static void main(String[] args) {
        // subString
        String hello = "Hello";
        String s = hello.substring(0, 3);
        System.out.println(s);

        // concatenation
        String who = " jack";
        System.out.println(hello + who);

        // String are immutable
        // modify it with a new String that replace it
        hello = hello.substring(0, 3) + "p!";
        System.out.println(hello);

        // testing String for equality
        String hello2 = new String("Hello");
        String hello3 = new String("Hello");
        System.out.println(hello2 == hello3);
        System.out.println(hello2.equals(hello3));

        // bunch of String API waiting to be explored.


        // StringBuilder
        // each String concatenation create a obj on heap
        // inefficient
        StringBuilder sb = new StringBuilder();
        sb.append('s');
        sb.append('t');
        sb.append('r');
        sb.append('i');
        sb.append('n');
        sb.append('g');
        System.out.println(sb.toString().equals("string"));


    }
}
