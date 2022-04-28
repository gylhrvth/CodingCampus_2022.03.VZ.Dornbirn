package murat.week6.day3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CountWordsDynamic {
    public static void main(String[] args) {

        File file = new File("assets/tmp/Murat.txt");
        System.out.println("The word you are looking for " + countSpecificWord(file, "murat") + " times in the text.");

    }

    public static int countSpecificWord(File aFile, String word) {

        int wordCount = 0;
        try {
            BufferedReader buffer = new BufferedReader(new FileReader(aFile));
            while (buffer.ready()) {
                String line = buffer.readLine();
                System.out.println(line);
                int index = 0;

                // Find the word in a line
                while (true) {
                    int a = line.indexOf(word, index);
                    if (a == -1) {
                        break;
                    } else {
                        index = a + 1;
                        wordCount++;
                    }
                }
            }
            buffer.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return wordCount;
    }
}
