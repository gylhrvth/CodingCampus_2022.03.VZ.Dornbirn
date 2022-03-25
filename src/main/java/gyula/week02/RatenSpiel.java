package gyula.week02;

import java.util.Random;
import java.util.Scanner;

public class RatenSpiel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int target = rand.nextInt(101);

        System.out.println("Willkommen beim super coolen Zahlen Ratespiel!\n" +
                "Errate die Zahl zwischen 0 und 100!\n" +
                "Gib die Zahl nun ein:");

        int testValue = readNumber(sc, 0, 100);
        while (testValue != target){
            if (testValue > target){
                System.out.println("Die Zahl ist zu hoch!");
            } else {
                System.out.println("Die Zahl ist zu niedrig!");
            }
            testValue = readNumber(sc, 0, 100);
        }
        System.out.println("Du hast gewonnen!!!");
    }

    public static int readNumber(Scanner sc, int minValue, int maxValue){
        int result = Integer.MIN_VALUE;

        while ((result < minValue) || (result > maxValue)) {
            System.out.print(">>>");
            String text = sc.nextLine();
            try {
                result = Integer.parseInt(text);
            } catch (NumberFormatException nfe) {
                // Do nothing
            }
        }
        return result;
    }

    public static int readNumber2(Scanner sc, int minValue, int maxValue){
        int result = Integer.MIN_VALUE;

        while ((result < minValue) || (result > maxValue)) {
            System.out.print(">>>");
            while (!sc.hasNextInt()){
                sc.next();
                System.out.print(">>>");
            }
            result = sc.nextInt();
        }
        return result;
    }

}
