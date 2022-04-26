package zah.week06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class DatenTabelle {
    public static void main(String[] args) {
        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};


        tabellreader(firstName, lastName, age, place, distanceFromCapital);
    }

    public static void tabellreader(String[] first, String[] last, int[] age, String[] place, float[] distance) {
        try {
            File f = new File("assets/tmp/output.txt");
            f.getParentFile().mkdirs();
            PrintStream ps = new PrintStream(new FileOutputStream(f, false));
            String headerLine = String.format("| %-20s| %-20s|%5s | %-20s| %19s |", "First Name", "Last Name", "Age", "Place", "Distance");
            ps.println(headerLine);
            ps.println("|" + "-".repeat(headerLine.length() - 2) + "|");
            for (int i = 0; i < first.length; i++) {
                ps.printf("| %-20s| %-20s|%5d | %-20s|%17.2f km |%n", first[i], last[i], age[i], place[i], distance[i]);

            }
            ps.close();
        }catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }


    }
}
