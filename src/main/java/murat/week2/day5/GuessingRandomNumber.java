package murat.week2.day5;

import java.util.Random;
import java.util.Scanner;

public class GuessingRandomNumber {
    public static void main(String[] args) {
        // The user chooses a number between 0-100 and guesses the random number.

        Scanner input = new Scanner(System.in);
        int randomNumber = new Random().nextInt(0, 100);
        int tries = 1;
        System.out.println("Welcome to our guessing game");

        while (true) {

            int chosenNumber = readNumberFromUser(input);

            if (randomNumber < chosenNumber) {
                System.out.println("Too big, please try again!");
                tries++;
            } else if (randomNumber > chosenNumber) {
                System.out.println("Too small, please try again!");
                tries++;
            } else {
                System.out.println("After " + tries + " tries you won :)");
                break;
            }
        }
    }

    public static int readNumberFromUser(Scanner scan) {

        int number = Integer.MAX_VALUE;
        System.out.println("Please choose a number between 0-100.");

        while (number == Integer.MAX_VALUE) {
            try {
                String readAString = scan.nextLine();
                number = Integer.parseInt(readAString);
            } catch (NumberFormatException nfe) {
                System.out.println("A number is required");
            }
        }
        return number;
    }
}
