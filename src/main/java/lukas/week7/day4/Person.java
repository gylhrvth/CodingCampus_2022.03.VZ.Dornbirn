package lukas.week7.day4;

import java.util.List;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("Mein Name ist: " + name);
    }

    public static void printName(Person person) {
        //System.out.println("Mein Name ist: "+person.name);
        person.printName();
    }

    public static void printNames(List<Person> persons) {
        for (Person p : persons) {
            p.printName();
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person person = new Person("Jimmy");


    }
}
