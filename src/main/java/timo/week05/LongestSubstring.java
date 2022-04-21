package timo.week05;

public class LongestSubstring {
    public static void main(String[] args) {

        getLongestSubstring("ey bro integer digga ", "was geht bro integer digga");
        getLongestSubstring2("Barbara", "Rharbarba");

    }


    public static void getLongestSubstring(String text1, String text2) {

        String[] strArr1 = text1.split(" ");
        String[] strArr2 = text2.split(" ");
        String subString = "";

        for (String wordA : strArr1) {
            for (String wordB : strArr2) {
                if (wordA.equals(wordB) && subString.length() < wordA.length()) {
                    subString = wordA;
                    break;
                }
            }
        }
        System.out.println(subString);
    }


    public static void getLongestSubstring2(String text1, String text2) {

        char[] charArr1 = text1.toCharArray();
        char[] charArr2 = text2.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < charArr1.length; i++) {
            for (int j = 0; j < charArr2.length; j++) {
                if (charArr1[i] == charArr2[j]) {
                    sb.append(charArr1[i]);
                    i = j;
                }
            }
        }
        System.out.println(sb);
    }

}





