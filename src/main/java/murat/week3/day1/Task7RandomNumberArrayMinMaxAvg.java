package murat.week3.day1;

import java.util.Random;


public class Task7RandomNumberArrayMinMaxAvg {
    public static void main(String[] args) {

        int size = 100;
        Random rand = new Random();
        int[] muratArray;

        //Create an array with random numbers
        muratArray = createAnArrayWithRandoms(rand, size);

        System.out.println();
        System.out.println();

        System.out.println("Minimum number: " + findTheMinimum(muratArray));
        System.out.println("Maximum number: " + findTheMaximum(muratArray));
        System.out.println("Average number: " + findTheAverage(muratArray));

    }

    public static int[] createAnArrayWithRandoms(Random rand, int size) {

        int randomNumber;

        int[] anArray = new int[size];

        for (int i = 0; i < anArray.length; i++) {
            randomNumber = rand.nextInt(size);

            anArray[i] = randomNumber;

            System.out.print(anArray[i] + " ");
        }
        return anArray;
    }

    public static int findTheMinimum(int[] anArray) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < anArray.length; i++) {
            if (anArray[i] < min) {
                min = anArray[i];
            }
        }
        return min;
    }

    public static int findTheMaximum(int[] anArray) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < anArray.length; i++) {
            if (anArray[i] > max) {
                max = anArray[i];
            }
        }
        return max;
    }

    public static double findTheAverage(int[] anArray) {

        double sum = 0;

        for (int i = 0; i < anArray.length; i++) {
            sum = sum + anArray[i];
        }
        return (sum / anArray.length);
    }
}
