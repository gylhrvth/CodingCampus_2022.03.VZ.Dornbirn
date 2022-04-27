package arda.week06.day03;

public class CountLettersByGyula {
    public static void main(String[] args) {
        int[] letterCounter = new int[256];
        String text = lukas.week4.day4.Text.getSimpleText();
        System.out.println(text);
        countLetters(letterCounter, text);

        for (int i = 0; i < letterCounter.length; i++) {
            System.out.println((char)i + " " + letterCounter[i]);
        }
    }

    public static void countLetters(int[] letterCounter, String text) {
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 0 && chars[i] < letterCounter.length){
                ++letterCounter[chars[i]];
            } else {
                System.out.println("Extended Char: " + chars[i]);
            }
        }

    }
}
