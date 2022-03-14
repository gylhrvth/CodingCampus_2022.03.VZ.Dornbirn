package murat.week01;

public class CountTo10 {

    public static void main(String[] args) {

        System.out.println("---TASK 1---");
        System.out.println("---FOR---");
        for (int i = 0; i <= 10; ++i) {
            System.out.println("The Number: " + i);
        }
        System.out.println("---WHILE---");
        int counter = 0;
        while (counter <= 10) {
            System.out.println("The Number: " + counter);
            ++counter;
        }

        System.out.println("------------------------------------");
        System.out.println("---TASK 2---");

        for (int i = 0; i < 10; ++i) {
            System.out.println("The Number: " + i);
        }

        System.out.println("------------------------------------");
        System.out.println("---TASK 3---");
        for (int i=0; i <= 10; ++i) {
            if((i%2)==0) {
                System.out.println("Even Numbers: " + i);
            }
        }

        System.out.println("------------------------------------");
        System.out.println("---TASK 3-Simpler---");
        for (int i=0; i <=10; i=i+2)
        {
            System.out.println("Even Numbers: " + i);
        }

        System.out.println("------------------------------------");
        System.out.println("---TASK 4---");
        for (int i=10; i >= -10; --i) {
            System.out.println("The Number: " + i);
        }
    }
}
