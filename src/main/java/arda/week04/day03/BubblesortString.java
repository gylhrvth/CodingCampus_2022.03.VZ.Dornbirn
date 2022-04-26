package arda.week04.day03;

import java.util.Arrays;
import java.util.Scanner;

public class BubblesortString {
    public static void main(String[] args) {
        String[] initArr = new String[]{"Philipp", "Arda", "Murat", "Cemil", "Sergej", "Razvan", "Timo", "Aron", "Gyula", "Lukas"};
        System.out.println("Descending Array:");
        sortDescending(initArr);
        System.out.println("Ascending Array:");
        sortAscending(initArr);
        System.out.println();
        System.out.println("Array with Boolean: ");
        sortWithBoolean(initArr);
    }

    public static void sortAscending(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    swapThingy(arr, j, j + 1);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void sortDescending(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) < 0) {
                    swapThingy(arr, j, j + 1);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void swapThingy(String[] arr, int i, int j) {
        String swap = arr[i];
        arr[i] = arr[j];
        arr[j] = swap;
    }

    public static void sortWithBoolean(String[] arr) {
        System.out.println("hello, please choose if you would like an Ascending array or a Descending array.");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine(); //is not a proper userinut because I deleted the class of which i took the method from.
        while (true) {
            if (userInput.equals("Ascending")) {
                sortAscending(arr);
                break;
            } else if (userInput.equals("Descending")) {
                sortDescending(arr);
                break;
            }
        }
    }
}
