package zah.week01;

public class CountTo10Day2 {

    public static void task1(int limitStart, int limitEnd){
        for (int i = limitStart; i <= limitEnd ; i++) {
            System.out.println(i);
        }
    }
    public static void task2(int limitStart, int limitEnd){
        for (int i = limitStart; i < limitEnd ; i++) {
            System.out.println(i);
        }
    }
    public static void task3(int limitStart, int limitEnd) {
        for (int i = limitStart; i <= limitEnd; i += 2) {
            System.out.println(i);
            }
        }

    public static void task4(int limitStart, int limitEnd){
        for (int i = limitStart; i >= limitEnd ; i--) {
            System.out.println(i);
        }
    }





    public static void main(String[] args){
        task1(0, 10);
        System.out.println("-------------------------------");
        task2(0,10);
        System.out.println("-------------------------------");
        task3(0,10);
        System.out.println("---------------");
        task4(10,-10);



        }





}
