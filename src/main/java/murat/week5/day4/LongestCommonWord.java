package murat.week5.day4;

import java.util.Scanner;

public class LongestCommonWord {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String firstText = readUserText(input, "Please enter your first word.");
        String secondText = readUserText(input, "Please enter your second word");

        System.out.println("The longest word is: " + findLongestCommonWord(firstText, secondText));
    }

    public static String readUserText(Scanner sc, String message) {

        System.out.println(message);
        return sc.nextLine();
    }

    public static String findLongestCommonWord(String firstText, String secondText) {

        String rgx = " ";
        String commonWord;
        String longestWord = "";
        String[] firstTextArr = firstText.split(rgx);
        String[] secondTextArr = secondText.split(rgx);

        for (int i = 0; i < firstTextArr.length; i++) {
            for (int j = 0; j < secondTextArr.length; j++) {

                if (firstTextArr[i].equalsIgnoreCase(secondTextArr[j])) {
                    commonWord = firstTextArr[i];
                    if (commonWord.length() >= longestWord.length()) {
                        longestWord = commonWord;
                    }
                } else {
                    System.out.println("There is no common word!");
                    longestWord = "NONE";
                }
            }
        }
        return longestWord;
    }
}
