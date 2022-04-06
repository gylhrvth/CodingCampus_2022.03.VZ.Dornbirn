package timo.week04;

import java.util.Arrays;

public class StringArrays {
    public static void main(String[] args) {

        String[] names = new String[]{"Philipp", "Arda", "Murat", "Jimmy \"Cemil\" McGill", "Sergej", "Razvan", "Timo", "Aron", "Gyula", "Lukas"};
        System.out.println(Arrays.toString(names));

        bubbleSortString(names, true);
        System.out.println(Arrays.toString(names));

        bubbleSortString(names, false);
        System.out.println(Arrays.toString(names));

    }

    public static void swap(String[] array, int indexA, int indexB) {
        String swap = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = swap;
    }

    public static void bubbleSortString(String[] array, boolean ascending) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (ascending) {
                    if (array[j].compareTo(array[j + 1]) > 0) {
                        swap(array, j, j + 1);
                    }
                } else {
                    if (array[j].compareTo(array[j + 1]) < 0) {
                        swap(array, j, j + 1);
                    }
                }
            }
        }

    }
}


