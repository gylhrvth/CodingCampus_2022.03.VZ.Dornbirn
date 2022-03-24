package murat.week2.day4;

import java.util.Random;
import java.util.Scanner;

public class RateSpiel {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int randomNumber = new Random().nextInt();

        while (true) {

            if (randomNumber < readNumberFromUser(input)) {
                System.out.println("Too big, please try again!");
            } else if (randomNumber > readNumberFromUser(input)) {
                System.out.println("Too small, please try again!");
            } else if (randomNumber == readNumberFromUser(input)) {
                System.out.println("You won :)");
                break;
            }
        }
    }

    public static int readNumberFromUser(Scanner scan) {

        int number = 0;
        System.out.println("Please enter a number.");
        String readAString = scan.nextLine();

        try {
            number = Integer.parseInt(readAString);
        } catch (NumberFormatException nfe) {
            System.out.println("A number is required");
        }
        return number;
    }
}
