package lukas.week7.day4.reflexiv;

public class Person {
    private String name;

    private Person mama;
    private Person papa;

    public Person(String name) {
        this.name = name;
    }

    public void setMama(Person mama) {
        this.mama = mama;
    }

    public void setPapa(Person papa) {
        this.papa = papa;
    }

    public String toString(String indention) {
        String output = indention + "";
        output += name;
        if (mama != null || papa != null) {
            output += indention + "\n" +indention+ "Parents:\n";
            if (mama != null) {
                output += indention + " Mama: " + mama.toString(indention + "  ") + "\n";
            }
            if (papa != null) {
                output += indention + " Papa: " + papa.toString(indention + "  ") + "\n";
            }
        }
        return output;
    }

    @Override
    public String toString() {
        return toString("");
    }

    public static void main(String[] args) {
        Person p = new Person("Timokant");

        Person pm = new Person("Timokants mama");
        Person pp = new Person("Timokants papa");

        Person pmm = new Person("Timokants mamaseitige oma");
        Person pmp = new Person("Timokants mamaseitiger opa");

        Person ppm = new Person("Timokants papaseitege oma");
        Person ppp = new Person("Timokants papaseitger opa");

        p.setMama(pm);
        p.setPapa(pp);

        pm.setMama(pmm);
        pm.setPapa(pmp);

        pp.setMama(ppm);
        pp.setPapa(ppp);

        System.out.println(p);
    }
}
