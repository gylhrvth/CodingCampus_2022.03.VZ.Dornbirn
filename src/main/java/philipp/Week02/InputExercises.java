package philipp.Week02;

import java.util.Scanner;

public class InputExercises {
    public static void main(String[] args) {
    /* Scanner sc = new Scanner(System.in);
        int value = Integer.MIN_VALUE;

        System.out.println("Enter a decimal number:");
        while (value == Integer.MIN_VALUE) {
            try {
                String text = sc.nextLine();
                value = Integer.parseInt(text);
            } catch (NumberFormatException nfe) {
                System.out.println("A number is requested");
            }
        }
        System.out.println("The value is " + value);
    }*/

        //Enter String
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String text = sc.nextLine();
        System.out.println(text);
        System.out.println();

        //Enter Number for ChristmasTree
        System.out.println("Enter Size of Tree");
        int amount = Integer.MIN_VALUE;
        while (amount == Integer.MIN_VALUE) {
            try {
                String Input = sc.nextLine();
                amount = Integer.parseInt(Input);
            } catch (NumberFormatException nfe) {
                System.out.println("A number is requested");
            }
        }
        for (int i = 0; i < amount; i++) {
            printCharsNoNewLine(" ", (amount - 1 - i));
            if (i > 0) {
                System.out.print("*");
                printCharsNoNewLine("*", i * 2 - 1);
            }
            System.out.println("*");
        }
        printChars("O ", amount);
        for (int j = 0; j < amount / 4; j++) {
            int s = (amount / 4 * 2) + 1;
            printCharsNoNewLine(" ", (amount - 1 - s / 2));
            printCharsNoNewLine("+", s);
            System.out.println();
        }
    }

    public static void printCharsNoNewLine(String name, int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print(name);
        }
    }

    public static void printChars(String name, int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print(name);
        }
        System.out.println();
    }
}

