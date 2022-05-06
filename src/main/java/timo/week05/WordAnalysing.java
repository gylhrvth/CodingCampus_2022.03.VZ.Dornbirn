package timo.week05;

import lukas.data.Texts;

public class WordAnalysing {
    public static void main(String[] args) {

        String text = Texts.HESSE;

        String cleanUp = "[(,-.)\\p{Punct}]";
        String newText = text.replaceAll(cleanUp, "");

        String[] strArr = newText.split(" ");
        System.out.println(newText);
        System.out.println("Longest String is: " + getLongestString(strArr));
        System.out.println("Shortest String is: " + getShortestString(strArr));


    }


    public static String getLongestString(String[] arr) {
        String longest = "";
        for (int i = 0; i < arr.length; i++) {
            if (longest.length() < arr[i].length()) {
                longest = arr[i];
            }
        }
        return longest;
    }

    public static String getShortestString(String[] arr) {
        String shortest = "";
        for (int i = 0; i < arr.length; i++) {
            if (shortest.length() > arr[i].length()) {
                shortest = arr[i];
            }
        }
        return shortest;
    }


}
