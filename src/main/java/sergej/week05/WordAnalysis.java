package sergej.week05;

import data.Texts;

public class WordAnalysis {

    public static String replaceChar(String text, String regex) {
        String cleanText = text.replaceAll(regex, "");
        return cleanText;
    }

    public static String[] splitString(String text) {
        String[] splitText = text.split(" ");
        return splitText;
    }

    public static String[] sortString(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) < 0) {
                    swap(array, j, j + 1);
                }
            }
        }
        return array;
    }

    public static void swap(String[] array, int indexA, int indexB) {
        String swap = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = swap;
    }


    public static void getLongestWord(String[] text) {
        String longest = "";

        for (int i = 0; i < text.length; i++) {
            if (longest.length() < text[i].length()) {
                longest = text[i];
            }

        }
        System.out.println("The longest word is: " + longest);

    }

    public static void main(String[] args) {

        String text = Texts.HESSE;

        String regexPunc = "[(,-.)\\p{Punct}]";
        String cleanText = replaceChar(text, regexPunc);
        String[] splitedText = splitString(cleanText);
        String[] sortedText = sortString(splitedText);
        getLongestWord(sortedText);

    }
}
