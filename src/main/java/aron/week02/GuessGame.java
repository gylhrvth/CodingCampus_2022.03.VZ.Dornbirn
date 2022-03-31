package aron.week02;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random zufall = new Random();

        int zufallZahl = 0;

        boolean aktiv = true;

        String antwort = "";

        while (aktiv) {

            System.out.println("Lustiges Zahlenraten");
            System.out.println("---------------------");
            System.out.println("Erraten Sie die Zufahlszahl in moeglichst wenigen Schritten!");
            System.out.println("Die Zahl kann zwischen 1 und 100 liegen");

            zufallZahl = 0 + zufall.nextInt(100 - 0 + 1);
            int eingabe = 0;
            int versuche = 1;

            while (eingabe != zufallZahl) {
                System.out.println("Bitte eine Zahl eingeben: ");
                eingabe = s.nextInt();

                if (eingabe < 0 || eingabe > 10000) {
                    System.out.println("Ungültige Eignabe. Bitte Eingabe wiederholen:");
                } else if (eingabe < zufallZahl) {
                    System.out.println("Die gesuchte Zahl ist groesser!");
                    versuche++;
                } else if (eingabe > zufallZahl) {
                    System.out.println("Die gesuchte Zahl ist kleiner!");
                    versuche++;
                } else if (eingabe == zufallZahl) {
                    System.out.println("Sie haben die gesuchte Zahl gefunden!");
                    System.out.println("Sie haben die " + zufallZahl + " in " + versuche + " Versuchen gefunden.");
                    break;
                }
            }

            System.out.println("Weiter spielen? (j = Ja. | n = Nein.");
            antwort = s.next();
            if (antwort.compareTo("j") == 0) {
                aktiv = true;
                System.out.println();
            } else {
                aktiv = false;
            }
        }
    }
}


