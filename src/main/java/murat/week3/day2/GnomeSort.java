package murat.week3.day2;

import java.util.Arrays;

public class GnomeSort {
    public static void main(String[] args) {

        int[] initialArray = {57, 82, 25, 31, 90, 17, 42};

        System.out.println("Initial array: ");
        CocktailShakerSort.displayAnArray(initialArray);

        gnomeSort(initialArray);

        System.out.println("Sorted array: ");
        CocktailShakerSort.displayAnArray(initialArray);
    }

    public static int[] gnomeSort(int[] anArray) {
        // i = position to move
        int i = 1;
        while (i < anArray.length) {

            // if the left is smaller than the right
            if (anArray[i] > anArray[i - 1]) {
                i++;
            } else { // otherwise swap them
                CocktailShakerSort.swapTwoNumbers(anArray, i, i - 1);

                // if index bigger than 1 then decrement it to swap
                if (i > 1) {
                    i--;
                }
            }
        }
        return anArray;
    }
}
