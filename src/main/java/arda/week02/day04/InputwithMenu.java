package arda.week02.day04;

import arda.week01.PrintCharacters;

import java.util.Scanner;

public class InputwithMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==!welcome!==");
        boolean execution = true;
        while (execution) {
            System.out.println("which one would you like to print?");
            System.out.println("(1) square \n(2) emptysquare \n(3) triangle");
            int userinput = readUserInput(sc, 1, 3);
            int size = readSize(sc);
            String character = readCharacter(sc);
            printCharacter(character, size, userinput);
            execution = tryagain(sc);
        }
    }

    public static int readUserInput(Scanner sc, int minvalue, int maxvalue) {
        int userinput = Integer.MIN_VALUE;
        boolean b = true;
        while (b) {
            try {
                String text = sc.nextLine();
                userinput = Integer.parseInt(text);
                if (userinput < minvalue || userinput > maxvalue) {
                    System.out.println("only pick a number between " + minvalue + " and " + maxvalue);
                } else {
                    System.out.println("you chose" + " " + userinput);
                    b = false;
                }
            } catch (NumberFormatException text) {
                System.out.println("come on man, choose a number");
            }
        }
        return userinput;
    }

    public static int readSize(Scanner sc) {
        System.out.println("how big should the body be? choose between 1 and 100");
        int size = readUserInput(sc, 1, 100);
        return size;
    }

    public static String readCharacter(Scanner sc) {
        System.out.println("what should the character look like?");
        String character = "";

        while (true) {
            character = sc.nextLine();
            if (character.length() != 1) {
                System.out.println("please only enter one character");
            } else {
                System.out.println(character + " is a very nice pick");
                break;
            }
        }

        return character;
    }

    public static void printCharacter(String character, int size, int userInput) {
        if (userInput == 1) {
            PrintCharacters.printSquare(character, size);
        } else if (userInput == 2) {
            PrintCharacters.printEmptySquare(character, size);
        } else if (userInput == 3) {
            PrintCharacters.printTriangle(character, size);
        } else {
            System.out.println("printCharacter(): userinput is not supported yet!");
        }
    }

    public static boolean tryagain(Scanner sc) {
        System.out.println(" ");
        System.out.println("would you like to try again?");
        boolean tryAgain = true;
        boolean execution = true;

        while (tryAgain) {
            String answer = sc.nextLine();
            if (answer.equals("y")) {
                execution = true;
                tryAgain = false;
            } else if (answer.equals("n")) {
                execution = false;
                tryAgain = false;
            } else {
                System.out.println("please answer y/n");
            }
        }
        return execution;
    }
}
