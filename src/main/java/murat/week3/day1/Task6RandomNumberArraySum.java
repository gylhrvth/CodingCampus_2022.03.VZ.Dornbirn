package murat.week3.day1;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Arrays;

public class Task6RandomNumberArraySum {
    public static void main(String[] args) {

        int size = 100;
        int randomNumber;
        Random rand = new Random();
        int[] muratArray = new int[size];

        // Numbers in array
        for (int i = 0; i < muratArray.length; i++) {
            randomNumber = rand.nextInt(size);
            muratArray[i] = randomNumber;
            System.out.print(muratArray[i] + " ");
        }

        System.out.println();
        System.out.println("Sum of the random numbers is: " + sumOfRandomNumbersInArray(muratArray));

    }

    public static int sumOfRandomNumbersInArray(int[] anArray) {

        int sum = 0;
        for (int j = 0; j < anArray.length; j++) {
            sum = sum + anArray[j];
        }
        return sum;
    }
}
