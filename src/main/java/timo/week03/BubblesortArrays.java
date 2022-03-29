package timo.week03;

import java.util.Arrays;

import static timo.week03.ArraysRandom.generateRandomArray;

public class BubblesortArrays {
    public static void main(String[] args) {

        int[] myArray = generateRandomArray(10);
        System.out.println(Arrays.toString(myArray));

        bubblesortArray(myArray);
        System.out.println(Arrays.toString(myArray));

        reverseBubblesortArray(myArray);
        System.out.println(Arrays.toString(myArray));

    }

    public static void bubblesortArray(int[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int swap = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = swap;
                }
            }
        }
    }

    public static void reverseBubblesortArray(int[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] < data[j + 1]) {
                    int swap = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = swap;
                }
            }
        }
    }
}
