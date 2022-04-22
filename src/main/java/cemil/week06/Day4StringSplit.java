package cemil.week06;

import java.util.Arrays;

public class Day4StringSplit {
    public static void main(String[] args) {
        String text = "Heute wird ein guter Tag! Heute wird der beste Tag überhaupt! Heute wird ein spitzen super Tag!";
        wordSplit(text);
    }
    public static void stringBuilder(String[] arr){

        System.lineSeparator();
    }

    public static void wordSplit(String text) {
        String[] text1 = text.split("Tag");
        System.out.println(Arrays.toString(text1));
    }


}
