package chapter4_objects_and_classes;

public class MyClass_4_3 {
    public static void main(String[] args) {
        myClass2 mc2 = new myClass2("myClass2", 1);
        myClass mc = new myClass("myClass", 2, mc2);
        System.out.println(mc.toString());

    }
}

class myClass {
    private String field1;
    private Integer field2;
    private myClass2 mc;

    @Override
    public String toString() {
        return "myClass{" +
                "field1='" + field1 + '\'' +
                ", field2=" + field2 +
                ", mc=" + mc.toString() +
                '}';
    }

    public myClass(String field1, Integer field2, myClass2 mc) {
        this.field1 = field1;
        this.field2 = field2;
        this.mc = mc;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public Integer getField2() {
        return field2;
    }

    public void setField2(Integer field2) {
        this.field2 = field2;
    }

    public myClass2 getMc() {
        return mc;
    }

    public void setMc(myClass2 mc) {
        this.mc = mc;
    }
}

class myClass2 {
    private String field1;
    private Integer field2;

    @Override
    public String toString() {
        return "myClass2{" +
                "field1='" + field1 + '\'' +
                ", field2=" + field2 +
                '}';
    }

    public myClass2(String field1, Integer field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public Integer getField2() {
        return field2;
    }

    public void setField2(Integer field2) {
        this.field2 = field2;
    }
}
