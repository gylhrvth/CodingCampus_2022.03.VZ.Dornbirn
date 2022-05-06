package aron.week07.person;


public class Course {
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
        System.out.println(maxAge(list));
        System.out.println("=================");
        System.out.println(minHeight(list));
        System.out.println("=================");
        System.out.println(avarage(list));

    }

    private static void printPersonList(Person[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
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

    private static Person minHeight(Person[] list) {

        Person min = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i].getheight() < min.getheight()) {
                min = list[i];
            }

        }
        return min;
    }

    public static float avarage(Person[] list) {
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i].getWeight();

        }
        return (float) sum / list.length;
    }

    public static void bubbleSortString(Person[] array, boolean ascending) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (ascending) {
                    if (array[j].toString().compareTo(array[j + 1].toString()) > 0) {
                        swap(array, j, j + 1);
                    }
                } else {
                    if (array[j].toString().compareTo(array[j + 1].toString()) < 0) {
                        swap(array, j, j + 1);
                    }
                }
            }
        }
    }

    private static void swap(Person[] array, int indexA, int indexB) {
        Person swap = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = swap;
    }
}

