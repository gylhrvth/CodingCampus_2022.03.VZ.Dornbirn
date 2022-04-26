package philipp.week06;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

public class ReadWriteFiles {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        readWriteUserInputToFile();
        writeDataToFileTabular();

    }

    private static void writeDataToFileTabular() {
        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};

        try {
            File f = new File("assets/tmp/output.txt");
            f.getParentFile().mkdirs();
            PrintStream ps = new PrintStream(new FileOutputStream(f, false));
            ps.println("*".repeat(104));
            ps.printf("| %-20s | %-20s | %3s | %-20s | %25s |%n", "First Name", "Last Name", "Age", "Place", "Distance from Capital");
            ps.print("-".repeat(104));
            ps.println();
            for (int i = 0; i < firstName.length; i++) {
                ps.printf(Locale.US, "| %-20s | %-20s | %3s | %-20s | %25.2f |%n", firstName[i], lastName[i], age[i], place[i], distanceFromCapital[i]);
            }
            ps.println("*".repeat(104));
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }

    private static void readWriteUserInputToFile() {
        String text = " ";
        try {
            PrintStream ps = new PrintStream(new FileOutputStream("C:\\Users\\user\\Desktop\\testFile.txt", true));
            while (!text.isEmpty()) {
                System.out.println("Please enter Text:");
                text = sc.nextLine();
                ps.println(text);
            }
            ps.close();
        } catch (
                FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }

    private static void printStringToFile(String text) {
        try {
            PrintStream ps = new PrintStream(new FileOutputStream("C:\\Users\\user\\Desktop\\testFile.txt", true));
            ps.println(text);
            ps.close();
        } catch (
                FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }
}