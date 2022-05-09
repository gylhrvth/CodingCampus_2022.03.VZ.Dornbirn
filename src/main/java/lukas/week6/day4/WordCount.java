package lukas.week6.day4;

import lukas.data.Texts;

import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        String input = Texts.getSimpleText();
        input = input.replaceAll("[^a-zA-Z]+", " ");
        System.out.println("Enter word:");
        String word = new Scanner(System.in).next().toLowerCase();

        int wordCounter = 0;
        for (String tmp : input.split(" ")) {
            if (tmp.toLowerCase().equals(word)) {
                wordCounter++;
            }
        }
        System.out.println("Word count is: " + wordCounter);
    }
}
