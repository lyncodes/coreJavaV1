package chapter4_objects_and_classes;

import java.time.LocalDate;

public class ObjectConstruction_4_6 {
    public static void main(String[] args) {
        EmployeeConstructor ec = new EmployeeConstructor();
        System.out.println(ec.toString());

        EmployeeConstructor ec2 = new EmployeeConstructor("name");
        System.out.println(ec2.toString());

        EmployeeConstructor ec3 = new EmployeeConstructor(18);
        System.out.println(ec3.toString());
    }
}

class EmployeeConstructor {
    private String name;
    private String gender;
    private Integer age;
    private LocalDate hireDate;
    
    static {
        // here initialization block
        System.out.println("running in initialization block");
        System.out.println("initialization block runs before any constructor");
    }

    @Override
    public String toString() {
        return "EmployeeConstructor{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", hireDate=" + hireDate +
                '}'+"\n\n";
    }

    public EmployeeConstructor(String name, String gender, Integer age, LocalDate hireDate) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.hireDate = hireDate;
        System.out.println("full args constructor runs");
    }

    public EmployeeConstructor() {
        // if there exists argument-required constructor
        //error happened when calling non argument constructor
        System.out.println("non args constructor runs");
    }

    public EmployeeConstructor(String name) {
        this.name = name;
        System.out.println("one arg constructor runs");
    }

    public EmployeeConstructor(Integer age) {
        // calling another constructor from one constructor
        this("default name", "default gender", age, LocalDate.now());
        System.out.println("another constructor called by constructor runs");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
}



