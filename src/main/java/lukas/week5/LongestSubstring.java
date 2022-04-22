package lukas.week5;

public class LongestSubstring {
    public static void main(String[] args) {
        System.out.println(longestSubsequenceWrong("Rhabarber", "Barbara"));
        System.out.println(longestSubsequenceWrong("Barbara", "Rhabarber"));
        System.out.println(longestSubsequenceWrong("abcd gfhijkl mnopqrs", "mno qrs fhijk"));
        System.out.println(longestSubsequence2("abcd gfhijkl mnopqrs", "mno qrs fhijk"));
        System.out.println(longestSubsequence2("mno qrs fhijk", "abcd gfhijkl mnopqrs"));
    }

    public static String longestSubsequence2(String lhs, String rhs) {
        String maxWord = "";
        for (int i = 0; i < lhs.length(); i++) {
            for (int j = i; j < lhs.length(); j++) {
                String tmp = lhs.substring(i, j + 1);
                if (rhs.indexOf(tmp) > -1 && tmp.length() > maxWord.length()) {
                    maxWord = tmp;
                }
            }
        }
        return maxWord;
    }

    public static String longestSubsequenceWrong(String lhs, String rhs) {
        String maxWord = "";
        for (int i = 0; i < lhs.length(); i++) {
            String longestSubsequence = longestSubsequenceWrong(lhs, rhs, i);
            if (longestSubsequence.length() > maxWord.length()) {
                maxWord = longestSubsequence;
            }
        }
        return maxWord;
    }

    public static String longestSubsequenceWrong(String lhs, String rhs, int index) {
        String longestSubsequence = "";
        String tmp = "";
        for (int i = index, j = 0; i < lhs.length() && j < rhs.length(); i++, j++) {
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
        }
        if (longestSubsequence.length() < tmp.length()) {
            longestSubsequence = tmp;
        }
        return longestSubsequence;
    }
}
