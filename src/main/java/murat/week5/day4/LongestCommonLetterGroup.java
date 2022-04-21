package murat.week5.day4;

import java.util.Scanner;

public class LongestCommonLetterGroup {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();

        String firstText = readUserText(input, "Please enter your first word.");
        String secondText = readUserText(input, "Please enter your second word");
        builder = findLongestLetterGroup(builder, firstText, secondText);

        if (!builder.isEmpty()) {
            System.out.println("The longest matching text : " + builder);
        }

    }

    public static String readUserText(Scanner sc, String message) {

        System.out.println(message);
        return sc.nextLine();
    }

    // Check all possible characters in both texts
    public static StringBuilder findLongestLetterGroup(StringBuilder commonLetters, String firstText, String secondText) {

        StringBuilder longest = new StringBuilder();

        for (int i = 0; i < firstText.length(); i++) {
            for (int j = 0; j < secondText.length(); j++) {

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
            } else {
                return common;      // If not, end the search
            }
        }
        return common;
    }
}
