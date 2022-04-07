package murat.muratStandardLibrary;

import java.util.Arrays;

public class MuratSwap {
    public static void main(String[] args) {
        int[] numbers = new int[]{3, 4, 5, 7, 8};
        String[] names = new String[]{"Innsbruck", "Bregenz", "Wien", "Salzburg", "Klagenfurt", "St.Pölten"};

        swapTwoStringsInArray(names, 0, 1);
        MuratPrint.printAStringArray(names, true);

        System.out.println();
        System.out.println(swapTwoCharsInAString("Murat", 1, 2));

        System.out.println();
        System.out.println(reverseAString("Murat"));
    }

    public static void swapTwoStringsInArray(String[] anArray, int firstIndex, int secondIndex) {
        String anElement = anArray[secondIndex];
        anArray[secondIndex] = anArray[firstIndex];
        anArray[firstIndex] = anElement;
    }

    public static String swapTwoCharsInAString(String aString, int firstIndex, int secondIndex) {
        char[] charsOfAString = aString.toCharArray();

        char anElement = charsOfAString[secondIndex];
        charsOfAString[secondIndex] = charsOfAString[firstIndex];
        charsOfAString[firstIndex] = anElement;
        return new String(charsOfAString);
    }

    public static String reverseAString(String aString) {

        char[] charsOfAString = aString.toCharArray();

        for (int i = 0, j = aString.length() - 1; i < j; i++, j--) {
            char first = charsOfAString[i];
            charsOfAString[i] = charsOfAString[j];
            charsOfAString[j] = first;
        }
        return new String(charsOfAString);
    }
}
