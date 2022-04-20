package aron.EasternWeek;

import java.util.Arrays;

public class ArrayAufgabe4 {

    public static void main(String[] args) {

        int[] arr = new int[]{478199, 7812973, 12387123, 12, 3, 123, 12, 3, 1, 3, 1, 3, 1, 8, 9, 15, 1, 5, 1, 5, 1, 5, 15, 1, 5, 0, 2623636, 25, 242, 26, 26, 234, 62, 35, 503450134, 412, 4, 124, 1, 243};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
/*                Integer currentname = arr[j];
                Integer nextname = arr[j + 1];
                int name = currentname.compareTo(nextname);
                if (name < 0) {
                    swap(arr, j, j + 1);
                }
*/
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] array, int right, int left) {
        int swap = array[right];
        array[right] = array[left];
        array[left] = swap;
    }
}
