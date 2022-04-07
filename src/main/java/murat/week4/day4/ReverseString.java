package murat.week4.day4;

import murat.muratStandardLibrary.MuratSwap;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your word to reverse");
        String userText = sc.nextLine();

        // Print user text reversely
        System.out.println(reverseString(userText));

    }

    public static String reverseString(String aString) {

        String newString;
        for (int i = 0, j = aString.length() - 1; i < j; i++, j--) {

            newString = MuratSwap.swapTwoCharsInAString(aString, i, j);
            aString = newString;
        }
        return aString;
    }
}
