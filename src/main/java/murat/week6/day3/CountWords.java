package murat.week6.day3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CountWords {
    public static void main(String[] args) {

        File file = new File("assets/tmp/Murat.txt");
        System.out.println("The number of words: " + countingWords(file));
    }

    public static int countingWords(File file) {

        String line;
        int wordCounter =0;
        try {
            BufferedReader buffer = new BufferedReader(new FileReader(file));
            while (buffer.ready()) {
                line = buffer.readLine();

                if(!line.isBlank()){
                    String[] lineOfWords = line.split(" ");
                    wordCounter += lineOfWords.length;
                }
            }
            buffer.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();

        }
        return wordCounter;
    }
}
