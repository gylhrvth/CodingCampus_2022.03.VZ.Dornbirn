package zah.week02;

import java.util.Random;
import java.util.Scanner;

public class Ratenspiel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random rand = new Random();
        int target = rand.nextInt(101);

        System.out.println(" Willkommen beim super coolen Zahlen Ratespiel!\n" +
                "Errate die Zahl zwischen 0 und 100!\n" +
                "Gib die Zahl nun ein:");
        int textValue =redNumber(sc,0,100);
        while ( textValue != target){
            if( textValue> target){
                System.out.println("Die Zahl ist zu hoch!");
            }else {
                System.out.println("Die Zahl ist zu niedrig!");
            }
            textValue= redNumber(sc, 0,100);
        }
        System.out.println(" Du hast gewonnen!");

    }


    public static int redNumber(Scanner sc, int min, int max) {
        int result = Integer.MIN_VALUE;


        while ((result < min) || (result > max)) {
            System.out.print(">>>");
            String text = sc.nextLine();
            try {
                result = Integer.parseInt(text);
            } catch (NumberFormatException nfc) {
                //

            }
        }
        return result;
    }


}



