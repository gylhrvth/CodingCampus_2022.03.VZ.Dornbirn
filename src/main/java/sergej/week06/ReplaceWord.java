package sergej.week06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Objects;
import java.util.Scanner;

public class ReplaceWord {


    public static void replaceWord(Reader reader) {
        BufferedReader bufferedReader = null;
        System.out.println("What word would you like to replace?");
        String wordA = new Scanner(System.in).next();
        System.out.println("With what should " + ">>" + wordA + "<<" + " be replaced with ?");
        String wordB = new Scanner(System.in).next();

        try {
            bufferedReader = new BufferedReader(reader);
            while (bufferedReader.ready()) {
                String textString = bufferedReader.readLine();
                String cleantext = textString.replaceAll(wordA, wordB);
                System.out.println(cleantext);
            }

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
        replaceWord(reader);

    }
}
