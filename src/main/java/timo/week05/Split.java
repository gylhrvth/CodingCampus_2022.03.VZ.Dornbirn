package timo.week05;


import static timo.week04.StringArrays.swap;

public class Split {
    public static void main(String[] args) {

        String text = "Heute wird ein guter Tag! Heute wird der beste Tag überhaupt! Heute wird ein spitzen super Tag!";

        // Aufgabe Split
        wordSplit(text, "Tag");

        // Aufgabe Split & Sort
        String[] splitText = returnSplit(text);
        String[] sortedText = bubbleSortString(splitText, false);
        appendText(sortedText);

    }

    public static void wordSplit(String text, String word) {
        StringBuilder sb = new StringBuilder();
        String separator = System.lineSeparator();
        String[] strArr = text.split(word);

        for (int i = 0; i < strArr.length; i++) {
            sb.append(strArr[i] + separator);
        }
        System.out.println(sb);
    }

    public static String[] returnSplit(String text) {
        String[] strArr = text.split(" ");
        return strArr;
    }

    public static String[] bubbleSortString(String[] array, boolean ascending) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (ascending) {
                    if (array[j].compareTo(array[j + 1]) > 0) {
                        swap(array, j, j + 1);
                    }
                } else {
                    if (array[j].compareTo(array[j + 1]) < 0) {
                        swap(array, j, j + 1);
                    }
                }
            }
        }
        return array;
    }

    public static void appendText(String[] text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length; i++) {
            sb.append(text[i] + " ");
        }
        System.out.println(sb);
    }

}
