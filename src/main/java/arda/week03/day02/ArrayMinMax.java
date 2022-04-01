package arda.week03.day02;

import java.util.Arrays;
import java.util.Random;

public class ArrayMinMax {
    public static void main(String[] args) {
        Random random = new Random();
        int[] anArray = new int[10];

        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = random.nextInt(100) + 1;
        }

//        minMethod(random, anArray);
//        averageMethod(random, anArray);

        System.out.println(Arrays.toString(anArray));
        System.out.println("Minimum is: " + minOfArray(anArray));
    }

    public static void averageMethod(Random random, int[] anArray) {
        int average = 0;
        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = random.nextInt(100)+1;
            average = average + anArray[i] / 10;
            System.out.print(anArray[i] + " ");
        }
        System.out.println("\nthe average is " + average);
    }
    public static void minOfArray(Random random, int[] anArray){
        int min = 0;

        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = random.nextInt(100)+1;
           min = anArray[i] = anArray.length - i;
            System.out.print(min + " ");
        }
        System.out.println("\nthe minimum is " + min);
    }
    public static int minOfArray(int[] data){
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < data.length; i++) {
            if (data[i] < min){
                min = data[i];
            }
        }
        return min;
    }

}
