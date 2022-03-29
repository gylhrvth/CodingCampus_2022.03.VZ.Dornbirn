package arda.week01;

public class Counters {
    public static void main(String[] args) {
        task1(5, 7);
        task2(0, 10);
        task3(0, 10, 2);
        task4(10, -10);
    }

    public static void task1(int limitStart, int limitEnd) {
        int counter = limitStart;
        while (counter <= limitEnd) {
            System.out.println(counter);
            ++counter;
        }

        System.out.println("---------Task1----------");

        for (int counter2 = limitStart; counter2 <= limitEnd; ++counter2) {
            System.out.println(counter2);
        }
    }

    public static void task2(int limitStart, int limitEnd) {
        System.out.println("========Task2=========");
        for (int i = limitStart; i <= limitEnd; i++) {
            System.out.println(i);
        }
    }

    public static void task3(int limitStart, int limitEnd, int modulo) {
        System.out.println("===============Task3==================");
        for (int i = limitStart; i <= limitEnd; i++) {
            if (i % modulo == 0) {
                System.out.println(i);
            }
        }
    }

    public static void task4(int limitStart, int limitEnd) {
        System.out.println("=====Task4======");
        for (int i = limitStart; i >= limitEnd; --i) {
            System.out.println(i);
        }
    }
}