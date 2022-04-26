package timo.week06;

import timo.week05.DateTable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import static timo.week05.DateTable.getMaxNumberLength;
import static timo.week05.DateTable.getStringLength;


public class WriteTable {
    public static void main(String[] args) {

        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};


        try {
            File f = new File("assets/tmp/timo.txt");
            File dir = new File(f.getParent());
            dir.mkdirs();
            PrintStream ps = new PrintStream(new FileOutputStream(f, false));


            printDateTable(System.out, firstName, lastName, age, place, distanceFromCapital);
            printDateTable(ps, firstName, lastName, age, place, distanceFromCapital);

            ps.close();

        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }

    }

    public static void printDateTable(PrintStream ps, String[] name1, String[] name2, int[] age, String[] place, float[] distance) {

        String distanceHeader = "Distance to the next capital";
        int firstNameL = getStringLength(name1);
        int lastNameL = getStringLength(name2);
        int ageL = getMaxNumberLength(age);
        int placeNameL = getStringLength(place);
        int distanceL = (int)Math.max(3 + getMaxNumberLength(distance), distanceHeader.length());

        String header = String.format("| %-"+firstNameL+"s | %-"+lastNameL+"s | %"+ageL+"s | %-"+placeNameL+"s | %"+distanceL+"s |", "First Name", "Last Name", "Age", "Place", distanceHeader);
        ps.println(header);
        ps.println("-".repeat(header.length()));

        for (int i = 0; i < name1.length; i++) {
            String formatString = "| %-"+firstNameL+"s | %-"+lastNameL+"s | %"+ageL+"d | %-"+placeNameL+"s | %"+distanceL+".2f | %n";
            ps.printf(formatString, name1[i], name2[i], age[i], place[i], distance[i]);

        }
    }


}
