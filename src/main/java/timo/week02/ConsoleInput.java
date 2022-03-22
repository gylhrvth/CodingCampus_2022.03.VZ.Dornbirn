package timo.week02;

import java.util.Scanner;

public class ConsoleInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int value = Integer.MIN_VALUE;

        System.out.println("Enter a decimal number:");
        while (value == Integer.MIN_VALUE) {
            try {
                String text = sc.nextLine();
                value = Integer.parseInt(text);
            } catch (NumberFormatException nfe) {
                System.out.println("A DECIMAL NUMBER is requested you dumbass!");
            }
        }
        System.out.println("OBVIOUSLY the value is " + value);
    }
}
