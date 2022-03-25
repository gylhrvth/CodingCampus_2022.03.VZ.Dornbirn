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

    public static void checkNumber(int guess, int target) {

        int correct = 0;
        int almost = 0;

        int fourthDigit = guess % 10; // last digit
        int thirdDigit = guess % 100; // third digit
        int secondDigit = guess % 1000; // second digit
        int firstDigit = guess % 10000; // first digit

        System.out.println("modulo>" + fourthDigit);
        System.out.println("modulo>"+ thirdDigit);
        System.out.println("modulo>"+ secondDigit);
        System.out.println("modulo>"+ firstDigit);

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int target = targetNumber();
        System.out.println(target);
        int size = targetSize(target);
        System.out.println(size);
        int guess = userGuess(sc, size);
        System.out.println(guess);
        checkNumber(guess, target);
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

