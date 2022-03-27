package sergej.week2;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static int targetNumber() {
        Random rand = new Random();
        int target = rand.nextInt(1000, 10000);

        return target;
    }

    public static int targetSize(int target) {
        String length = Integer.toString(target);
        int targetSize = length.length();

        return targetSize;
    }

    public static int userGuess(Scanner sc, int targetsize) {

        boolean run = true;
        int guess = 0;

        System.out.println("Guess the number of " + targetsize + " digits");

        while (run) {
            try {
                guess = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("please enter a valid number");
                sc.nextLine();
            }
            String length = Integer.toString(guess);
            if (length.length() == targetsize) {
                guess = Integer.parseInt(length);
                run = false;
            } else {
                System.out.println("please enter exactly " + targetsize + " digits");
            }
        }

        return guess;
    }

    public static int checkNumber(int guess, int target, int wincondition) {

        int correctPos = 0;
        int wrongPos = 0;

        int firstDigiGuess = (guess / 1000) % 10;
        int secondDigiGuess = (guess / 100) % 10;
        int thirdDigiGuess = (guess / 10) % 10;
        int fourthDigiGuess = guess % 10;

        int firstDigiTarget = (target / 1000) % 10;
        int secondDigiTarget = (target / 100) % 10;
        int thirdDigiTarget = (target / 10) % 10;
        int fourthDigiTarget = target % 10;


        if (firstDigiGuess == firstDigiTarget) {
            correctPos = correctPos + 1;
        }
        if (secondDigiGuess == secondDigiTarget) {
            correctPos = correctPos + 1;
        }
        if (thirdDigiGuess == thirdDigiTarget) {
            correctPos = correctPos + 1;
        }
        if (fourthDigiGuess == fourthDigiTarget) {
            correctPos = correctPos + 1;
        }

        if (firstDigiGuess == secondDigiTarget || firstDigiGuess == thirdDigiTarget || firstDigiGuess == fourthDigiTarget) {
            wrongPos = wrongPos + 1;
        }

        if (secondDigiGuess == thirdDigiTarget || secondDigiGuess == fourthDigiTarget || secondDigiGuess == firstDigiTarget) {
            wrongPos = wrongPos + 1;
        }

        if (thirdDigiGuess == secondDigiTarget || thirdDigiGuess == firstDigiTarget || thirdDigiGuess == fourthDigiTarget) {
            wrongPos = wrongPos + 1;
        }
        if (fourthDigiGuess == secondDigiTarget || fourthDigiGuess == thirdDigiTarget || fourthDigiGuess == firstDigiTarget) {
            wrongPos = wrongPos + 1;
        }

        if (firstDigiGuess == firstDigiTarget && secondDigiGuess == secondDigiTarget && thirdDigiGuess == thirdDigiTarget && fourthDigiGuess == fourthDigiTarget) {
            System.out.println("You Won! Congratulations! the target number was: " + target);
            wincondition = 1;
        }


        System.out.println("You got " + correctPos + " correct numbers in correct position");
        System.out.println("You got " + wrongPos + " correct numbers in wrong position");

        return wincondition;


    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean run = true;
        int tries = 19;

        while (run) {

            System.out.println("Welcome to Guess the Number Game!");

            int target = targetNumber();
            //System.out.println(target);

            for (int i = tries; i >= 0; --i) {
                int size = targetSize(target);
                int guess = userGuess(sc, size);
                System.out.println(guess);
                int wincondition = checkNumber(guess, target, tries);
                System.out.println("you got " + i + " tries left");
                if (i == 0) {
                    System.out.println("You have no tries left, you lost! the correct number was: " + target);
                }
                if (wincondition == 1) {
                    break;
                }
            }
            System.out.println("Do you want to play another round?");
            String answer = sc.nextLine();
            // sc.nextLine();
            answer = sc.nextLine();
            if (answer.equals("y") || answer.equals("yes") || answer.equals("j") || answer.equals("ja")) {
                run = true;
            }
            if (answer.equals("n") || answer.equals("no") || answer.equals("nein")) {
                System.out.println("OK! Goodbye!");
                run = false;
            }
        }
    }

}

