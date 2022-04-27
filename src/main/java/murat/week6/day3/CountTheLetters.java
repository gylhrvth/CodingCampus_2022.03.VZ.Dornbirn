package murat.week6.day3;

import java.io.*;
import java.util.Scanner;

public class CountTheLetters {
    public static void main(String[] args) {

        // System.out.println("The number of Letters: " + numberOfLetters());

        File file = new File("assets/tmp/Murat.txt");
        char letter = 'm';
        System.out.println("\nThe letter \"" + letter + "\" exits " + countChars(file, letter) + " times.");
    }

    public static int numberOfLetters() {

        String line;
        int sum = 0;
        try {
            FileReader reader = new FileReader("assets/tmp/AdaBlackjack.txt");
            BufferedReader buff = new BufferedReader(reader);
            while (buff.ready()) {
                line = buff.readLine();
                System.out.println(line);
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
            // File file = new File("assets/tmp/Murat.txt");
            Scanner scan = new Scanner(aFile);
            while (scan.hasNext()) {
                line = scan.nextLine();

                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == letter) {
                        counter++;
                    }
                }
            }

        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }

        return counter;
    }
}
