package cemil.week07;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class Day4DynamicCountWord {
    public static void main(String[] args) {
        wordCount();
        Reader reader = new InputStreamReader(Objects.requireNonNull(Day4DynamicCountWord.class.getClassLoader().getResourceAsStream("txt/simpleText.txt")));
        dynamicCount(reader);
    }

    public static void wordCount() {
        int count = 0;
        System.out.println("Gib dein Wort ein: ");
        String word = new Scanner(System.in).next().toLowerCase();
        InputStream inputStream = Objects.requireNonNull(Day4FilesWordCount.class.getClassLoader().getResourceAsStream("txt/simpleText.txt"));
        Scanner sc = new Scanner(inputStream);
        while (sc.hasNext()) {
            String text = sc.next();
            if (text.toLowerCase().equals(word)) {
                System.out.printf("%-19s %5d\n", text, count);
                count++;
            }

//            System.out.printf("%-19s %5d\n", text, count);
        }
        System.out.println("Es sind " + count + " Wörter mit " + "'" + word + "'" + " im Text");

    }

//    Razvans Beispiel

    public static void dynamicCount(Reader reader) {
        int counter = 0;
        System.out.println("Enter a Word: ");
        String word = new Scanner(System.in).next().toLowerCase();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(reader);
            while (bufferedReader.ready()) {
                String text = bufferedReader.readLine();

                for (String tmp : text.split(" ")) {
                    if (tmp.toLowerCase().equals(word)) {
                        counter++;
                        System.out.printf("%-19s %5d\n", word, counter);
                    }
                }
            }
            System.out.println("Word is: " + counter + " times");
        } catch (IOException exc) {
            exc.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    //noop
                }
            }
        }
    }
}

