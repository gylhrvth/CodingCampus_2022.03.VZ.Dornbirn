package gyula.week09.hospital;

public class Employee {
    private String name;
    protected float salary;

    public Employee(String name, float salary){
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }
}
