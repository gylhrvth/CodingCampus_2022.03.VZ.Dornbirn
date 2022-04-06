package sergej.week04;

import java.util.Arrays;

public class BubbleString {

    public static void sortString(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    swap(array, j, j + 1);
                }
            }
        }
        System.out.println(Arrays.toString(array));

    }

    public static void swap(String[] array, int indexA, int indexB) {
        String swap = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = swap;
    }

    public static void main(String[] args) {

        String[] names = new String[]{"Philipp", "Arda", "Murat", "Jimmy \"Cemil\" McGill", "Sergej", "Razvan", "Timo", "Aron", "Gyula", "Lukas"};
        sortString(names);
    }
}
