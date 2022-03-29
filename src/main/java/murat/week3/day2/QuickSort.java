package murat.week3.day2;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int[] initialArray = {57, 82, 25, 31, 90, 17, 42};

        System.out.println("Initial array: ");
        CocktailShakerSort.displayAnArray(initialArray);

        quickSort(initialArray);

        System.out.println("Sorted array: ");
        CocktailShakerSort.displayAnArray(initialArray);

       int q= pickPivotPos(initialArray);
        partition(initialArray,0,6,q);
    }

    public static int[] quickSort(int[] anArray) {

        return anArray;
    }

    public static int pickPivotPos(int[] anArray) {

        int pivotPos = anArray.length / 2;

        return pivotPos;
    }


    public static int[] partition(int[] anArray, int left, int right, int q){

         left = 0;
       right = anArray.length-1;

         CocktailShakerSort.swapTwoNumbers(anArray, q, right);

        for (int i = 0; i < right-1; i++) {
            if(anArray)  // Ab Morgen...
        }

        return anArray;
    }
}
