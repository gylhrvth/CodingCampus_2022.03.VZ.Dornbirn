package philipp.week14.ExerciseOop;

public class PersonsMain {
    static Person[] persons = {
            new Person("Tom", 35, Person.GENDER.MALE),
            new Person("Jim", 43, Person.GENDER.MALE),
            new Person("Frank", 21, Person.GENDER.DIVERS),
            new Person("Carol", 77, Person.GENDER.DIVERS),
            new Person("Lisa", 23, Person.GENDER.FEMALE),
            new Person("Maria", 39, Person.GENDER.FEMALE)
    };
    static House[] houses = {
            new House("house1", 8, 15, "Gutmannsweg 3, Schruns"),
            new House("house2", 9, 23, "Hauptstrasse 7, Feldkirch"),
            new House("house3", 4, 9, "Schmale Gasse 1, Dornbirn")

    };
    static SortedHouse[] sortedHouses = {
            new SortedHouse("house4", 6, 24, "Hutstrasse 3, Schruns"),
            new SortedHouse("house5", 5, 19, "Flohweg 7, Feldkirch"),
            new SortedHouse("house6", 9, 11, "Langer Weg 1, Dornbirn")
    };

    public static void main(String[] args) {

        houses[0].addPerson(persons[0]);
        houses[0].addPerson(persons[4]);
        houses[1].addPerson(persons[2]);
        houses[1].addPerson(persons[5]);
        houses[1].addPerson(persons[3]);
        houses[2].addPerson(persons[1]);
        sortedHouses[0].addPerson(persons[0]);
        sortedHouses[0].addPerson(persons[4]);
        sortedHouses[1].addPerson(persons[5]);
        sortedHouses[1].addPerson(persons[2]);
        sortedHouses[1].addPerson(persons[3]);
        sortedHouses[2].addPerson(persons[1]);
        printHouses();
    }

    private static void printHouses() {
        for (House h : houses) {
            System.out.println(h);
            System.out.println();
        }
        System.out.println("----");
        for (House h : sortedHouses) {
            System.out.println(h);
            System.out.println();
        }
    }
}
