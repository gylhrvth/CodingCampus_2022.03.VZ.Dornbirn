package gyula.week09.hospital;

import java.util.Vector;

public class HospitalMain {
    public static void main(String[] args) {
        Vector<Employee> employees = new Vector<>();
        employees.add(new Employee("Raplh", 100f));
        employees.add(new Doctor("Dr. Roger", 123f, "A00001"));

        for (Employee e: employees){
            System.out.println(e);
        }
    }
}
