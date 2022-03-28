package timo.week02;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Willkommen beim super coolen Zahlen Ratespiel!");
        System.out.println("Errate die Zahl zwischen 0 und 100!");

        System.out.println("Gib mit der Zahl 1");
        int test1 = readNumberInput(sc, 0, 100 );
        System.out.println("Gib mit der Zahl 2");
        int test2 = readNumberInput(sc, 0, 100 );
        System.out.println("Gib mit der Zahl 3");
        int test3 = readNumberInput(sc, 0, 100 );

        System.out.println(test1 + " " + test2 + " " + test3);
    }


    public static int readNumberInput(Scanner sc, int minValue, int maxValue) {
        System.out.println("Gib die Zahl nun ein!");
        int number = Integer.MIN_VALUE;

        while (true) {
            System.out.print(">>>");
            if (sc.hasNextInt()) {
                number = sc.nextInt();
                if (sc.hasNextLine()) {
                    sc.nextLine();
                }
            } else {
                sc.next();
            }

            if ((number < minValue) || (number > maxValue)) {
                System.out.println("Bitte gib eine Zahl zwischen 0 und 100 ein!");
            } else {
                break;
            }
        }
        return number;
    }
}
