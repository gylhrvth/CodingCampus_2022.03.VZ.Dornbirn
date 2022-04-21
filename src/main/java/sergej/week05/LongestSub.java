package sergej.week05;

import java.util.Scanner;

public class LongestSub {

    public static void getLongestEqualword(String firstWord, String secondWord) {

        String[] first = firstWord.split(" ");
        String[] second = secondWord.split(" ");
        String word = "";

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                if (first[i].equals(second[j]) && word.length() < first[i].length()) {
                    word = first[i];
                }
            }
        }
        System.out.println("The longest matching word is: " + word);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word1 = "test fest klar etwas timokant";
        String word2 = "test mist timokant etwas";

        getLongestEqualword(word1, word2);

    }
}
