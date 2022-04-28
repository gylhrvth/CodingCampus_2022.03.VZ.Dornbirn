package zah.week06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Scanner;

public class WordsCount {
    public static void main(String[] args) {
        countWords();
        wordCount();

    }

    public static void countWords() {
        int count = 0;
        try {
            File f = new File("assets/tmp/output.txt");
            System.out.println(f.exists());
            Scanner sc = new Scanner(f);
            while (sc.hasNext()) {
                String text = sc.next();
                //System.out.println(">>>"+text+"<<<");
                count++;
            }
            System.out.println(count);
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void wordCount() {
        int count = 0;
        InputStream inputStream = Objects.requireNonNull(WordsCount.class.getClassLoader().getResourceAsStream("txt/simpleText.txt"));
        Scanner sc = new Scanner(inputStream);
        while (sc.hasNext()) {
            String text = sc.next();
            count++;
            //System.out.printf("%-19s %5d\n", text, count);
        }
        System.out.println("Es sind " + count + " Wörter im Text");

    }

}
