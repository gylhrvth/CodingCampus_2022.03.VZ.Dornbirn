package aron.week03;

import java.util.Arrays;
import java.util.Random;


public class BubblesordWithNumbers {

    public static Random rand = new Random();

    public static void swap(int[] data, int left, int right) {
        if ((left >= 0) && (left < data.length) && (right >= 0) && (right < data.length)) {
            int temp = data[left];
            data[left] = data[right];
            data[right] = temp;
        }
    }

    public static void sord(int[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    swap(data, j, j + 1);
                }
            }

        }
    }

    public static void bubbleSortReversal(int[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - 1; j++) {

                if (data[j] < data[j + 1]) {
                    swap(data, j, j + 1);
                }
            }

        }
    }

    public static void main(String[] args) {
        int[] testArray = RandomNumberArrayCounter.generateRandomArray(20);
        System.out.println(Arrays.toString(testArray));
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = rand.nextInt(100);
        }
        System.out.println();
        swap(testArray, 0, 1);
        System.out.println(Arrays.toString(testArray));
        System.out.println();
        sord(testArray);
        System.out.println(Arrays.toString(testArray));
        System.out.println();
        bubbleSortReversal(testArray);
        System.out.println(Arrays.toString(testArray));

    }

}


