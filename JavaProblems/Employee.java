package JavaProblems;

public class Employee {
    private String name;
    private int salary;

    public Employee (String n, int s) {
        this.name = n;
        this.salary = s;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String toString(){
        return "Employee{name='"+ name +"', salary=" + salary + "}";
    }
    
}
