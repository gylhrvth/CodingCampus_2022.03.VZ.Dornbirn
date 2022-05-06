package cemil.week08.Person;

import gyula.week07.personen.Person;

public class Day1Course {
    public static void main(String[] args) {
        Person[] list = {
                new Person("Sergej", 99, 175, 69),
                new Person("Philipp", 89, 173, 63),
                new Person("Aron", 79, 165, 54),
                new Person("Timo", 69, 162, 45),
                new Person("Razvan", 59, 173, 72),
                new Person("Gyula", 999, 170, 82)
        };

        printPersonList(list);
        System.out.println("=================");
        System.out.println(minAge(list));
    }

    private static void printPersonList(Person[] list){
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    private static Person minAge(Person[] list){
        Person min = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i].getAge() < min.getAge()){
                min = list[i];
            }
        }
        return min;
    }

}
