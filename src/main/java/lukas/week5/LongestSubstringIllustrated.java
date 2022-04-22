package lukas.week5;

import lukas.week3.day4.ConwaysGameOfLife;
import lukas.week4.day3.Color;

public class LongestSubstringIllustrated {
    public static void main(String[] args) {
        System.out.println(longestSubsequence("abcd gfhijkl mnopqrs", "mno qrs fhijk"));
    }

    public static String longestSubsequence(String lhs, String rhs) {
        String maxWord = "";
        for (int i = 0; i < lhs.length(); i++) {
            String longestSubsequence = longestSubsequence(lhs, rhs, i, maxWord);
            if (longestSubsequence.length() > maxWord.length()) {
                maxWord = longestSubsequence;
            }
        }
        return maxWord;
    }

    public static String longestSubsequence(String lhs, String rhs, int index, String maxWord) {
        String longestSubsequence = "";
        String tmp = "";
        for (int k = 0; k < rhs.length(); k++) {
            for (int i = index, j = k; i < lhs.length() && j < rhs.length(); i++, j++) {
                char charLhs = lhs.charAt(i);
                char charRhs = rhs.charAt(j);
                if (charLhs == charRhs) {
                    tmp += charLhs;
                } else {
                    if (longestSubsequence.length() < tmp.length()) {
                        longestSubsequence = tmp;
                    }
                    tmp = "";
                }
                print(lhs, rhs, index, i, j, maxWord, longestSubsequence, tmp);
            }
        }
        if (longestSubsequence.length() < tmp.length()) {
            longestSubsequence = tmp;
        }
        return longestSubsequence;
    }

    private static String replaceIndex(String text, String replacement, int index) {
        String tmp1 = text.substring(0, index);
        tmp1 += replacement;
        if (index < text.length()) {
            tmp1 += text.substring(index + 1);
        }
        return tmp1;
    }

    private static void print(String lhs, String rhs, int index, int lhsIndex, int rhsIndex, String maxWord, String currentMaxWord, String tmp) {
        ConwaysGameOfLife.clearScreen();

        System.out.println("Maxword so far: " + Color.BACKGROUND_COLORS[1] + maxWord + Color.RESET);
        System.out.println();
        System.out.println("Round: " + Color.BACKGROUND_COLORS[5] + lhs.substring(index) + Color.RESET + " VS " + Color.BACKGROUND_COLORS[5] + rhs + Color.RESET);
        System.out.println();
        System.out.println(replaceIndex(lhs.substring(index), Color.BACKGROUND_COLORS[4] + lhs.charAt(lhsIndex) + Color.RESET, lhsIndex - index));
        System.out.println(replaceIndex(rhs, Color.BACKGROUND_COLORS[4] + rhs.charAt(rhsIndex) + Color.RESET, rhsIndex));
        System.out.println("Current Maxword: " + Color.BACKGROUND_COLORS[1] + currentMaxWord + Color.RESET);
        System.out.println("Running word: " + Color.BACKGROUND_COLORS[1] + tmp + Color.RESET);

        try {
            Thread.sleep(500);
        } catch (InterruptedException exc) {
            //noop
        }
    }
}
