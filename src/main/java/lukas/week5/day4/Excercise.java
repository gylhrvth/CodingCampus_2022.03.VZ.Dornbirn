package lukas.week5.day4;

import lukas.data.Texts;

public class Excercise {
    public static void main(String[] args) {
        String word = "Hesse";
        String replace = Texts.HESSE.replace(word, word.toUpperCase());
        System.out.println(replace);
    }
}
