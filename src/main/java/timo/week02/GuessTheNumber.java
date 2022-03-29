package timo.week02;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int hiddenNumber = rand.nextInt(101);
        boolean executing = true;

        System.out.println("***** Willkommen beim super coolen Zahlen Ratespiel! *****");
        System.out.println("Errate die Zahl zwischen 0 und 100!");
        System.out.println("Gib die Zahl nun ein:");
        //System.out.println("THE RANDOM NUMBER IS " + hiddenNumber); // Testing only

        while (executing) {
            int userNumber = readNumberInput(sc);
            compareNumber(userNumber, hiddenNumber);
            executing = userNumber != hiddenNumber;
        }
    }

    public static int readNumberInput(Scanner sc) {
        int number = Integer.MAX_VALUE;

        while (number == Integer.MAX_VALUE) {
            System.out.print(">>>");
            try {
                String text = sc.nextLine();
                number = Integer.parseInt(text);
            } catch (NumberFormatException nfe) {
                System.out.println("Bitte gib eine gültige Zahl ein!");
            }
        }
        return number;
    }

    public static void compareNumber(int inputNumber, int generatedNumber) {

        if (inputNumber == generatedNumber) {
            System.out.println("***** Glückwunsch du hast gewonnen!! *****");
        } else if (inputNumber < generatedNumber) {
            System.out.println("Die Zahl ist zu klein!");
        } else if (inputNumber > generatedNumber) {
            System.out.println("Die Zahl ist zu groß!");
        }
    }

}
