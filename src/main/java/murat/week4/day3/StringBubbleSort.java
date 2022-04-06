package murat.week4.day3;

import murat.muratStandardLibrary.MuratPrint;
import murat.muratStandardLibrary.MuratSwap;

public class StringBubbleSort {
    public static void main(String[] args) {

        String[] names = new String[]{"Philipp", "Arda", "Murat", "Jimmy \"Cemil\" McGill", "Sergej", "Razvan", "Timo", "Aron", "Gyula", "Lukas"};
        bubbleSortMitStrings(names);
        MuratPrint.printAStringArray(names, true);
    }

    public static String[] bubbleSortMitStrings(String[] anArray) {

        for (int i = 0; i < anArray.length; i++) {                 // Sort it throughout its length

            for (int j = 0; j < anArray.length - 1 - i; j++) {     // Sort it once

                if (anArray[j].compareTo(anArray[j + 1]) > 0) {
                    MuratSwap.swapTwoStringsInArray(anArray, j, (j + 1));
                }
            }
        }
        return anArray;
    }

}
