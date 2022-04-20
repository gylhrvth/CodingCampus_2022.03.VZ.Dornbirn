package zah.week05;

import java.util.Arrays;

public class DAtenTabellarisch {
    public static void main(String[] args) {

        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        float[] distaneFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};


        tabellreader(firstName, lastName, age, place, distaneFromCapital);


    }

    public static void tabellreader(String[] first, String[] last, int[] age, String[] place, float[] distance) {

        String headerLine = String.format("| %-20s| %-20s|%5s | %-20s| %19s |", "First Name", "Last Name", "Age", "Place", "Distance");
        System.out.println(headerLine);
        System.out.println("|" + "-".repeat(headerLine.length() - 2) + "|");

        for (int i = 0; i < first.length; i++) {

            System.out.printf("| %-20s| %-20s|%5d | %-20s|%17.2f km |%n", first[i], last[i], age[i], place[i], distance[i]);


        }

    }
}
