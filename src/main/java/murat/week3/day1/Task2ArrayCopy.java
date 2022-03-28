package murat.week3.day1;

import java.util.Scanner;
import java.util.Arrays;

public class Task2ArrayCopy {
    public static void main(String[] args) {

        int size = 5;
        int[] originalArray = new int[size];

        System.out.println();
        System.out.println("Original Array");
        for (int i = 0; i < size; i++) {
            originalArray[i] = 3 + i + i;
            System.out.print(i + "No " + originalArray[i] + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("Copy Array");
        for (int j = 0; j < size; j++) {
            System.out.print(j + "No " + makeACopy(originalArray)[j] + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("Make an array copy with arraycopy");

        int[] copyOfArray = makeACopyWithArrayCopy(originalArray);
        for (int j = 0; j < size; j++) {
            System.out.print(j + "No " + copyOfArray[j] + " ");
        }

        System.out.println();
    }

    public static int[] makeACopy(int[] anOriginalArray) {

        int[] aCopyArray = new int[anOriginalArray.length];

        for (int i = 0; i < aCopyArray.length; i++) {
            aCopyArray[i] = anOriginalArray[i];       // Copy the values
        }
        return aCopyArray;
    }

    public static int[] makeACopyWithArrayCopy(int[] anOriginalArray) {

        int[] aCopyArray = new int[anOriginalArray.length];

        System.arraycopy(anOriginalArray, 0, aCopyArray, 0, anOriginalArray.length);
        return aCopyArray;
    }
}
