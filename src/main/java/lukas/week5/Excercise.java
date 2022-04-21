package lukas.week5;

import data.Texts;

public class Excercise {
    public static void main(String[] args) {
        String word = "Hesse";
        String replace = Texts.HESSE.replace(word, word.toUpperCase());
        System.out.println(replace);
    }
}
