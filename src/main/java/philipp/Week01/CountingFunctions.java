package philipp.Week01;

public class CountingFunctions {
    public static void main(String[] args) {
        task1(0, 11);
        System.out.println("------");
        task1(0, 10);
        System.out.println("------");
        task2(0, 11);
        System.out.println("------");
        task3(10, -11);
        System.out.println("------");
        task4(-4, 3);
        System.out.println("------");
        task4(4, -3);
        System.out.println("------");
        task5(-2, 5);
        System.out.println("------");
        task5(2, -5);
    }

    public static void task1(int limitStart, int limitEnd) {
        for (int i = limitStart; i != limitEnd; ++i)
            System.out.println(i);
    }

    public static void task2(int limitStart, int limitEnd) {
        for (int i = limitStart; i != limitEnd; ++i)
            if (i % 2 == 0) {
                System.out.println(i);
            }
    }

    public static void task3(int limitStart, int limitEnd) {
        for (int i = limitStart; i != limitEnd; --i)
            System.out.println(i);
    }

    public static void task4(int limitStart, int limitEnd) {
        for (int i = limitStart; i != limitEnd; ) {
            if (limitStart < limitEnd) {
                ++i;
            } else {
                --i;
            }
            System.out.println(i);
        }
    }

    public static void task5(int limitStart, int limitEnd) {
        int x = 1;
        for (int i = limitStart; i != limitEnd; i = i + x) {
            if (limitStart > limitEnd) {
                x = -1;
            }
            System.out.println(i);
        }
        System.out.println(limitEnd);
    }

}