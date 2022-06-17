package philipp.week14.ExerciseOop;

import java.util.List;

public class SortedHouse extends House {

    public SortedHouse(String name, int doors, int windows, String address) {
        super(name, doors, windows, address);
    }


    public void addPerson(Person person) {
        getPersons().add(person);
        List<Person> l = this.getPersons();
        for (int i = 0; i < l.size() - 1; i++) {
            for (int j = 0; j < l.size() - 1 - i; j++) {
                if (l.get(j).getName().compareTo(l.get(j + 1).getName()) > 0) {
                    Person swap = l.get(j);
                    l.set(j, l.get(j + 1));
                    l.set(j + 1, swap);
                }
            }
        }
    }
}
