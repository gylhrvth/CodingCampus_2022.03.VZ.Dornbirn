package murat.week5.day4;

import lukas.week4.day3.Color;

import java.util.Scanner;

public class LongestCommonLetterGroup {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();

        String firstText = readUserText(input, "Please enter your first text.");
        String secondText = readUserText(input, "Please enter your second text");
        builder = findLongestLetterGroup(builder, firstText, secondText);

        if (!builder.isEmpty()) {
            System.out.println("The longest matching text : " + ANSI_RED + builder + ANSI_RESET);
        }

    }

    public static String readUserText(Scanner sc, String message) {

        System.out.println(message);
        String userText = sc.nextLine();
        while (userText.isEmpty()) {
            System.out.println("Please enter your text!");
            userText = sc.nextLine();
        }

        return userText;
    }

    // Check all possible characters in both texts
    public static StringBuilder findLongestLetterGroup(StringBuilder commonLetters, String firstText, String secondText) {

        StringBuilder longest = new StringBuilder();

        for (int i = 0; i < firstText.length(); i++) {
            for (int j = 0; j < secondText.length(); j++) {

                // System.out.println("i:" + i + " j:" + j + " - " + firstText.charAt(i) + " " + secondText.charAt((j)));
                // If there are two characters which are the same
                if (firstText.charAt(i) == secondText.charAt(j)) {

                    // Find the next characters which are the same
                    findTheFollowers(firstText, secondText, i, j, commonLetters);

                    // Find the longest text part
                    if (commonLetters.length() > longest.length()) {
                        longest = commonLetters;
                    }
                } else {
                    commonLetters = new StringBuilder(); // If there is just one pair of chars, then form a new container
                }
            }
            commonLetters = new StringBuilder();  // Everytime the second word ends, start from the beginning.
        }

        // If there is no common text
        if (longest.length() == 0) {
            System.out.println("There is no matching character!");
        }
        return longest;
    }

    // If there are 2 same chars, then search for the next chars beginning from the index which we left
    public static StringBuilder findTheFollowers(String firstText, String secondText, int i, int j, StringBuilder common) {

        for (int iSub = i, jSub = j; iSub < firstText.length() && jSub < secondText.length(); iSub++, jSub++) {

            // If the next elements are the same, append it
            if (firstText.charAt(iSub) == secondText.charAt(jSub)) {
                common.append(firstText.charAt(iSub));
               // System.out.println("isub:" + iSub + " jsub:" + jSub + " common:" + common);
            } else {
                return common;      // If not, end the search
            }
        }
        return common;
    }

    public static final String ANSI_RED = "\u001B[31m";

    public static final String ANSI_RESET = "\u001B[0m";
}
