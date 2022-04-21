package aron.week01;

public class Couting2 {

    public static void task1(int limitStart, int limitEnd) {
        for (int i = limitStart; i <= limitEnd; ++i) {
            System.out.println(i);
        }
    }

    public static void task2(int limitStart, int limitEnd) {
        for (int i = limitStart; i < limitEnd; ++i) {
            System.out.println(i);
        }
    }

    public static void task3(int limitStart, int limitEnd) {
        for (int i = limitStart; i <= limitEnd; i+=2) {
            System.out.println(i);

        }
    }

    public static void task4(int limitStart, int limitEnd) {
        for (int i = limitStart; i >= limitEnd; --i) {
            System.out.println(i);
        }
    }
    public static void task5(int limitStart, int limitEnd) {

        for (int i = limitStart; i != limitEnd; ) {


            if (limitStart > limitEnd) {
                --i;
                System.out.println(i);
            } else {
                ++i;
                System.out.println(i);
            }
        }
    }


    public static void task6(int limitStart, int limitEnd) {
        int x = 1;
        for (int i = limitStart; i != limitEnd; i = x+i ) {



            if (limitStart > limitEnd) {
                x = -1 ;

            }
            System.out.println(i);
            }
        }

    public static void main(String[] args){
//        task1(0, 10);
        System.out.println("=================");
//        task2(0,10);
        System.out.println("=================");
//        task3(0,10);
        System.out.println("=================");
        task4(10,-10);
        System.out.println("=================");
        task5(-8,8);
        System.out.println("=================");
        task6(2,-2);
    }
}

