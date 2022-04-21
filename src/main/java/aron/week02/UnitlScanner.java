package aron.week02;

import aron.week01.PrintCharacters;

import java.util.Scanner;

public class UnitlScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = Integer.MIN_VALUE;
        String x = " x";
        boolean notReady = true;

        System.out.println("Enter a decimal number:");
        while (notReady) {

            try {
                String text = sc.nextLine();
                value = Integer.parseInt(text);
            } catch (NumberFormatException nfe) {
                System.out.println("A number is requested");
            }
            notReady = (value <= 4) || (value > 50);
            if (notReady) {
                System.out.println("The number is under 3 or over 50");
            }
        }
        System.out.println("The value is " + value);
        PrintCharacters.printChristmastree("x", value);
    }
}

