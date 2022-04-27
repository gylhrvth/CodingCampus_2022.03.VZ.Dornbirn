package arda.week06.day03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountLetters {
    public static void main(String[] args) {
        int[] count = countLettersOfFile("/intellij/FileRead/readme.txt");
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.printf("%-2s appears %5d times. %n",(char)i,count[i]);
            }
        }
    }

    public static int[] countLettersOfFile(String filepath) {
        int[] letterCounter = new int[256];
        try {
            FileReader fr = new FileReader(filepath);
            BufferedReader br = new BufferedReader(fr);
            while (br.ready()) {
                String readLine = br.readLine();
                CountLettersByGyula.countLetters(letterCounter, readLine);
            }
            br.close();
        } catch (FileNotFoundException exc) {
            System.out.println("could not find file");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return letterCounter;
    }
}
