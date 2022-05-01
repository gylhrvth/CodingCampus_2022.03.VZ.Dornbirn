package murat.muratStandardLibrary;

import java.util.Scanner;

public class MuratInput {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number!");
        //System.out.println(readANumberFromUserWithMaxValue(scan, 1, 10));
        System.out.println(readANumberFromUserWithMaxValue(scan, 1, 10));

    }

    public static int readANumberFromUserWithMaxValue(Scanner sc, int lowerLimit, int upperLimit) {

        int number = Integer.MAX_VALUE;
        while (number == Integer.MAX_VALUE) {
            try {
                String readAnyText = sc.nextLine();
                number = Integer.parseInt(readAnyText);

                if (number < lowerLimit || number > upperLimit) {
                    System.out.println("A number between [" + lowerLimit + "," + upperLimit + "] is required. Please try again.");
                    number = Integer.MAX_VALUE;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("A number is required!");
            }
        }
        return number;
    }

    public static int readUserNumberWithHasNextInt(int lowerLimit, int upperLimit) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the column number!");
        while (true) {
            if (sc.hasNextInt()) {
                int col = sc.nextInt();
                if (col < lowerLimit || col > upperLimit) {
                    System.out.println("A number between [" + lowerLimit + "," + upperLimit + "] is required. Please try again.");
                } else {
                    return col;
                }
            } else {
                System.out.println("An integer is required!");
                sc.nextLine();
            }
        }
    }
}
