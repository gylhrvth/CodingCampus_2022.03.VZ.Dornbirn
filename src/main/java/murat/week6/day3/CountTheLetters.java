package murat.week6.day3;

import java.io.*;
import java.time.chrono.ThaiBuddhistChronology;
import java.util.Scanner;

public class CountTheLetters {
    public static void main(String[] args) {

        File file = new File("assets/tmp/Murat.txt");

        // Task 1
        System.out.println("The number of Letters: " + numberOfLetters(file));

        // Task 2
        char letter = 'm';
        System.out.println("The letter \"" + letter + "\" exits " + countChars(file, letter) + " times.");

        // Task 3
        char[] charsToCount = new char[]{'a', 'z', 'e'};
        System.out.println("There are " + countChars(file, charsToCount) + " letters.");

    }

    public static int numberOfLetters(File aFile) {

        String line;
        int sum = 0;
        try {
            BufferedReader buff = new BufferedReader(new FileReader(aFile));
            while (buff.ready()) {
                line = buff.readLine();
                sum += line.length();
            }
            buff.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return sum;
    }

    public static int countChars(File aFile, char letter) {

        int counter = 0;
        String line;
        try {
            Scanner scan = new Scanner(aFile);
            while (scan.hasNext()) {
                line = scan.nextLine();

                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == letter) {
                        counter++;
                    }
                }
            }
            scan.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }

        return counter;
    }

    public static int countChars(File aFile, char[] charsToCount) {

        int counter = 0;
        try {
            BufferedReader buff = new BufferedReader(new FileReader(aFile));

            while (buff.ready()) {
                String line = buff.readLine();

                for (int i = 0; i < charsToCount.length; i++) {

                    for (int j = 0; j < line.length(); j++) {
                        if (charsToCount[i] == line.charAt(j)) {
                            counter++;
                        }
                    }
                }
            }
            buff.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return counter;
    }

}
