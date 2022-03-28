package murat.week3.day1;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Task5RandomNumberArrayCount {
    public static void main(String[] args) {

        int size = 100;
        int upperLimit = 30;
        int randomNumber;
        int counter = 0;
        Random rand = new Random();
        int[] muratArray = new int[size];

        for (int i = 0; i < muratArray.length; i++) {
            randomNumber = rand.nextInt(size);
            muratArray[i] = randomNumber;
            System.out.print(muratArray[i] + " ");
            if (muratArray[i] > upperLimit) {
                counter++;
            }
        }
        System.out.println();
        System.out.println(counter + " numbers are bigger than " + upperLimit);
    }
}
