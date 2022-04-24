package aron.week05;

import java.util.Scanner;

public class LongestSharedSubstringBonus {

    public static void main(String[] args) {
/*

        Scanner sc1 = new Scanner(System.in);

        String text1 = "";
        while (text1.trim().length() == 0) {
            System.out.println("Bitte geben Sie den ersten Satz ein:");
            text1 = sc1.nextLine();

        }

        Scanner sc2 = new Scanner(System.in);

        String text2 = "";
        while (text2.trim().length() == 0) {
            System.out.println("Bitte geben Sie den zweiten Satz ein:");
            text2 = sc2.nextLine();

        }
*/
        String text1 = "Hello World!";
        String text2 = "I need some Help!";
        System.out.println(getLongestMatchAron(text1, text2));

        /*
        for (int i = 0; i < text1.length(); i++) {
            for (int j = i; j < text2.length(); j++) {
                String max = word.substring(i, j);
                System.out.println(max);
                (text2.indexOf(max) > -1&& max.length() > word.length()) {
                    word = max;
                }
                System.out.println("The longest word is:" + max );

            }
        }
         */
    }

    public static String getLongestMatchAron(String text1, String text2){
        int bestStart = 0;
        int bestMatching = 0;

        for (int startText1 = 0; startText1 < text1.length(); startText1++) {
            for (int startText2 = 0; startText2 < text2.length(); startText2++) {
                int matchingLength = 0;
                while (
                        (startText1 + matchingLength < text1.length()) &&
                                (startText2 + matchingLength < text2.length()) &&
                                (text1.charAt(startText1 + matchingLength) == text2.charAt(startText2 + matchingLength))
                ) {
                    ++matchingLength;
                }
                if (matchingLength > bestMatching){
                    bestStart = startText1;
                    bestMatching = matchingLength;
                }
            }
        }
        return text1.substring(bestStart, bestStart + bestMatching);
    }

    public static String getLongestMatch(String text1, String text2){
        for (int lengthToTest = text1.length(); lengthToTest > 0 ; lengthToTest--) {
            for (int startPos = 0; startPos <= text1.length() - lengthToTest; startPos++) {
                String testString = text1.substring(startPos, startPos + lengthToTest);
                if (text2.indexOf(testString) > 0){
                    return testString;
                }
            }
        }
        return "";
    }
}
