package gyula.week09.hospital;


import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class HospitalMain {
    public static void main(String[] args) {
        Vector<Employee> employees = new Vector<>();
        employees.add(new Employee("Raplh", 100f));
        employees.add(new Doctor("Dr. Roger", 123f, "A00001"));
        employees.add(new SportMedicine("Dr. Drextex", 200f, "ABC", "Streeetball"));

        List<Doctor> doctors = new ArrayList<>();

        for (Employee e: employees){
            e.sayHello();
            if (e instanceof Doctor) {
                doctors.add((Doctor)e);
            }
        }
        System.out.println(doctors);
    }
}
