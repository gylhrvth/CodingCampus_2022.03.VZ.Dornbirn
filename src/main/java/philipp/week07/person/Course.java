package philipp.week07.person;


import java.util.Arrays;

public class Course {
    public static void main(String[] args) {
        Person[] list = {
                new Person("Sergej", 99, 175, 69),
                new Person("Philipp", 89, 173, 63),
                new Person("Aron", 79, 165, 54),
                new Person("Timo", 69, 162, 45),
                new Person("Razvan", 59, 173, 72),
                new Person("Gyula", 18, 170, 82),
                new Person("Arda", 16,180,73)
        };

        printPersonList(list);
        System.out.println("=================");
//        list[1].setAge(35);
        System.out.println(minAge(list));
        System.out.println("=================");
        System.out.println(maxAge(list));
        System.out.println("=================");
//        System.out.println("The average age is: " + averageAge(list));
        averageAgedPerson(list);
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

    private static Person maxAge(Person[] list) {
        Person max = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i].getAge() > max.getAge()) {
                max = list[i];
            }
        }
        return max;
    }

//    private static float averageAge(Person[] list) {
//        float sum = 0;
//        for (Person p : list) {
//            sum += p.getAge();
//        }
//
//        return sum / list.length;
//    }

    private static void averageAgedPerson(Person[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (list[j].getAge() > list[j+1].getAge()) {
                    Person tmp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(list));
        System.out.println("The person with the median age is "+list[list.length/2]);
    }



}
