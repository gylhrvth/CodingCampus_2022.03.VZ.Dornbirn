package lukas.week7.day4;

import java.util.List;
import java.util.Random;
import java.util.Vector;

public class Test {
    public static void main(String[] args) {
        Person name = new Person("jimmy");
        name.printName();
        Person.printName(name);

        String[] names = {"Jimmy", "Timokant", "Sergej", "Razvan", "OOP-Arda", "Philipp", "Aron", "Murat"};

        List<Person> persons = new Vector<>();

        for (String s : names) {
            persons.add(new Person(s));
        }
        Person.printNames(persons);


        Random random = new Random();
        System.out.println(persons.get(random.nextInt(persons.size())));


        Object obj = persons.get(0);
        System.out.println(obj);

        if (obj instanceof Person) {
            Person p = (Person) obj;
            p.printName();
        }
    }
}
