package murat.week6.day3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SwapTwoWords {
    public static void main(String[] args) {

        File file = new File("assets/tmp/Murat.txt");
        countSpecificWord(file, "murat", "MURAT");

    }

    public static void countSpecificWord(File aFile, String firstWord, String secondWord) {

        try {
            BufferedReader buffer = new BufferedReader(new FileReader(aFile));
            while (buffer.ready()) {
                String line = buffer.readLine();

                // Find the word in a line
                int index = 0;
                while (true) {
                    int a = line.indexOf(firstWord, index);
                    if (a == -1) {
                        break;
                    } else {
                        index = a + 1;
                        line = line.replaceAll(firstWord, secondWord);
                    }
                }
                System.out.println(line);
            }
            buffer.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
