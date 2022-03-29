package cemil.week02;

import java.util.Random;
import java.util.Scanner;

public class Day4Random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random random = new Random();
        int nu1 = readInt(sc, "Wie groß soll die Zahl sein?", 10 ,100);
        int number = random.nextInt(nu1);

        int counter = 1;

        while (counter <= 10) {
            int nu = readInt(sc, "Gib deine Zahl ein", 0, 100);
            if (nu == number) {
                System.out.println("Du hast gewonnen" + " " + counter + " " + "Versuche hast du gebraucht");
                break;
            } else {
                if (nu < number) {
                    System.out.println("höhere Zahl");
                } else {
                    System.out.println("kleinere Zahl");
                }
                counter++;
            }
        }
    }

    public static int readInt(Scanner sc, String message, int minValue, int maxValue) {
        System.out.println(message);
        while (true) {
            if (sc.hasNextInt()) {
                int result = sc.nextInt();
                if (sc.hasNextLine()){
                    sc.nextLine();
                }
                if ((result >= minValue) && (result <= maxValue)) {
                    return result;
                } else {
                    System.out.println("Die Zahl muss größer gleich " + minValue + " und kleiner gleich " + maxValue + " sein.");
                }

            } else {
                System.out.println("Hey das ist keine Zahl");
                sc.next();
            }
        }
    }
}

