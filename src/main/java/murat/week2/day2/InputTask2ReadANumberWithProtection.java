package murat.week2.day2;

import java.util.Scanner;

public class InputTask2ReadANumberWithProtection {

    public static void main(String[] args) {

        System.out.println("Please enter a number: ");

        Scanner sc = new Scanner(System.in);
        long inputAsALong = Long.MAX_VALUE;

        while (inputAsALong == Long.MAX_VALUE) {                 // Limit the user entry with Long MAX = 9,223,372,036,854,775,807
            try {
                String ifInputAsAText = sc.nextLine();
                inputAsALong = Long.parseLong(ifInputAsAText);
            } catch (NumberFormatException nfe) {
                System.out.println("Please try again");
            }
        }
        System.out.println("The number you entered is: " + inputAsALong);
    }
}
