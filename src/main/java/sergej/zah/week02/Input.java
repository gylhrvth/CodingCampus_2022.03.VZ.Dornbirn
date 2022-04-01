package sergej.zah.week02;


import sergej.week01.Pythagoras;
import sergej.zah.week01.day04.Methods;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        String chracter = "";
        Scanner sc = new Scanner(System.in);
        int value = Integer.MIN_VALUE;

        System.out.println("Enter a decimal number:");
        while (value == Integer.MIN_VALUE) {
            try {
                String text = sc.nextLine();
                value = Integer.parseInt(text);
            } catch (NumberFormatException nfe) {
                System.out.println("A number is requested");
            }
        }
        System.out.println(" Please enter character");
        while (chracter.length() != 1) {
            chracter = sc.nextLine();
        }
        Methods.printTriangle(chracter, value);
        Pythagoras.userInputPyth();
    }

}







