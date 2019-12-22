package chapter5_inheritance.class_superclass_subclass_5_1;

import java.time.LocalDate;

/**
 * author lyn
 * create_date_time 2019/12/21 21:45
 */
public class Class_superclass_subclass_5_1 {
    public static void main(String[] args) {
        System.out.println("class_superclass_subclass demonstration");
        Manager boss = new Manager("lyn", 80000.0, LocalDate.parse("2019-01-02"), 12.0);
        System.out.println(boss.toString());
        boss.setBonus(5000.0);
        System.out.println(boss.toString());

    }
}


class Employee {
    private String name;
    private Double salary;
    private LocalDate hireDate;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDate=" + hireDate +
                '}';
    }

    public Employee() {

    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public Employee(String name, Double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }
}

class Manager extends Employee {
    private Double bonus;

    public Manager() {
        super();
    }

    public Manager(String name, Double salary, LocalDate hireDate) {
        super(name, salary, hireDate);
    }

    public Manager(String name, Double salary, LocalDate hireDate, Double bonus) {
        super(name, salary, hireDate);
        this.bonus = bonus;
    }

    @Override
    public Double getSalary() {
        return this.bonus + super.getSalary();
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() { //override here
        return "Manager{" +
                "bonus=" + bonus +
                "} " + "Employee{" +
                "name='" + super.getName() + '\'' +
                ", salary=" + this.getSalary() +
                ", hireDate=" + super.getHireDate() +
                '}';
    }
}