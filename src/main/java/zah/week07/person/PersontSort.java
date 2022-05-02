package zah.week07.person;

import lukas.week3.day4.Arrays;

public class PersontSort {
    public static void main(String[] args) {

        Person[] list = {
                new zah.week07.person.Person("Sergej", 99, 175, 69),
                new zah.week07.person.Person("Philipp", 89, 173, 63),
                new zah.week07.person.Person("Aron", 79, 165, 54),
                new zah.week07.person.Person("Timo", 69, 162, 45),
                new zah.week07.person.Person("Razvan", 59, 173, 72),
                new zah.week07.person.Person("Gyula", 999, 170, 82)
        };
        sortPersone(list);
        printPersonList(list);

    }
    public static void sortPersone(Person[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j<list.length  -1 - i; j++) {
                if (list[j].getName().compareTo( list[j + 1].getName())>0) {
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
