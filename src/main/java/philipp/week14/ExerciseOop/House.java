package philipp.week14.ExerciseOop;

import java.util.List;
import java.util.Vector;

public class House {

    private String name;
    private int doors;
    private int windows;
    private String address;
    private List<Person> persons = new Vector<>();

    public House(String name, int doors, int windows, String address) {
        this.name = name;
        this.doors = doors;
        this.windows = windows;
        this.address = address;
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public void removePerson(Person person) {
        persons.remove(person);
    }

    @Override
    public String toString() {
        return "Name: " + name +
                "\nNumber of doors: " + doors +
                "\nNumber of windows: " + windows +
                "\nAddress: " + address +
                "\nPersons living in this house:" +
                printPersons(persons);
    }

    private String printPersons(List<Person> persons) {
        StringBuilder s = new StringBuilder();
        for (Person p : persons) {
            s.append(p.toString());
        }
        return s.toString();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
