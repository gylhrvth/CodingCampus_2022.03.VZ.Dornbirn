package aron.Week04;

import java.util.Arrays;
import java.util.Random;

public class BubblesortWithStringExtended {


    public static void main(String[] args) {
        String[] names = new String[]{"Philipp", "Arda", "Murat", "Jimmy \"Cemil\" McGill", "Sergej", "Razvan", "Timo", "Aron", "Gyula", "Lukas"};
        System.out.println(Arrays.toString(names));
        Random random = new Random();
        for (int i = 0; i < names.length; i++) {

        }
        bubbleSortStringsAscDsc(names, true);
        System.out.println(Arrays.toString(names));
        bubbleSortStringsAscDsc(names, false);
        System.out.println(Arrays.toString(names));
    }

    private static void swap(String[] array, int right, int left) {
        String swap = array[right];
        array[right] = array[left];
        array[left] = swap;
    }

    private static void bubbleSortStringsAscDsc(String[] input, boolean asc) {
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 0; j < input.length - 1 - i; j++) {
                if (asc != (input[j].compareTo(input[j + 1]) < 0)) {
                    swap(input, j, (j + 1));
                }
            }
        }
    }
}