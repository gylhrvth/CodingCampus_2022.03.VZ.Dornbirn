package murat.week3.day1;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Task4RandomNumberArrayCrazyRange {

    public static void main(String[] args) {

        int size = 100;

        Random rand = new Random();
        int[] muratArray = new int[size];

        for (int i = 0; i < size; i++) {

            int randomNumber = -50 + rand.nextInt(size);
            muratArray[i] = randomNumber;
            System.out.print((i + 1) + "No " + muratArray[i] + " ");

        }
    }
}
