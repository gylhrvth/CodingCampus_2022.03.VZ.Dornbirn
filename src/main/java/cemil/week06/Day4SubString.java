package cemil.week06;

import java.util.Arrays;
import java.util.Scanner;

public class Day4SubString {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Gib Text 1 ein!");
//        String text1 = sc.nextLine();
//        System.out.println("Gib Text 2 ein!");
//        String text2 = sc.nextLine();
//        longestWord1(text1, text2);
        String textA = "ABCDEFGH";
        String textB = "123456789EFGH987654321";
//        System.out.println(textA.substring(3, 6));
//        System.out.println(textB.substring(3, 6));

        System.out.println(zeichenKette(textA, textB));
        System.out.println(zeichenKetteGyula(textA, textB));


    }

    public static String zeichenKette(String word, String word2) {
        String maxWord = "";
        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                String text = word.substring(i, j + 1);
                if (word2.indexOf(text) > -1 && text.length() > maxWord.length()) {
                    maxWord = text;
                }
            }
        }
        return maxWord;
    }

    public static String zeichenKetteGyula(String word, String word2) {
        for (int testLength = word.length(); testLength > 0 ; testLength--) {
            for (int testStartPos = 0; testStartPos <= word.length() - testLength; testStartPos++) {
                String text = word.substring(testStartPos, testStartPos + testLength);
                if (word2.indexOf(text) > -1) {
                    return text;
                }
            }
        }
        return "";
    }



    public static void longestWord1(String first, String second) {
        String[] arr = first.split(" ");
        String[] arr2 = second.split(" ");
        String longestWord = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; ) {
                if (arr[i].equals(arr2[j]) && longestWord.length() < arr[i].length()) {
                    longestWord = arr[j];
                    System.out.println(longestWord);
                }
                break;
            }

        }
    }

}
