package philipp.Week02;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int value = rand.nextInt(1000, 9999);
        int inputNo;
        int guesses = 5;


        System.out.println(value);

        while (guesses > 0) {
            System.out.println("Please guess the 4 digit number between 1000 and 9999\n" + "You have " + guesses + " tries!");
            inputNo = guessNumber(sc, "Please guess the number between 1000 and 9999", 999, 10000);
            numbersToDigits(inputNo, value);
            guesses = guesses - 1;
            if (inputNo == value) {
                break;
            }
        }
        if (guesses > 0) {
            System.out.println();
            System.out.println("Nice, you have guessed the correct number: " + value);
        } else {
            System.out.println();
            System.out.println("Sorry, you did not guess the correct number!");
            System.out.println("The requested number was " + value);
        }
                }

    private static int guessNumber(Scanner sc, String alertMessage, int sizeMin, int sizeMax) {
        int n = Integer.MIN_VALUE;
        while (n == Integer.MIN_VALUE) {
            try {
                String text = sc.nextLine();
                n = Integer.parseInt(text);
                if (n < sizeMin || n > sizeMax) {
                    n = Integer.MIN_VALUE;
                    System.out.println(alertMessage);
                }
            } catch (NumberFormatException nfe) {
                System.out.println(alertMessage);
            }
        }
        return n;
    }

    private static void numbersToDigits(int guessNo, int randomNo) {
        int guessDi1 = guessNo % 10000 / 1000;
        int guessDi2 = guessNo % 1000 / 100;
        int guessDi3 = guessNo % 100 / 10;
        int guessDi4 = guessNo % 10;
        int randomDi1 = randomNo % 10000 / 1000;
        int randomDi2 = randomNo % 1000 / 100;
        int randomDi3 = randomNo % 100 / 10;
        int randomDi4 = randomNo % 10;

        if (guessDi1 == randomDi1) {
            System.out.println("Correct Number/correct Spot");
        } else if (guessDi1 == randomDi2 || guessDi1 == randomDi3 || guessDi1 == randomDi4) {
            System.out.println("Correct Number/wrong Spot");
        } else {
            System.out.println("Wrong Number");
        }
         if (guessDi2 == randomDi2) {
            System.out.println("Correct Number/correct Spot");
        } else if (guessDi2 == randomDi1 || guessDi2 == randomDi3 || guessDi2 == randomDi4) {
            System.out.println("Correct Number/wrong Spot");
        } else {
            System.out.println("Wrong Number");
        }
        if (guessDi3 == randomDi3) {
            System.out.println("Correct Number/correct Spot");
        } else if (guessDi3 == randomDi2 || guessDi3 == randomDi1 || guessDi3 == randomDi4) {
            System.out.println("Correct Number/wrong Spot");
        } else {
            System.out.println("Wrong Number");
        }
        if (guessDi4 == randomDi4) {
            System.out.println("Correct Number/correct Spot");
        } else if (guessDi4 == randomDi2 || guessDi4 == randomDi3 || guessDi4 == randomDi1) {
            System.out.println("Correct Number/wrong Spot");
        } else {
            System.out.println("Wrong Number");
        }


//        String guessNoString = Integer.toString(guessNo);
//        String guessDigit1 = guessNoString.substring(0, 1);
//        String guessDigit2 = guessNoString.substring(1, 2);
//        String guessDigit3 = guessNoString.substring(2, 3);
//        String guessDigit4 = guessNoString.substring(3, 4);
//        int guessDi1 = Integer.parseInt(guessDigit1);
//        int guessDi2 = Integer.parseInt(guessDigit2);
//        int guessDi3 = Integer.parseInt(guessDigit3);
//        int guessDi4 = Integer.parseInt(guessDigit4);
//
//        String randomNoString = Integer.toString(randomNo);
//        String randomDigit1 = randomNoString.substring(0, 1);
//        String randomDigit2 = randomNoString.substring(1, 2);
//        String randomDigit3 = randomNoString.substring(2, 3);
//        String randomDigit4 = randomNoString.substring(3, 4);
//        int randomDi1 = Integer.parseInt(randomDigit1);
//        int randomDi2 = Integer.parseInt(randomDigit2);
//        int randomDi3 = Integer.parseInt(randomDigit3);
//        int randomDi4 = Integer.parseInt(randomDigit4);
//

//        System.out.println(guessDigit1);
//        System.out.println(guessDigit2);
//        System.out.println(guessDigit3);
//        System.out.println(guessDigit4);
//
//        System.out.println(randomDigit1);
//        System.out.println(randomDigit2);
//        System.out.println(randomDigit3);
//        System.out.println(randomDigit4);

    }

}


