package timo.week01;

public class TestFunctions {

    public static void main(String[] args) {
        task1(0, 10);
        task2(0, 10);
        task3(0, 10);
        task4(10, -10);
    }

    public static void task1(int start, int end) {
        for (int i = start; i <= end; ++i) {
            System.out.println(i);
        }
    }

    public static void task2(int start, int end) {
        for (int i = start; i < end; ++i) {
            System.out.println("Counter: " + i);
        }
    }

    public static void task3(int start, int end) {
        for (int i = start; i <= end; ++i) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void task4(int start, int end) {
        for (int i = start; i >= end; --i) {
            System.out.println(i);
        }
    }
}