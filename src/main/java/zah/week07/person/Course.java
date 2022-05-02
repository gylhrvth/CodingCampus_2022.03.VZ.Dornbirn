package zah.week07.person;

import zah.week07.person.Person;

public class Course {
    public static void main(String[] args) {
        Person[] list = {
                new zah.week07.person.Person("Sergej", 99, 175, 69),
                new zah.week07.person.Person("Philipp", 89, 173, 63),
                new zah.week07.person.Person("Aron", 79, 165, 54),
                new zah.week07.person.Person("Timo", 69, 162, 45),
                new zah.week07.person.Person("Razvan", 59, 173, 72),
                new zah.week07.person.Person("Gyula", 999, 170, 82)
        };

        printPersonList(list);
        System.out.println("=================");
        System.out.println(minAge(list));
        System.out.println("=================");
        System.out.println(maxHeight(list));
        median(list);
    }

    private static void printPersonList(Person[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    private static Person minAge(Person[] list) {
        Person min = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i].getAge() < min.getAge()) {
                min = list[i];
            }
        }
        return min;
    }

    public static Person maxHeight(Person[] list) {
        Person max = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i].getHeight() > max.getHeight()) {
                max = list[i];
            }

        }
        return max;
    }

    public static void median(Person[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < -1 - i; j++) {
                if (list[j].getAge() > list[j + 1].getAge()) {
                    Person tmp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = tmp;
                }
            }
        }
        System.out.println(list[list.length / 2]);
    }
}
