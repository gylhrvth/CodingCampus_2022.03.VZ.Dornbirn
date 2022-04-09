package timo.week04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class StringArrays {
    public static void main(String[] args) {

        String[] names = new String[]{"Philipp", "Arda", "Murat", "Jimmy \"Cemil\" McGill", "Sergej", "Razvan", "Timo", "Aron", "Gyula", "Lukas"};
        //  System.out.println(Arrays.toString(names));

        bubbleSortString(names, true);
        //   System.out.println(Arrays.toString(names));

        bubbleSortString(names, false);
        //   System.out.println(Arrays.toString(names));

        // getSmallestString(names);

        bubbleSortStringChar(names, true, 3);
        //  System.out.println(Arrays.toString(names));

        Scanner sc = new Scanner(System.in);
        reverseString(sc);

        // randomizeString(sc);


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

    public static void bubbleSortStringChar(String[] array, boolean ascending, int character) {
        if (character > getSmallestString(array) - 1) {
            System.out.println("CHARACTER TO BIG");
            return;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (ascending) {
                    if (array[j].charAt(character) > array[j + 1].charAt(character)) {
                        swap(array, j, j + 1);
                    }
                } else {
                    if (array[j].charAt(character) < array[j + 1].charAt(character)) {
                        swap(array, j, j + 1);
                    }
                }
            }
        }
    }

    public static int getSmallestString(String[] array) {
        int first = array[0].length();
        for (String s : array) {
            first = Math.min(first, s.length());
        }
        return first;
    }

    public static String userInput(Scanner sc) {
        System.out.println("Please enter a String to be reversed:");
        String input = sc.nextLine();
        return input;
    }

    public static void reverseString(Scanner sc) {
        String text = userInput(sc);
        char[] arr = text.toCharArray();
        System.out.println(Arrays.toString(arr));

        String empty = "";

        for (int i = arr.length - 1; i >= 0; i--) {
            empty += arr[i];
        }
        System.out.println(empty);
    }


    public static void randomizeString(Scanner sc) {
        String text = userInput(sc);
        char[] arr = text.toCharArray();
        System.out.println(Arrays.toString(arr));

        Random rand = new Random();

        for (int i = arr.length - 1; i >= 0; i--) {

            //   int swapWith = rand.nextInt(i);
            //   int swap = arr[i];
            //  arr[i] = arr[swapWith];
            //  arr[swapWith] = arr[swap];
        }
    }


}


