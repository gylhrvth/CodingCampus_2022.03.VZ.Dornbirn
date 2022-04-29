package cemil.week07;

import java.io.InputStream;
import java.util.Objects;
import java.util.Scanner;

public class Day4ReplaceAll {
    public static void main(String[] args) {
        wordCount();
    }

    public static void wordCount() {

        System.out.println("Gib dein erstes Wort ein das zum ersetzen ist: ");
        String word = new Scanner(System.in).next();
        System.out.println("Gib dein zeites Wort ein das zum ersetzen ist: ");
        String word2 = new Scanner(System.in).next();
        System.out.println();
        InputStream inputStream = Objects.requireNonNull(Day4FilesWordCount.class.getClassLoader().getResourceAsStream("txt/simpleText.txt"));
        Scanner sc = new Scanner(inputStream);
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

    }
}
