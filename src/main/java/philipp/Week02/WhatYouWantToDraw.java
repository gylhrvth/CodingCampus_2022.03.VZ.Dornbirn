package philipp.Week02;

import philipp.Week01.PrintCharactersVol2;

import java.util.Scanner;

public class WhatYouWantToDraw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sign = "";
        int choise;
        int size;
        boolean again = true;

        System.out.println("Willkommen bei meinen Aufgaben!");
        while (again) {
            System.out.println("Was möchten Sie zeichnen?\n" +
                    "1) Christbaum\n" +
                    "2) Quader\n" +
                    "3) Rhombus");
            System.out.println("Bitte wählen Sie nun!");
            choise = inputChoise(sc, "Bitte 1, 2 oder 3 wählen!");
            while (choise < 1 || choise > 3) {
                System.out.println("Bitte 1, 2 oder 3 wählen!");
                choise = inputChoise(sc, "Bitte 1, 2 oder 3 wählen!");
            }
            System.out.println("Wie groß soll die Zeichnung werden?(Bitte eine Zahl zwischen 5 und 50 eingeben)");
            size = inputChoise(sc, "Bitte eine Zahl zwischen 5 und 50 eingeben!");
            while (size < 5 || size > 50) {
                System.out.println("Bitte eine Zahl zwischen 5 und 50 eingeben!");
                size = inputChoise(sc, "Bitte eine Zahl zwischen 5 und 50 eingeben!");
            }
            while (sign.isEmpty() == true) {
                System.out.println("Welches Zeichen soll verwendet werden? (Max. 5 Zeichen)");
                sign = sc.nextLine();
            }
            while (sign.length() > 5) {
                System.out.println("Bitte max. 5 Zeichen eingeben!");
                sign = sc.nextLine();
            }
            outputChoise(choise, size, sign);
            sign = "";
            System.out.println();
            again = InputCalculatorImproved.calcAgain(sc, again, "Möchten Sie noch etwas zeichnen Y/N?", "Bitte Y oder N eingeben!");
        }
    }

    private static int inputChoise(Scanner sc, String alertMessage) {
        int n = Integer.MIN_VALUE;
        while (n == Integer.MIN_VALUE) {
            try {
                String text = sc.nextLine();
                n = Integer.parseInt(text);
            } catch (NumberFormatException nfe) {
                System.out.println(alertMessage);
            }
        }
        return n;
    }

    private static void outputChoise(int choise, int size, String sign) {
        if (choise == 1) {
            InputTree.tree(sign, size);
        } else if (choise == 2) {
            PrintCharactersVol2.printEmptySquare2(sign, size);
        } else if (choise == 3) {
            PrintCharactersVol2.printRhombus(sign, size);
        }
    }
}

