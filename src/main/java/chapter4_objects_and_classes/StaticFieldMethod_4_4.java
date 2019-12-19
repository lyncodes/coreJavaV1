package chapter4_objects_and_classes;

public class StaticFieldMethod_4_4 {
    public static void main(String[] args) {
        System.out.println("Static field & method");

        Employee e = new Employee(1);
        //  class static field, access by class name
        System.out.println(Employee.getNextId());
        e.setId(10);
        // nextId becomes 2
        System.out.println(Employee.getNextId());


        // static method
        System.out.println(Employee.say());
    }
}

class Employee {
    // static field belongs to class, not instance
    private static int nextId = 1;
    private int id;

    public static int getNextId() {
        return nextId;
    }

    public Employee(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        nextId++;
    }


    // static method is method that do not operate on object
    public static String say() {
        return "Hello ";
    }
}