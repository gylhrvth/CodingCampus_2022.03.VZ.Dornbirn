package murat.week5.day5;

import murat.muratStandardLibrary.MuratSwap;

import java.io.DataInput;

public class SplitAndSort {
    public static void main(String[] args) {

        StringBuilder buildAString = new StringBuilder();
        String text = "Heute wird ein guter Tag! Heute wird der beste Tag überhaupt! Heute wird ein spitzen super Tag!";

        String[] arrText = bubbleSort(text);

        for (int i = 0; i < arrText.length; i++) {
            buildAString.append(arrText[i]).append( " ");
        }

        System.out.print(buildAString);
    }

    public static String[] bubbleSort(String text) {

        String[] divided = text.split(" ");
        String temp;

        for (int i = 0; i < divided.length; i++) {                 // Sort it throughout its length

            for (int j = 0; j < divided.length - 1 - i; j++) {     // Sort it once

                if (divided[j].compareTo(divided[j + 1]) < 0) {
                    MuratSwap.swapTwoStringsInArray(divided, j, (j + 1));
                }
            }
        }
        return divided;
    }
}
