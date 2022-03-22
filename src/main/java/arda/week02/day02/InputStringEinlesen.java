package arda.week02.day02;

import arda.week01.PrintCharacters;

import java.util.Scanner;

public class InputStringEinlesen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = Integer.MIN_VALUE;
        boolean notReady = true;
        String c = "x";

        System.out.println("Enter a number between 3 and 100");
        while (notReady) {
            try {
                String text = sc.nextLine();
                value = Integer.parseInt(text);
            } catch (NumberFormatException nfe) {
                //System.out.println("=========================================================");
            }
            notReady = value < 3 || value > 100;
            if (notReady){
                System.out.println("Number is either outside the limit or not a number at all");
            }
        }
        System.out.println("===BEHOLD X!===");
        PrintCharacters.printX(c, value);
    }

}
