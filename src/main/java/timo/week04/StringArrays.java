package timo.week04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class StringArrays {
    static Random rand = new Random();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[]{"Philipp", "Arda", "Murat", "Jimmy \"Cemil\" McGill", "Sergej", "Razvan", "Timo", "Aron", "Gyula", "Lukas"};
        //  System.out.println(Arrays.toString(names));

        bubbleSortString(names, true);
        //   System.out.println(Arrays.toString(names));

        bubbleSortString(names, false);
        //   System.out.println(Arrays.toString(names));

        // getSmallestString(names);

        bubbleSortStringChar(names, true, 3);
        //  System.out.println(Arrays.toString(names));


       System.out.println(reverseString(userInput(sc)));

        String text = userInput(sc);
        System.out.println("\"" + text + "\"");
        System.out.println("\"" + randomizeString(text) + "\"");



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
        System.out.println("Please enter a String:");
        String input = sc.nextLine();
        return input;
    }

    public static String reverseString(String text) {
        char[] chars = text.toCharArray();
        char[] result = new char[chars.length];
        System.out.println(Arrays.toString(chars));

        for (int i = 0; i < result.length; i++) {
            result[i] = chars[chars.length - 1 - i];
        }
        return new String(result);
    }


    public static String randomizeString(String text) {
        char[] randomChars = text.toCharArray();

        for (int i = 0; i < 10 * randomChars.length; i++) {
            int random1 = rand.nextInt(randomChars.length);
            int random2 = rand.nextInt(randomChars.length);

            char swap = randomChars[random2];
            randomChars[random2] = randomChars[random1];
            randomChars[random1] = swap;
        }
        return new String(randomChars);
    }
}




