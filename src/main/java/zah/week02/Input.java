package zah.week02;

import sergej.week01.ChristmasTree;
import sergej.week01.Pythagoras;
import zah.week01.day04.Methods;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        String character = "";

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

        System.out.println("Enter a character:");

        while (character.length() != 1){
            try {
                character = sc.nextLine();
            } catch (NumberFormatException nfe){
                System.out.println("please enter a character");
            }
        }
        System.out.println("The value is " + value);
        //Methods.printTriangle(character,value);
    }




}
