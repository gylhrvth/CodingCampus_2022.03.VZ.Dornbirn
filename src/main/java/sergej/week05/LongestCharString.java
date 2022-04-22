package sergej.week05;

import java.util.Scanner;

public class LongestCharString {

    public static void getLongestSubChar(String firstWord, String secondWord) {


        char[] first = firstWord.toCharArray();
        char[] second = secondWord.toCharArray();
        StringBuilder word = new StringBuilder();


        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                if (first[i] == second[j] && first[i - 1] == second[j - 1]) {
                    word.append(first[i]);
                    break;
                }
            }
        }
        System.out.println(word);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = "Barbarasergej";
        String word2 = "Rharbarbasergej";

        getLongestSubChar(word1, word2);
    }
}
