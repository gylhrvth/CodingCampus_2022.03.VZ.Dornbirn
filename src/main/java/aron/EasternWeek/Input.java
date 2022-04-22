package aron.EasternWeek;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

                String name = "";
                while (name.trim().length() == 0) {
                    System.out.println("Bitte geben Sie einen Text ein:");
                    name = sc.nextLine();
        }


        int value = Integer.MIN_VALUE;
        System.out.println("Wie oft soll der Text ausgegen werden");

        while (value == Integer.MIN_VALUE) {
            try {
                String num = sc.nextLine();

                value = Integer.parseInt(num);
            } catch (NumberFormatException nfe) {
                System.out.println("Bitte wiederholen");
            }
        }

        for (int i = 0; i < value; i++)

            System.out.println(name);
    }
}
