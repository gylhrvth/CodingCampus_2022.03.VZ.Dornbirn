package murat.week2.day5;

import java.util.Random;
import java.util.Scanner;

public class GuessingRandomNumberGameOverTryAgain {

    public static void main(String[] args) {
        // The user chooses a number between 0-100 and guesses the random number.

        Scanner input = new Scanner(System.in);
        int randomNumber = new Random().nextInt(100);               // Generate a random number between 0-100
        int tries = 1;
        System.out.println("Welcome to our guessing game");

        while (true) {

            int chosenNumber = readNumberFromUser(input);

            if (tries == 10) {
                System.out.println("10 Tries - GAME OVER");
                System.out.println("Would you like to play again? Then press enter, otherwise press any other key");
                String again;
                again = input.nextLine();
                if (again.equals("")) {
                    chosenNumber = readNumberFromUser(input);
                    tries = 1;
                } else {
                    System.out.println("See you again");
                    break;
                }
            }

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
