package murat.week6.day3;

import java.io.*;
import java.util.Scanner;

public class ReadAFile {
    public static void main(String[] args) {

        // 1-Scanner 2-BufferedReader
        readAFile(2);

    }

    public static void readAFile(int whichOne) {

        if (whichOne == 1) {
            try {
                File file = new File("assets/tmp/AdaBlackjack.txt");
                Scanner input = new Scanner(file);
                while (input.hasNext()) {
                    String line = input.nextLine();
                    System.out.println(line);
                }
                input.close();
            } catch (FileNotFoundException fnf) {
                fnf.printStackTrace();
            }

        } else if (whichOne == 2) {
            try {
                FileReader file = new FileReader("assets/tmp/AdaBlackjack.txt");
                BufferedReader buffer = new BufferedReader(file);
                while (buffer.ready()) {
                    String line = buffer.readLine();
                    System.out.println(line);
                }
                buffer.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        } else {
            System.out.println("Please choose 1 or 2");
        }
    }
}
