package murat.week5.day5;

public class Permutation {
    public static void main(String[] args) {

        permutation("", "ABCD");
    }

    private static void permutation(String prefix, String text) {

        int textLength = text.length();

        if (textLength == 0) {
            System.out.println("Done: " + prefix + "--------------------------------------------------------------------------\n");
        } else {
            for (int i = 0; i < textLength; i++) {
                System.out.println("i: " + i + " Combined_(Prefix): " + (prefix + text.charAt(i)) + " Chosen_Letter: " + text.charAt(i) + " Left: " + text.substring(0, i) + " Right: " + text.substring(i + 1, textLength) + " New_Text_to_Iterate: " + text.substring(i + 1, textLength) + text.substring(0, i));
                permutation(prefix + text.charAt(i), text.substring(i + 1, textLength) + text.substring(0, i));
            }
        }
    }
}
