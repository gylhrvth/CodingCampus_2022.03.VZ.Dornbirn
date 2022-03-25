package sergej.week2;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static int targetNumber() {
        Random rand = new Random();
        int target = rand.nextInt(10000);
        String length = Integer.toString(target);
        int targetSize = length.length();

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

    public static void checkNumber(int guess, int target, int targetSize) {

        int correct = 0;
        int almost = 0;

        String targetStr = Integer.toString(target);
        String guessStr = Integer.toString(guess);

        Scanner scanTarget = new Scanner(targetStr).useDelimiter("");
        int aT = scanTarget.nextInt();
        int bT = scanTarget.nextInt();
        int cT = scanTarget.nextInt();
        int dT = scanTarget.nextInt();

        Scanner scanGuess = new Scanner(guessStr).useDelimiter("");
        int aG = scanGuess.nextInt();
        int bG = scanGuess.nextInt();
        int cG = scanGuess.nextInt();
        int dG = scanGuess.nextInt();

        for (int i = 0; i < targetSize; ++i) {
            if (aT == aG || aT == bG || aT == cG || aT == dG) {
                correct = correct + 1;
                System.out.println(correct);
                break;
            } else {
                System.out.println("test");
            }
        }

        if (aT == aG) {
            correct = correct + 1;
            System.out.println("you Won!");

        } else if (bT == bG) {
            System.out.println("try again..");
        }

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int target = targetNumber();
        System.out.println(target);
        int size = targetSize(target);
        System.out.println(size);
        int guess = userGuess(sc, size);
        System.out.println(guess);
        checkNumber(guess, target, size);
        //int singleChar = sc.nextInt(target).charAt(0);

        //String input = "1234";
        // Scanner s = new Scanner(input).useDelimiter("");
        //int a = s.nextInt();
        //int b = s.nextInt();
        //int c = s.nextInt();
        //int d = s.nextInt();

        // System.out.println(a + "<" + b + "<" + c);

    }

}

