package cemil.week07;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class Day4FilesWordCount {
    public static void main(String[] args) {
        // mit Scanner sc.hasNext/sc.next
        wordCount();
//        countWords();
    }

    public static void wordCount() {
        int count = 0;
        InputStream inputStream = Objects.requireNonNull(Day4FilesWordCount.class.getClassLoader().getResourceAsStream("txt/simpleText.txt"));
        Scanner sc = new Scanner(inputStream);

        while (sc.hasNext()) {
            String text = sc.next();
            count++;
            System.out.printf("%-19s %5d\n", text, count);
        }
        System.out.println("Es sind " + count + " Wörter im Text");

    }

    // Razvan Methode
    public static void countWords() {
        int count = 0;
        try {
            File f = new File("assets/tmp/output.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNext()) {
                String text = sc.next();
                System.out.printf("%-19s %5d\n", text, count);
                count++;
            }
            System.out.println("Es sind " + count + " Wörter im Text");
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}