package gyula.week09.hospital;

public class Doctor extends Employee {
    private String licenceNr;

    public Doctor(String name, float salary, String licenceNr){
        super(name, salary);
        this.licenceNr = licenceNr;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + getName() + '\'' +
                ", salary='" + salary + '\'' +
                ", licenceNr='" + licenceNr + '\'' +
                '}';
    }
}
