package timo.week02;

import timo.week01.LoopMethods;

import java.util.Scanner;

public class InputChristmasTree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int value = Integer.MIN_VALUE;

        System.out.println("Enter the desired size for your Christmas Tree");

        while (value <= 3 || value >= 100) {
            System.out.println("Only positive numbers between 3 and 100 are allowed");

            try {
                String text = sc.nextLine();
                value = Integer.parseInt(text);
            } catch (NumberFormatException nfe) {
                System.out.println("A NUMBER is requested you dumbass!");
            }
        }
        System.out.println("--------- Merry Christmas! ---------");
        LoopMethods.printChristmasTree(value);
    }

}
