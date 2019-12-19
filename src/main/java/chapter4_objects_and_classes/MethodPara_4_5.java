package chapter4_objects_and_classes;

public class MethodPara_4_5 {
    public static void main(String[] args) {
        int i = 10;
        tripleValue(i);
        System.out.println(i);

        Employee e = new Employee(1);
        System.out.println(e.getId());
        tripleSalary(e);
        System.out.println(e.getId());


    }

    //     Java  uses call by value.
    //     means  the method gets a copy of  parameter values
    public static void tripleValue(double x) // doesn't work
    {
        x = 3 * x;
    }

    public static void tripleSalary(Employee x) // works
    {
        x.idTriple();
    }
}


