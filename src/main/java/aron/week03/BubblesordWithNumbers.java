package aron.week03;

import java.util.Arrays;


public class BubblesordWithNumbers {


    public static void swap(int[] data, int left, int right) {
        if ((left >= 0) && (left < data.length) && (right >= 0) && (right < data.length)) {
            int temp = data[left];
            data[left] = data[right];
            data[right] = temp;
        }
    }

    public static int sord(int data) {
        int[] testArray = new int[data];
        for (int i = 0; i < testArray.length; i++) {
            for (int j = 0; j < testArray.length - i - 1; j++) {
                if (testArray[i] > testArray[j + 1 ]) {

                }
            }

        }
        return data;
    }

        public static void main (String[]args) {
            int[] testArray = RandomNumberArrayCounter.generateRandomArray(100);
            System.out.println(Arrays.toString(testArray));


        }


}