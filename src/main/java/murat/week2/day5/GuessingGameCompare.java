package murat.week2.day5;

import java.util.Random;
import java.util.Scanner;

/*
- Generates a random number
- Asks the user if it is correct.
- The user can try 10 times (or a value times)
- The program displays the correct positions
 */

public class GuessingGameCompare {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int bound = 10000;                             // Upper limit of random number
        int limitOfTries = 10;                         // Upper limit of tries
        int randomNumber = rand.nextInt(bound);
        int randomNumberConstant = randomNumber;

        int lengthOfRandomNumber = getANumbersLength(bound, randomNumber);

        int tries = 1;    // Start of tries

        System.out.println("Welcome to the game!");
        System.out.println("Guess the randomly generated number and win a prize!");

        // Ask user if he wants to play...
        while (true) {

            // Read the number from user
            int usersNumber = readANumberFromUser(input, lengthOfRandomNumber, bound);

            // If the user presses "N", it returns an impossible number and exits, for example bound+1 (upper limit +1)
            if (usersNumber == (bound + 1)) {
                break;
            }

            int rightNumbers = 0;
            int positionOfRightNumber;
            int lengthOfIndex;

            // Find the right numbers with modulo
            for (int i = 10; i < bound + 1; i *= 10) {
                if ((randomNumber) % 10 == (usersNumber) % 10) {
                    rightNumbers++;
                    lengthOfIndex = getANumbersLength(bound, i);

                    positionOfRightNumber = 6 - lengthOfIndex;
                    System.out.println(positionOfRightNumber + ". position is right");
                }

                // Take the next number on the left to compare
                randomNumber /= 10;
                usersNumber /= 10;
            }

            if (tries == limitOfTries) {
                System.out.println("GAMEOVER! After " + tries + " tries you lost.");
                System.out.println("Random Number was " + randomNumberConstant);
                break;
            }

            // Won?
            if (rightNumbers == lengthOfRandomNumber) {
                System.out.println("YOU WON!");
                break;
            }

            System.out.println("In total " + rightNumbers + " numbers are correct");
            System.out.println((tries + 1) + ". try");

            tries++;
            randomNumber = randomNumberConstant;
        }
    }

    public static int readANumberFromUser(Scanner sc, int upperLimit, int bound) {

        System.out.println("Please enter a " + upperLimit + " digit number or N to exit");
        int number = Integer.MAX_VALUE;
        String anyTextUserEnters = "";

        while (number == Integer.MAX_VALUE) {
            try {
                anyTextUserEnters = sc.nextLine();
                number = Integer.parseInt(anyTextUserEnters);
                int lengthOfNumber = getANumbersLength(bound, number);

                // If the random number has 4 digits and users number x digits
                if (lengthOfNumber != upperLimit) {
                    System.out.println("Please enter a " + upperLimit + " digit number");
                    number = Integer.MAX_VALUE;
                }

            } catch (NumberFormatException nfe) {

                // If the user presses "N", it returns an impossible number and exits, for example bound+1 (upper limit +1)
                if (anyTextUserEnters.equals("N")) {
                    number = bound + 1;
                    System.out.println("SWITCH OFF");
                } else {
                    System.out.println("A number is required!");    // If the user enters letters instead of numbers
                }
            }
        }
        return number;
    }

    public static int getANumbersLength(int bound, int number) {

        int length = 1;

        for (int j = 10; j < bound + 1; j *= 10) {

            if (number >= j) {
                length++;
            }
        }
        return length;
    }

}

