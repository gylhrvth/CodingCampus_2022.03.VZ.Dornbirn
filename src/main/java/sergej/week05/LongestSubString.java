package sergej.week05;

public class LongestSubString {

    public static void getLongestSub(String firstWord, String secondWord) {
        char[] first = firstWord.toCharArray();
        char[] second = secondWord.toCharArray();
        String word = "";


        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                if (first[i] == second[j]) {
                    word += first[i];
                    break;
                }
            }
        }
        System.out.println(word);
    }


    public static void main(String[] args) {

        String word1 = "Barbarasergej";
        String word2 = "Rharbarbasergej";
        getLongestSub(word1, word2);
    }
}
