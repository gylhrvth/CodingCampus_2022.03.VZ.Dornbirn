package cemil.week02;

import java.util.Random;
import java.util.Scanner;

public class day4Random {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Random random = new Random();
        int number = random.nextInt(100);

        boolean noWin = true;

        int zähler = 1;

        while (noWin && zähler <= 10) {
            System.out.println("Gib deine Zahl ein ");
            int number1 = sc.nextInt();
            if (number1 == number) {
                System.out.println("Du hast gewonnen" + " " + zähler + " " + "Versuche hast du gebraucht");
                noWin = false;
            } else {
                if (number1 < number) {
                    System.out.println("höhere Zahl");
                } else {
                    System.out.println("kleinere Zahl");
                }
            }
            zähler++;
        }
    }

}


