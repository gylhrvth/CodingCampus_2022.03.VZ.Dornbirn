package murat.week4.day4;

import murat.muratStandardLibrary.MuratPrint;
import murat.muratStandardLibrary.MuratSwap;

// Ascending A-> Z and // Descending Z-> A
public class StringBubbleSortExtended {

    public static void main(String[] args) {

        boolean ascending;
        String[] names = new String[]{"Philipp", "Arda", "Murat", "Jimmy \"Cemil\" McGill", "Sergej", "Razvan", "Timo", "Aron", "Gyula", "Lukas"};
        bubbleSortMitStrings(names, false);
        MuratPrint.printAStringArray(names, true);

    }

    public static String[] bubbleSortMitStrings(String[] anArray, boolean ascending) {

        // Ascending A-> Z
        if (ascending) {

            for (int i = 0; i < anArray.length; i++) {                 // Sort it throughout its length

                for (int j = 0; j < anArray.length - 1 - i; j++) {     // Sort it once

                    if (anArray[j].compareTo(anArray[j + 1]) > 0) {
                        MuratSwap.swapTwoStringsInArray(anArray, j, (j + 1));
                    }
                }
            }
        } else {            // Descending Z-> A

            for (int i = 0; i < anArray.length; i++) {                 // Sort it throughout its length

                for (int j = 0; j < anArray.length - 1 - i; j++) {     // Sort it once

                    if (anArray[j].compareTo(anArray[j + 1]) < 0) {
                        MuratSwap.swapTwoStringsInArray(anArray, j, (j + 1));
                    }
                }
            }
        }
        return anArray;
    }
}
