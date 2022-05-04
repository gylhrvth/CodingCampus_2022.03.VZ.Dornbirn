package timo.week04;

import java.util.Arrays;

public class CountLetters {
    public static void main(String[] args) {

        lukas.week4.day4.Text.getSimpleText();
       // System.out.println(lukas.week4.day4.Text.getSimpleText());

        char[] textArr = lukas.week4.day4.Text.getSimpleText().toCharArray();

        letterCounter(textArr);



    }

    public static void letterCounter(char[] textArray) {


        for (int i = 0; i < textArray.length; i++) {
            char letter = textArray[i];
            int counter = 0;
            for (int j = 0; j < textArray.length; j++) {
                if (letter == textArray[j]) {
                    counter++;
                }
            }
            System.out.println(letter + " occurs " + counter + " times");
        }
    }

}
