package chapter5_inheritance.abstractClass_5_1_9;

/**
 * author lyn
 * create_date_time 2019/12/22 13:25
 */
public abstract class AbstractClass_5_1_9 {
    public static void main(String[] args) {
        Person p = new Student("mike is a student", "engineer");
        System.out.println(p.getDescription());
    }

}


abstract class Person {
    // class that has abstract method must be abstract class
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String getDescription();
}


class Student extends Person {
    private String major;

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    public Student(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "i am a student major in " + this.major;
    }
}