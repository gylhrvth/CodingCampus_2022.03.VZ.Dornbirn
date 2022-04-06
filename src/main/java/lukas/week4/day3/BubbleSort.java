package lukas.week4.day3;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = new int[100];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000);
        }

        for (int i = 0; i < arr.length; i++) {
            //Ein Zeilendurchlauf
            for (int j = 0; j < arr.length - 1 - i; j++) {
                int currentNumber = arr[j];
                int nextNumber = arr[j + 1];

                if (currentNumber > nextNumber) {
                    swap(arr, j, j + 1);
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int indexA, int indexB) {
        int number = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = number;
    }
}
