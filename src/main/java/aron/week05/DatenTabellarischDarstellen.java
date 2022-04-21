package aron.week05;

import java.util.Arrays;

public class DatenTabellarischDarstellen {

    public static void main(String[] args) {

        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        float[] distaneFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};

        tabular(firstName, lastName, age, place, distaneFromCapital);
    }

    public static void tabular(String[] first, String[] last, int[] age, String[] place, float[] captital) {

        System.out.println("|======================================================================================|");
        System.out.printf("| %-15s | %-15s | %-4s | %-15s | %-23s | %n", "First Name", "Last Name", "Age", "Place", "Distane from Capital");
        System.out.println("|**************************************************************************************|");
        for (int i = 0; i < first.length; i++) {
            System.out.printf("| %-15s | %-15s | %4d | %-15s | %20.2f km | %n", first[i], last[i], age[i], place[i], captital[i]);
            if (i != first.length-1) {
                System.out.println("|--------------------------------------------------------------------------------------|");
            }
        }
        System.out.println("|======================================================================================|");
    }
}
