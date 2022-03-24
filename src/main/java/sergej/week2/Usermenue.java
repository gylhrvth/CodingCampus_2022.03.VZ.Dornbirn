package sergej.week2;

import sergej.week01.Pythagoras;
import sergej.week01.TestGraphic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Usermenue {

    public static void userInput(int choosen, Scanner sc) {

        String square = "Square";
        String rhombus = "Rhombus";
        String circle = "Circle";
        String character = "";
        String pattern = "";

        int value = Integer.MIN_VALUE;

        if (choosen == 1) {
            pattern = square;
        } else if (choosen == 2) {
            pattern = rhombus;
        } else if (choosen == 3) {
            pattern = circle;
        }


        System.out.println("Please enter the size of the " + pattern);

        while (value == Integer.MIN_VALUE) {
            try {
                String number = sc.nextLine();
                value = Integer.parseInt(number);
            } catch (NumberFormatException nfe) {
                System.out.println("please enter valid number");

            }
            System.out.println("you choose: " + value);
        }

        System.out.println("Which character would you like to use? ");

        while (character.length() != 1) {
            try {
                character = sc.nextLine();
            } catch (NumberFormatException nfe) {
                System.out.println("please enter a text");

            }
            System.out.println("you choose: " + character);
            //printCirclePythagoras(value, x);
        }

        if (choosen == 3) {
            Pythagoras.printCirclePythagoras(value, character);
        } else if (choosen == 2) {
            TestGraphic.printRhombus(character, value);
        } else if (choosen == 1) {
            TestGraphic.printEmptySquare(character, value);
        }
    }

    public static int menu(Scanner sc) {

        int square = 1;
        int rhombus = 2;
        int circle = 3;
        int choosen = 0;
        boolean run = true;

        System.out.println("Welcome! what would you like to draw?");

        while (run) {

            System.out.println("1) Square");
            System.out.println("2) Rhombus");
            System.out.println("3) Circle");

            try {
                choosen = sc.nextInt();
                sc.nextLine();

                if (choosen == 1 || choosen == 2 || choosen == 3) {
                    //System.out.println(choosen);
                    run = false;
                } else {
                    System.out.println("please enter valid option");
                }
            } catch (InputMismatchException e) {
                System.out.println("please enter a valid number!");
                sc.nextLine();
                run = true;
            }
        }

        return choosen;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean start = true;

        while (start) {
            int choice = menu(sc);
            userInput(choice, sc);
            System.out.println("Would you like to draw again ? (y/n)");
            String userChoice = sc.nextLine();
            if (userChoice.equals("y")) {
                start = true;
            } else if (userChoice.equals("n")) {
                System.out.println("Ok, Good Bye!");
                start = false;
            } else {
                System.out.println("please enter either y or n! >>>" + userChoice + "<<<");
            }

        }

    }
}
