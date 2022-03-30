package murat.week3.day2;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int[] initialArray = {57, 82, 25, 31, 90, 17, 42, 56, 78, 92, 99, 14, 45};

        System.out.println("Initial array: ");
        CocktailShakerSort.displayAnArray(initialArray);

        quickSort(initialArray, 0, 12);

        System.out.println("Sorted array: ");
        CocktailShakerSort.displayAnArray(initialArray);

    }

    public static int[] quickSort(int[] anArray, int left, int right) {


        if (left < right) {

            int p = partition(anArray, left, right);
            System.out.println("Partition: " + p);
            quickSort(anArray, left, p - 1);
            CocktailShakerSort.displayAnArray(anArray);
            quickSort(anArray, p + 1, right);
            CocktailShakerSort.displayAnArray(anArray);
        }
        return anArray;
    }

    public static int partition(int[] anArray, int left, int right) {

        int i = left;      // pivot index
        int j = right - 1;
        int pivot = anArray[right];
        System.out.println("Pivot: " + pivot);

        while (i < j) {

            while (i < right && anArray[i] < pivot) {
                i++;
            }
            while (j > left && anArray[j] > pivot) {
                j--;
            }
            if (i < j) {
                //System.out.println("IF " + i + " smaller than " + j + " Swap: " + anArray[i] + " with " + anArray[j]);
                CocktailShakerSort.swapTwoNumbers(anArray, i, j);
                CocktailShakerSort.displayAnArray(anArray);
            }
        }
        if (anArray[i] > pivot) {
            //System.out.println("IF " + anArray[i] + " greater than " + pivot + " Swap: " + anArray[i] + " with " + anArray[right]);
            CocktailShakerSort.swapTwoNumbers(anArray, i, right);
            CocktailShakerSort.displayAnArray(anArray);
        }
        return i;
    }
}
