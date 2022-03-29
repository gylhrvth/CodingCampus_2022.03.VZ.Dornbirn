package murat.week3.day2;

import java.util.Arrays;

// Copyright by Arda and Murat
public class CocktailShakerSort {
    public static void main(String[] args) {

        int[] initialArray = {57, 82, 25, 31, 90, 17, 42};

        System.out.println("Initial array: ");
        displayAnArray(initialArray);

        cocktailShakerSort(initialArray);

        System.out.println("Sorted array: ");
        displayAnArray(initialArray);
    }

    public static int[] cocktailShakerSort(int[] anArray) {

        int lo = 0;
        int hi = anArray.length - 1;
        int mov = lo;

        while (lo < hi) {

            // Scan from index max to index min
            for (int i = hi; i > lo; i--) {
                if (anArray[i - 1] > anArray[i]) {
                    swapTwoNumbers(anArray, i - 1, i);
                    mov = i;
                }
            }
            lo = mov;              // If lo <= hi, exits the loop

            // Scan from index min to index max
            for (int i = lo; i < hi; i++) {
                if (anArray[i] > anArray[i + 1]) {
                    swapTwoNumbers(anArray, i, i + 1);
                    mov = i;
                }
            }

            hi = mov;               // If lo <= hi, exits the loop
        }
        return anArray;
    }

    public static void displayAnArray(int[] anArray) {

        for (int i = 0; i < anArray.length; i++) {

            System.out.print(anArray[i] + " ");
        }
        System.out.println();
    }

    public static int[] swapTwoNumbers(int[] anArray, int firstIndex, int secondIndex) {

        int temporary = anArray[secondIndex];
        anArray[secondIndex] = anArray[firstIndex];
        anArray[firstIndex] = temporary;

        return anArray;
    }
}
