package arda.week06.day03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountLetters {
    static String filePath = "/intellij/FileRead/readme.txt";
    static final String RESET = "\033[0m";
    static final String RED_BRIGHT = "\033[0;91m";
    static int[] count = countLettersOfFile(filePath);

    public static void main(String[] args) {
        amountOfLetters();
        //eachLetterAmount();
        //DynamicLetterCount.countInstanceOfWord(filePath);
    }

    public static void eachLetterAmount() {
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.printf("%-2s appears %5d times. %n", (char) i, count[i]);
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

    public static void amountOfLetters() {
        String readLine = "";
        int amountOfLetters = 0;
        try {
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);
            while (br.ready()) {
                readLine = br.readLine();
                System.out.println(readLine);
                if (!readLine.isBlank()){
                    amountOfLetters += readLine.length();
                }
            }
            br.close();
            System.out.println("this text has " + RED_BRIGHT + amountOfLetters + RESET + " letters.");
        } catch (FileNotFoundException exc) {
            System.out.println("could not find file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}