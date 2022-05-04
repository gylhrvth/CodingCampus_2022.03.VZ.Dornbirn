package philipp.week07.person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.jar.Attributes;

public class SortPersons {
    public enum SortBy{
        NAME,
        AGE,
        HEIGHT,
        WEIGHT
    }

    public static void main(String[] args) {
        Person[] list = {
                new Person("Sergej", 99, 175, 69),
                new Person("Philipp", 89, 173, 63),
                new Person("Aron", 79, 165, 54),
                new Person("Timo", 69, 162, 45),
                new Person("Razvan", 59, 173, 72),
                new Person("Gyula", 18, 170, 82),
                new Person("Arda", 16, 180, 73)
        };
        Comparator<Person>[] comps = new Comparator[]{
                new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return o1.getName().compareTo(o2.getName());
                    }
                },
                new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return o1.getAge() - o2.getAge();
                    }
                },
                new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return o1.getHeight() - o2.getHeight();
                    }
                },
                new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return o1.getWeight() - o2.getWeight();
                    }
                }};

        sortPersonsIf(list, 1);
        printPersonList(list);
        System.out.println("---");
        sortPersons(list, comps[0]);
        printPersonList(list);
        System.out.println("---");
        sortPersonsEnum(list,SortBy.NAME);
        printPersonList(list);
        System.out.println("---");


    }

    private static void sortPersonsEnum(Person[] list, SortBy value) {
        boolean b=false;
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - 1 - i; j++) {
                switch (value) {
                    case NAME -> b = (list[j].getName().compareTo(list[j + 1].getName()) > 0);
                    case AGE -> b = (list[j].getAge() > list[j + 1].getAge());
                    case HEIGHT -> b = (list[j].getHeight() > list[j + 1].getHeight());
                    case WEIGHT -> b = (list[j].getWeight() > list[j + 1].getWeight());
                    default -> {
                    }
                }

                if (b) {
                    Person tmp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = tmp;
                }
            }
        }
    }
    private static void sortPersons(Person[] list, Comparator<Person> comp) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (comp.compare(list[j], list[j + 1]) > 0) {
                    Person tmp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = tmp;
                }
            }
        }
    }

    private static void sortPersonsIf(Person[] list, int columnToSort) {
        boolean b;
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (columnToSort == 1) {
                    b = (list[j].getName().compareTo(list[j + 1].getName()) > 0);
                } else if (columnToSort == 2) {
                    b = (list[j].getAge() > list[j + 1].getAge());
                } else if (columnToSort == 3) {
                    b = (list[j].getHeight() > list[j + 1].getHeight());
                } else {
                    b = (list[j].getWeight() > list[j + 1].getWeight());
                }

                if (b) {
                    Person tmp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = tmp;
                }
            }
        }
    }

    private static void printPersonList(Person[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
