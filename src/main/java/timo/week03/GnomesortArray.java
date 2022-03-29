package timo.week03;

import java.util.Arrays;

import static timo.week03.ArraysRandom.generateRandomArray;

public class GnomesortArray {
    public static void main(String[] args) {

        int[] myArray = generateRandomArray(100);
        System.out.println(Arrays.toString(myArray));

        gnomesortArray(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    public static void gnomesortArray(int[] data) {
        int i = 1;
        while (i <= data.length - 1) {
            if (data[i] >= data[i - 1]) {
                i++;
            } else {
                int swap = data[i];
                data[i] = data[i - 1];
                data[i - 1] = swap;
                if (i > 1) {
                    i--;
                }
            }
        }
    }
}
