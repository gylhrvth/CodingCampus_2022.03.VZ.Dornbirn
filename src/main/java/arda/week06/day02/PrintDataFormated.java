package arda.week06.day02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import static arda.week05.day01to03.DatenTabellarischDasrstellen.*;

public class PrintDataFormated {
    public static void main(String[] args) {
        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        float[] distaneFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};

        printStream(firstName, lastName, age, place, distaneFromCapital);
    }

    public static void printStream(String[] firstName, String[] lastName, int[] age, String[] place, float[] distaneFromCapital) {
        try {
            PrintStream ps = new PrintStream(new FileOutputStream("assets/tmp/FormatedData", true));
            for (int i = 0; i < firstName.length; i++) {
                ps.printf("|%" + getMaxStringLength(firstName) + "s|%" +
                                (-(getMaxStringLength(lastName))) + "s|%" +
                                (-(getMaxIntLength(age) - 2)) + "d|%" +
                                (-(getMaxStringLength(place))) + "s|%" +
                                (-(getMaxFloatLength(distaneFromCapital) + 1)) +
                                ".1f| %n", firstName[i], lastName[i], age[i],
                        place[i], distaneFromCapital[i]);
            }
        }catch (FileNotFoundException fnaf){
            fnaf.printStackTrace();
        }
    }
}