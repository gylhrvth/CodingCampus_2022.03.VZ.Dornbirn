package zah.week06;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class DynamicWordCount {
    public static void main(String[] args) {
        Reader reader = new InputStreamReader(Objects.requireNonNull(DynamicWordCount.class.getClassLoader().getResourceAsStream("txt/simpleText.txt")));
        InputStream inputStream = Objects.requireNonNull(DynamicWordCount.class.getClassLoader().getResourceAsStream("txt/simpleText.txt"));
        dynamicCount(reader);
        wordCount(inputStream);

    }

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
    public static void wordCount(InputStream inputStream) {
        int count = 0;
        System.out.println("Gib dein Wort ein: ");
        String word = new Scanner(System.in).next().toLowerCase();

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
}

