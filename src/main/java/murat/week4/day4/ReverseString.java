package murat.week4.day4;

import murat.muratStandardLibrary.MuratSwap;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your word to reverse");
        String userText = sc.nextLine();

        long startNS = System.nanoTime();
        // Print user text reversely
        String reversed = reverseString(userText);
        long endNS = System.nanoTime();
        System.out.println(reversed);
        System.out.println("Murat reverse took: " + (endNS - startNS) / 1000000f + "ms");

        String bigString = new String(new byte[100000]);
        long start = System.currentTimeMillis();
        reverseString(bigString);
        long end = System.currentTimeMillis();
        System.out.println("MSL Reverse took: " + (end - start) + "ms.");

        start = System.currentTimeMillis();
        reverseStringV2(bigString);
        end = System.currentTimeMillis();
        System.out.println("MSL ReverseV2 took: " + (end - start) + "ms.");
    }

    public static String reverseString(String aString) {

        String newString;
        for (int i = 0, j = aString.length() - 1; i < j; i++, j--) {

            newString = MuratSwap.swapTwoCharsInAString(aString, i, j);
            aString = newString;
        }
        return aString;
    }

    public static String reverseStringV2(String aString) {

        char[] charsOfAString = aString.toCharArray();

        for (int i = 0, j = aString.length() - 1; i < j; i++, j--) {
            char first = charsOfAString[i];
            charsOfAString[i] = charsOfAString[j];
            charsOfAString[j] = first;
        }

        return new String(charsOfAString);
    }
}
