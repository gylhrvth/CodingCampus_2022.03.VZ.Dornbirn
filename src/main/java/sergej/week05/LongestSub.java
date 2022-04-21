package sergej.week05;

import java.util.Scanner;

public class LongestSub {

    public static void getLongestEqualword(String firstWord, String secondWord) {

        String[] first = firstWord.split(" ");
        String[] second = secondWord.split(" ");
        String word = "";

        for (String wordLhs : first) {
            for (String wordRhs : second) {
                if (wordLhs.equals(wordRhs) && word.length() < wordLhs.length()) {
                    word = wordLhs;
                    break;
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
