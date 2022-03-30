package sergej.week03;

import java.util.Arrays;

public class Bubblesort {

    public static void bubbleAscending(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }
        System.out.println(Arrays.toString(array));


    }

    public static void bubbleDescending(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }

            }
        }
        System.out.println(Arrays.toString(array));
    }


    public static void main(String[] args) {
        System.out.println("test");
        int[] newList = RandomArray.randomList(10);
        bubbleAscending(newList);
        bubbleDescending(newList);
    }
}
