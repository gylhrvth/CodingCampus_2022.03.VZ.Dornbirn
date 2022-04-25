package arda.toybox;

import java.util.Scanner;

public class Toys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = "";
        String msg2 = "";
        //user input with custom messages.
        userInputYorN(sc, msg, msg2);
    }

    public static String userInputYorN(Scanner sc, String msg, String msg2) {
        String userInput = "";
        while (true) {
            userInput = sc.nextLine();
            if (userInput.equals(msg)) {
                System.out.println("you chose: " + msg);
                break;
            } else if (userInput.equals(msg2)) {
                System.out.println("you chose: " + msg2);
                break;
            } else {
                System.out.println("enter either " + msg + " or " + msg2);
            }
        }
        return userInput;
    }
}
