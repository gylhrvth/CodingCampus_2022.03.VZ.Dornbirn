package timo.week06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;


public class CountWords {
    public static void main(String[] args) throws IOException {
        Reader reader = new InputStreamReader(Objects.requireNonNull(CountWords.class.getClassLoader().getResourceAsStream("txt/simpleText.txt")));
        BufferedReader br = new BufferedReader(reader);

        // System.out.println("Total count of words is: " + countWords(br));
        // countSpecificWord(br, "Curie");
        replaceSpecificWord(br, "Marie", "Detlef");
    }


    public static int countWords(BufferedReader file) throws IOException {
        BufferedReader bufferedReader = null;
        int wordcount = 0;

        try {
            bufferedReader = new BufferedReader(file);

            while (file.ready()) {
                String text = file.readLine();
                String cleaned = text.replaceAll("[[0-9]\s\\p{Punct}]", " ");
                String[] textArr = cleaned.split(" ");
                for (int i = 0; i < textArr.length; i++) {
                    if (textArr[i].length() > 0) {
                        wordcount++;
                    }
                }
            }

        } catch (IOException exc) {
            exc.printStackTrace();

        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException exc) {
                    //noop
                }
            }
        }
        return wordcount;
    }

    public static void countSpecificWord(BufferedReader file, String word) {
        BufferedReader reader = null;
        int wordcount = 0;

        try {
            reader = new BufferedReader(file);

            while (reader.ready()) {
                String text = file.readLine();
                String cleaned = text.replaceAll("[[0-9]\s\\p{Punct}]", " ");
                String[] textArr = cleaned.split(" ");

                for (int i = 0; i < textArr.length; i++) {
                    String tmp = textArr[i];
                    if (tmp.length() > 0 && tmp.equalsIgnoreCase(word)) {
                        wordcount++;
                    }
                }
            }
            System.out.println(word + " occurs " + wordcount + " times in text");
        } catch (IOException exc) {
            exc.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException exc) {
                    //noop
                }
            }
        }
    }

    public static void replaceSpecificWord(BufferedReader file, String wordA, String wordB) {
        BufferedReader reader = null;
        int wordcount = 0;

        try {
            reader = new BufferedReader(file);

            while (reader.ready()) {
                String text = file.readLine();
                String newText = text.replaceAll(wordA, wordB);
                System.out.println(newText);
            }

        } catch (IOException exc) {
            exc.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException exc) {
                    //noop
                }
            }
        }
    }


}
