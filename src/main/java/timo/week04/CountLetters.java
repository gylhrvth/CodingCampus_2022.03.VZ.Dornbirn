package timo.week04;

import java.util.Arrays;

public class CountLetters {
    public static void main(String[] args) {

        lukas.week4.day4.Text.getSimpleText();
       // System.out.println(lukas.week4.day4.Text.getSimpleText());

        letterCounter();



    }

    public static void letterCounter() {
        char[] textArray = lukas.week4.day4.Text.getSimpleText().toCharArray();

        for (int i = 0; i < textArray.length; i++) {
            char test = textArray[i];
            int counter = 0;
            for (int j = 0; j < textArray.length; j++) {
                if (test == textArray[j]) {
                    counter++;
                }
            }
            System.out.println(test + " occurs " + counter + " times");
        }
    }

 /*   public static void letterCounter2() {
        char[] text = lukas.week4.day4.Text.getSimpleText().toCharArray();

        for (int i = 0; i < text.length; i++) {
            text[]

        }
        }
    }

  */

}
