package murat.week5.day5;

import data.Texts;
import murat.muratStandardLibrary.MuratSwap;

public class WordAnalysis {
    public static void main(String[] args) {

        String text1 = Texts.HESSE;
        String text2 = data.Texts.getSimpleText();
        textsToAnalyze(text1, text2);

    }

    public static void textsToAnalyze(String text1, String text2) {

        System.out.println("TEXT 1 Longest Word: " + longestWord(text1) + " has " + longestWord(text1).length() + " characters.");
        System.out.println("TEXT 2 Longest Word: " + longestWord(text2) + " has " + longestWord(text2).length() + " characters.\n");

        System.out.println("TEXT 1 Shortest Word: " + shortestWord(text1) + " has " + shortestWord(text1).length() + " characters.");
        System.out.println("TEXT 2 Shortest Word: " + shortestWord(text2) + " has " + shortestWord(text2).length() + " characters.");

        String[] sortedArr1 = sortWordsAlphabetically(text1);
        String[] sortedArr2 = sortWordsAlphabetically(text2);
        for (String s : sortedArr1) {
            System.out.println(s);
        }

    }

    public static String longestWord(String aText) {

        String longestWord = "";
        String[] aTextArr = aText.split(" ");
        for (String s : aTextArr) {
            if (s.length() > longestWord.length()) {
                longestWord = s;
            }
        }
        return longestWord;
    }

    public static String shortestWord(String aText) {

        String shortestWord = "";
        String[] aTextArr = aText.split(" ");
        for (int i = 0; i < aTextArr.length - 1; i++) {
            if (aTextArr[i].length() < aTextArr[i + 1].length()) {
                shortestWord = aTextArr[i];
            }
        }
        return shortestWord;
    }

    public static String[] sortWordsAlphabetically(String aText) {

        String[] aTextArr = aText.split("\\s+");
        String[] newArr = new String[aTextArr.length];

        for (int i = 0; i < aTextArr.length; i++) {
            for (int j = 0; j < aTextArr.length; j++) {

                if (!aTextArr[i].isBlank()) {
                    if (aTextArr[i].compareTo(aTextArr[j]) < 0) {
                        MuratSwap.swapTwoStringsInArray(aTextArr, i, j);
                        newArr = aTextArr;
                    }
                }
            }
        }
        return newArr;
    }
}
