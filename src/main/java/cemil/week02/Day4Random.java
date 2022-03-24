package cemil.week02;

import java.util.Random;
import java.util.Scanner;

public class Day4Random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random random = new Random();
        int nu1 = readInt(sc, "Wie groß soll die Zahl sein?");
        int number = random.nextInt(nu1);

        int counter = 1;

        while (counter <= 10) {
            int nu = readInt(sc, "Gib deine Zahl ein");
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

    public static int readInt(Scanner sc, String message) {
        System.out.println(message);
        while (true) {
            if (sc.hasNextInt()) {
                return sc.nextInt();
            } else {
                System.out.println("Hey das ist keine Zahl");
                sc.next();
            }
        }
    }
}

