package zah.week06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class WriteFile {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        textReader(sc);
       // textReader1(sc);
    }

    public static void textReader(Scanner sc) {
        System.out.println("Please enter a text!");
        String input = " ";

        try {
            PrintStream ps = new PrintStream(new FileOutputStream("C:\\Users\\zah_r\\Desktop\\text\\Razvan.txt", true));
            while (input.length() != 0) {
                input = sc.nextLine();
                ps.println(input);
            }
            ps.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }

    }

    public static void textReader1(Scanner sc) {
        String input = " ";

        try {
            File f = new File("assets/tmp/output.txt");
            f.getParentFile().mkdirs();
            PrintStream ps = new PrintStream(new FileOutputStream(f, false));
            while (input.length() != 0) {
                input = sc.nextLine();
                ps.println(input);
            }
            ps.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }

    }
}

