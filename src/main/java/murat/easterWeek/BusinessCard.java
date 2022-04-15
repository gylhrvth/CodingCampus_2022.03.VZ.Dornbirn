package murat.easterWeek;

import java.util.Scanner;

// Gets username, telephone number and e-mail address and displays it as a business card.
public class BusinessCard {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name = getUserText(input, "Please enter your name.", "Please enter [1,30] characters");
        String tel = getUserText(input, "Please enter your telephone number.", "Please enter [1,30] characters");
        String eMail = getUserText(input, "Please enter your e-mail address.", "Please enter [1,30] characters");

        int times = adjustLength(name, tel, eMail);  // If the length of the text exceeds 17, we have to multiply.
        int height = 11 * times;
        int length = 17 * times * 2;                 // It is 2 because screen height ist 1.2 times length in the terminal
        printBusinessCard(name, tel, eMail, height, length);

    }

    // Gets the length of the longest text (name, tel, E-Mail)
    public static int longestText(String name, String tel, String eMail) {

        int maxLength = Math.max(name.length(), tel.length());
        maxLength = Math.max(maxLength, eMail.length());
        return maxLength;
    }

    // Takes the max length of texts and adjusts the length of the business card
    public static int adjustLength(String name, String tel, String eMail) {

        int longestText = longestText(name, tel, eMail);
        int times = (longestText / 17);

        return (times + 1);
    }

    // Main body of the business card
    public static void printBusinessCard(String name, String tel, String eMail, int height, int length) {

        // Upper body of the business card - Stars and blanks
        for (int i = 0; i < (height - 3) / 2; i++) {
            for (int j = 0; j < length; j++) {
                if (i == 0 || j == 0 || j == length - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Middle section of the business card where name, tel and email exist
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                printARowWithText(length, name);
            } else if (i == 1) {
                printARowWithText(length, tel);
            } else {
                printARowWithText(length, eMail);
            }
        }

        // Lower body of the business card - Stars and blanks
        for (int i = 0; i < (height - 3) / 2; i++) {
            for (int j = 0; j < length; j++) {
                if (i == (height - 3) / 2 - 1 || j == 0 || j == length - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Prints just blanks
    public static void generateBlanks(int limit) {

        for (int i = 0; i < limit; i++) {
            System.out.print(" ");
        }
    }

    // Prints a row of the text in the middle.
    public static void printARowWithText(int length, String text) {

        System.out.print("*");

        if (text.length() % 2 == 0) {
            generateBlanks((length - text.length() - 2) / 2);
        } else {
            generateBlanks((length - text.length() - 2) / 2 + 1);
        }

        System.out.print(text);
        generateBlanks((length - text.length() - 2) / 2);
        System.out.print("*\n");
    }

    public static String getUserText(Scanner sc, String infoMessage, String warning) {

        System.out.println(infoMessage);
        String text;
        while (true) {
            text = sc.nextLine();
            if (text.length() < 1 || text.length() > 30) {
                System.out.println(warning);
            } else {
                break;
            }
        }
        return text;
    }

}
