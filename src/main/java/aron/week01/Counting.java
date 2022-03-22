package aron.week01;


public class Counting {
    public static void main(String[] args) {

        int counter2 = 0;
        int limiter = 10;

        while (counter2 < limiter) {
            if (counter2 % 2 == 0) {
                System.out.println(counter2);

            }
            ++counter2;
        }

        System.out.println("---------------");

        for (int counter = 0; counter < limiter; ++counter)
            System.out.println(counter);

        System.out.println("---------------");


        int counter3 = 10;
        int limiter2 = -10;

        while (counter3 >= limiter2) {
            System.out.println(counter3);
            --counter3;

        }

    }
}

