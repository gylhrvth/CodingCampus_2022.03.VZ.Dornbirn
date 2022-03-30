package timo.week03;

import java.util.Arrays;

import static timo.week03.ArraysRandom.generateRandomArray;

public class InsertionsortArray {
    public static void main(String[] args) {

        int[] myArray = generateRandomArray(0);
        System.out.println(Arrays.toString(myArray));

        insertionsortArray(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    public static void insertionsortArray(int[] data) {
        for (int i = 1; i < data.length; i++) {
            int j = i;
            while ((j > 0) && (data[j - 1] > data[j])) {
                int swap = data[j - 1];
                data[j - 1] = data[j];
                data[j] = swap;
                j = j - 1;
            }
        }
    }
}
