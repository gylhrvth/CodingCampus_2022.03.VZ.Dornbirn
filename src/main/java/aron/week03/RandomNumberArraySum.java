package aron.week03;

import java.util.Arrays;

public class RandomNumberArraySum {

    public static int sumOfArray(int[] data){
        int summe = 0;
        for (int i = 0; i < data.length; i++) {
            summe += data[i];
        }

        return summe;
    }




    public static void main(String[] args) {
        int[] testArray = RandomNumberArrayCounter.generateRandomArray(40);
        System.out.println(Arrays.toString(testArray));

        System.out.println("Sum: " + sumOfArray(testArray));
    }
}

