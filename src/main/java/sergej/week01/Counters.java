package sergej.week01;

public class Counters {

    public static void task1(int startlimit, int endlimit) {
        if (startlimit < endlimit) {

            for (int i = startlimit; i <= endlimit; ++i) {
                System.out.println(i);
            }
        }
        else {
            for (int i = startlimit; i >= endlimit; --i) {
                System.out.println(i);
            }
        }
    }

    public static void task2(int start, int end) {

        for (int i = start; i < end; ++i) {
            System.out.println("counter:" + i);
        }

    }

    public static void task3(int start, int end, int modulo) {

        for (int i = start; i <= end; ++i) {
            if (i % modulo == 0) {
                System.out.println(i);
            }
        }


    }

    public static void task4(int start, int end) {

        for (int i = start; i >= end; --i) {
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        task1(30, 25);
        System.out.println("-----------");
        task1(3,7);
//        task2(0, 10);
//        task3(0, 10, 2);
//        task4(10, -10);


    }
}
