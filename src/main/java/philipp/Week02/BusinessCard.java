package philipp.Week02;

import java.util.Scanner;

public class BusinessCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        String phoneNr = "";
        String eMail = "";
        int cardLength = 85 - (85 / 3);
        int cardHeight = (55 - (55 / 3)) * 10 / 26 - 1;

        name = readInput(sc, name, "Please enter your name. (max. 30 characters)");
        phoneNr = readInput(sc, phoneNr, "Please enter your phone number. (max. 30 characters)");
        eMail = readInput(sc, name, "Please enter your eMail address. (max. 30 characters)");

        phoneNr = "PhoneNr: " + phoneNr;
        eMail = "E-Mail: " + eMail;

        name = adjustLengthText(name);
        phoneNr = adjustLengthText(phoneNr);
        eMail = adjustLengthText(eMail);

        philipp.Week01.PrintCharacters.printChars("*", cardLength);
        emptyPartCard("*", cardLength, cardHeight);
        cardPartWithText("*", name, cardLength);
        cardPartWithText("*", phoneNr, cardLength);
        cardPartWithText("*", eMail, cardLength);
        emptyPartCard("*", cardLength, cardHeight);
        philipp.Week01.PrintCharacters.printChars("*", cardLength);
    }

    private static String readInput(Scanner sc, String input, String inputMsg) {
        System.out.println(inputMsg);
        input = sc.nextLine();
        if (input.length() < 1 || input.length() > 30) {
            System.out.println(inputMsg);
            input = sc.nextLine();
        }
        return input;
    }

    private static void emptyPartCard(String edges, int length, int height) {
        for (int i = 0; i < (height - 5) / 2; i++) {
            System.out.print(edges);
            for (int j = 0; j < length - 2; j++) {
                System.out.print(" ");
            }
            System.out.println(edges);
        }
    }

    private static void cardPartWithText(String edges, String text, int length) {
        System.out.print(edges);
        int k =(length - text.length()) * 10 / 20 - 1;
        for (int j = 0; j < k; j++) {
            System.out.print(" ");
        }
        System.out.print(text);
        for (int j = 0; j < k; j++) {
            System.out.print(" ");
        }
        System.out.println(edges);

    }

    private static String adjustLengthText(String text) {
        if (text.length() % 2 == 0) {
            text = text + " ";
        }
        return text;
    }
}
