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

        // Ask user if he wants to play...
        while (true) {

            int usersNumber = readANumberFromUser(input, lengthOfRandomNumber, bound);

            System.out.println("Users Number: " + usersNumber);

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

                // Take the next number on the left
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
            System.out.println("Would you like to try again? Then press ENTER, otherwise any other key");

            // Again? Press Enter

            String again;
            again = input.nextLine();
            if (!again.equals("")) {
                System.out.println("OFF");
                break;
            } else {
                System.out.println((tries + 1) + ". try");
                tries++;
                randomNumber = randomNumberConstant;
            }
        }
    }

    public static int readANumberFromUser(Scanner sc, int upperLimit, int bound) {

        System.out.println("Please enter a " + upperLimit + " digit number");
        int number = Integer.MAX_VALUE;

        while (number == Integer.MAX_VALUE) {
            try {
                String anyTextUserEnters = sc.nextLine();
                number = Integer.parseInt(anyTextUserEnters);
                int lenghtOfNumber = getANumbersLength(bound, number);
                if (lenghtOfNumber != upperLimit) {
                    System.out.println("Please enter a " + upperLimit + " digit number");
                    number = Integer.MAX_VALUE;
                }

            } catch (NumberFormatException nfe) {
                System.out.println("A number is required!");
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

