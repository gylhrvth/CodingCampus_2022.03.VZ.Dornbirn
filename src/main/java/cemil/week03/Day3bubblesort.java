package cemil.week03;

import java.util.Arrays;
import java.util.Random;

public class Day3bubblesort {
    public static Random rand = new Random();

    public static void swap(int[] data, int left, int right) {
        if ((left >= 0) && (left < data.length) && (right >= 0) && (right < data.length)) {
            int temp = data[left];
            data[left] = data[right];
            data[right] = temp;
        }
    }

    public static void bubbleSort(int[] data) {
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
        int[] testArray = new int[20];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = rand.nextInt(100);
        }
        System.out.println("Swap");
        swap(testArray, 0, 1);
        System.out.println(Arrays.toString(testArray));
        System.out.println("Bubble");
        bubbleSort(testArray);
        System.out.println(Arrays.toString(testArray));
        System.out.println("Reversal");
        bubbleSortReversal(testArray);
        System.out.println(Arrays.toString(testArray));


    }
}
