package murat.week7.day1.task2;

public class Class {
    public static void main(String[] args) {

        Person[] list = {
                new Person("Sergej", 99, 175, 69),
                new Person("Philipp", 89, 173, 63),
                new Person("Aron", 79, 165, 54),
                new Person("Timo", 69, 162, 45),
                new Person("Razvan", 59, 173, 72),
                new Person("Gyula", 999, 170, 82)
        };

        System.out.println("Minimum age: " + minAge(list));
        System.out.println("Maximum age: " + maxAge(list));
        System.out.println("Average age: " + aveAge(list));
        printPersonList(sortWeight(list));
    }

    private static void printPersonList(Person[] list) {

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    private static Person minAge(Person[] aList) {

        Person min = aList[0];
        for (int i = 0; i < aList.length; i++) {
            if (aList[i].getAge() < min.getAge()) {
                min = aList[i];
            }
        }
        return min;
    }

    private static Person maxAge(Person[] aList) {

        Person max = aList[0];
        for (int i = 0; i < aList.length; i++) {
            if (aList[i].getAge() > max.getAge()) {
                max = aList[i];
            }
        }
        return max;
    }

    private static float aveAge(Person[] aList) {

        float ave = 0;
        for (int i = 0; i < aList.length; i++) {
            ave += aList[i].getAge();
        }
        ave = ave / aList.length;
        return ave;
    }

    private static Person[] sortWeight(Person[] aList) {

        for (int i = 0; i < aList.length; i++) {
            for (int j = 0; j < aList.length - i - 1; j++) {

                if (aList[j].getWeight() > aList[j + 1].getWeight()) {
                    Person temp = aList[j + 1];
                    aList[j + 1] = aList[j];
                    aList[j] = temp;
                }
            }
        }
        return aList;
    }
}
