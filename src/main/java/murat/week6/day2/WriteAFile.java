package murat.week6.day2;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class WriteAFile {
    public static void main(String[] args) {

        readUserInput();
    }

    public static void readUserInput() {

        System.out.println("Please enter your text!");
        Scanner input = new Scanner(System.in);

        String userText = "NotEmpty";
        while (!userText.isEmpty()) {
            userText = input.nextLine();
            try {
                FileOutputStream output = new FileOutputStream("assets/tmp/murat.txt", true);
                PrintStream ps = new PrintStream(output);
                ps.println(userText);
                ps.close();

            } catch (FileNotFoundException fnfe) {
                fnfe.printStackTrace(); // Pinpoints the exact line where the mistake happens
            }
        }
    }
}
