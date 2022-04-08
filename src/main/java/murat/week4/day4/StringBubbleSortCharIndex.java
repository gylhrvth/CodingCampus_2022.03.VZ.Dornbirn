package murat.week4.day4;

import murat.muratStandardLibrary.MuratPrint;
import murat.muratStandardLibrary.MuratSwap;

public class StringBubbleSortCharIndex {
    public static void main(String[] args) {

        int indexOfChar; // Starts from 1!
        String[] names = new String[]{"Philipp", "Arda", "Murat", "Jimmy \"Cemil\" McGill", "Sergej", "Razvan", "Timo", "Aron", "Gyula", "Lukas"};
        bubbleSortMitStrings(names, 8);
        MuratPrint.printAStringArray(names, true);
    }

    public static String[] bubbleSortMitStrings(String[] anArray, int charIndex) {

        // Check if the lengths of the individual elements of array are within the bounds.
        for (int i = 0; i < anArray.length; i++) {

            // if not, quit
            if (anArray[i].length() < charIndex) {
                System.out.println("Index is not within the limits in: " + anArray[i]);
                System.out.println("Original Array:");
                return anArray;
            }
        }

        // Check every single element in Array
        for (int i = 0; i < anArray.length; i++) {                 // Sort it throughout its length

            for (int j = 0; j < anArray.length - 1 - i; j++) {         // Sort it once
                if (anArray[j].charAt(charIndex) > (anArray[j + 1].charAt(charIndex))) {
                    MuratSwap.swapTwoStringsInArray(anArray, j, (j + 1));
                }
            }
        }

        return anArray;
    }
}
