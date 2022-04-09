package philipp.Week04;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BubbleSortStrings {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] names = new String[]{"Philipp", "Arda", "Murat", "Jimmy \"Cemil\" " +
                "McGill", "Sergej", "Razvan", "Timo", "Aron", "Gyula", "Lukas"};
//        bubbleSortStringsAsc(names);
//        System.out.println("ASC: " + Arrays.toString(names));
//        bubbleSortStringsDsc(names);
//        System.out.println("DSC: " + Arrays.toString(names));
//        bubbleSortStringsAscDsc(names, true);
//        System.out.println("ASC Boolean: " + Arrays.toString(names));
//        bubbleSortStringsAscDsc(names, false);
//        System.out.println("DSC Boolean: " + Arrays.toString(names));
//        System.out.println();
        bubbleSortStringChar(names, true);
        System.out.println(Arrays.toString(names));
    }

    private static void bubbleSortStringChar(String[] input, boolean asc) {
        int maxChar = checkWordLength(input);
        int inputCharNo = readNumber(sc, "Please enter the requested char from 1 to " + maxChar,
                "Enter number from 1 to " + maxChar, 1, maxChar);
        int ascOrDsc = readNumber(sc, "Please enter 1 for ascending and 2 for descending",
                "Enter number 1 or 2! ", 1, 2);
        if (ascOrDsc == 2) {
            asc = false;
        }
        System.out.println();
        sortWordsOfString(input, inputCharNo - 1, asc);

    }

    private static void sortWordsOfString(String[] input, int inputCharNo, boolean asc) {
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 0; j < input.length - 1 - i; j++) {
                if (asc != input[j].charAt(inputCharNo) < input[j + 1].charAt(inputCharNo)) {
                    swap(input, j, (j + 1));
                }
            }
        }
    }

    private static int checkWordLength(String[] input) {
        int charInput = Integer.MAX_VALUE;
        for (int i = 0; i < input.length - 1; i++) {
            if (charInput > input[i].length()) {
                charInput = input[i].length();
            }
        }
        return charInput;
    }

    private static int readNumber(Scanner sc, String inputMsc, String alertMessage, int sizeMin, int sizeMax) {
        System.out.println(inputMsc);
        int n = Integer.MIN_VALUE;
        while (n == Integer.MIN_VALUE) {
            try {
                String text = sc.nextLine();
                n = Integer.parseInt((text));
                if (n < sizeMin || n > sizeMax) {
                    n = Integer.MIN_VALUE;
                    System.out.println(alertMessage);
                }
            } catch (NumberFormatException nfe) {
                System.out.println(alertMessage);
            }
        }
        return n;
    }


    private static void bubbleSortStringsAscDsc(String[] input, boolean asc) {
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 0; j < input.length - 1 - i; j++) {
                if (asc != (input[j].compareTo(input[j + 1]) < 0)) {
                    swap(input, j, (j + 1));
                }
            }
        }
    }

    private static void bubbleSortStringsAsc(String[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1 - i; j++) {
                if (data[j].compareTo(data[j + 1]) > 0) {
                    swap(data, j, (j + 1));
                }
            }
        }
    }

    private static void bubbleSortStringsDsc(String[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1 - i; j++) {
                if (data[j].compareTo(data[j + 1]) < 0) {
                    swap(data, j, (j + 1));
                }
            }
        }
    }


    private static void swap(String[] input, int indexA, int indexB) {
        String swap = input[indexA];
        input[indexA] = input[indexB];
        input[indexB] = swap;
    }
}
