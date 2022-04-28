package zah.week06;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class ReplaceFirstWithSecondWord {
    public static void main(String[] args) {
        InputStream reader = Objects.requireNonNull(ReplaceFirstWithSecondWord.class.getClassLoader().getResourceAsStream("txt/simpleText.txt"));
        replaceWord(reader);

    }

    public static void replaceWord(InputStream reader) {
        int count = 0;
        System.out.println("Gib dein erstes Wort ein das zum ersetzen ist: ");
        String word = new Scanner(System.in).next();
        System.out.println("Gib dein zeites Wort ein das zum ersetzen ist: ");
        String word2 = new Scanner(System.in).next();
        System.out.println();
        Scanner sc = new Scanner(reader);
        while (sc.hasNextLine()) {
            String text = sc.nextLine();
            System.out.println(text.replaceAll(word, word2));
//            System.out.printf("%-19s %5d\n", text, count);
        }
//        StringBuilder builder = new StringBuilder();
//        while (sc.hasNextLine()) {
//            String text = sc.nextLine();
//            builder.append(text);
//            builder.append(System.lineSeparator());
//        }
//
//        String text = builder.toString();
//
//        text = text.replaceAll(word, word2);
//
//        System.out.println(text);


        System.out.println("Es sind " + count + " Wörter mit " + "'" + word + "'" + " im Text");

    }


}
