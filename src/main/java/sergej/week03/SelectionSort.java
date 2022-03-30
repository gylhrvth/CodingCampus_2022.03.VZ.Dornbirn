package sergej.week03;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int swap = array[min];
            array[min] = array[i];
            array[i] = swap;


        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {

        int[] newList = RandomArray.randomList(0);
        selectionSort(newList);

    }
}
