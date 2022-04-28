package sergej.week06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Objects;
import java.util.Scanner;

public class CountWordsFile {


    public static void countDynamicWord(Reader reader) {
        BufferedReader bufferedReader = null;
        System.out.println("Enter word:");
        String word = new Scanner(System.in).next().toLowerCase();
        int wordCounter = 0;
        try {
            bufferedReader = new BufferedReader(reader);
            while (bufferedReader.ready()) {
                String textString = bufferedReader.readLine();
                String cleantext = textString.replaceAll("[[0-9]\s\\p{Punct}]", " ");
                String[] temp = cleantext.split(" ");

                for (int i = 0; i < temp.length; i++) {
                    if (temp[i].length() > 0 && temp[i].toLowerCase().equals(word)) {
                        System.out.println(temp[i]);
                        wordCounter++;
                    }
                }

            }

            System.out.println("Word count is: " + wordCounter);
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


    public static void countAllWord(Reader reader) {
        BufferedReader bufferedReader = null;

        int wordCounter = 0;

        try {
            bufferedReader = new BufferedReader(reader);
            while (bufferedReader.ready()) {
                String textString = bufferedReader.readLine();
                String cleantext = textString.replaceAll("[[0-9]\s\\p{Punct}]", " ");
                String[] temp = cleantext.split(" ");

                for (int i = 0; i < temp.length; i++) {
                    if (temp[i].length() > 0) {
                        System.out.println(temp[i]);
                        wordCounter++;
                    }
                }
            }
            System.out.println("Word count is: " + wordCounter);
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


    public static void main(String[] args) {
        Reader reader = new InputStreamReader(Objects.requireNonNull(CountWordsFile.class.getClassLoader().getResourceAsStream("txt/simpleText.txt")));

        //countAllWord(reader);
        countDynamicWord(reader);

    }
}
