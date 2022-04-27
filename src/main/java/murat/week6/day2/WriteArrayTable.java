package murat.week6.day2;

import murat.week5.day3.DisplayAsATable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class WriteArrayTable {
    public static void main(String[] args) {

        writeATable();

    }

    public static void writeATable() {

        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};

        int lengthFirstName = DisplayAsATable.getMaxString(firstName);
        int lengthLastName = DisplayAsATable.getMaxString(lastName);
        int lengthAge = DisplayAsATable.getMaxInt(age);
        int lengthPlace = DisplayAsATable.getMaxString(place);
        int lengthDist = DisplayAsATable.getMaxFloat(distanceFromCapital);

        try {
            FileOutputStream output = new FileOutputStream("assets/tmp/murat.txt", true);
            PrintStream ps = new PrintStream(output);

            ps.println("*******************************************************************");
            ps.print("| FIRST NAME       | LAST NAME     | AGE | PLACE           | DIST |\n");
            ps.println("*******************************************************************");
            for (int i = 0; i < 5; i++) {
                ps.printf("| %" + (-(lengthFirstName + 1)) + "s | %" + (-(lengthLastName + 1)) +
                        "s | %" + (lengthAge + 1) + "d | %" + (-(lengthPlace + 1)) +
                        "s |%" + (lengthDist + 3) + ".1f|%n", firstName[i], lastName[i], age[i], place[i], distanceFromCapital[i]);
            }
            ps.println("*******************************************************************");

            ps.close();

        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace(); // Pinpoints the exact line where the mistake happens
        }
    }
}
