package murat.week2.day4;

import java.util.Scanner;

public class CalculatorContBetterVersion {
    // Asks user after every operator, if he continues with an operator or presses any key to exit.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);   // Input Scanner
        boolean[] exitDoor = new boolean[]{false};

        System.out.println("Please enter a number");
        float firstNumber = readANumberFromConsole(scan, "A number is required");

        while (!exitDoor[0]) {

            System.out.println("Please enter an operator or press any other key to exit");
            String operator = readAnOperatorFromConsole(scan, exitDoor, "Please enter an operator (+,-,*,/): ", "Stops");

            if (!exitDoor[0]) {
                System.out.println("Please enter a number");
                float secondNumber = readANumberFromConsole(scan, "A number is required");

                // The result will be the first number!
                firstNumber = operations(firstNumber, operator, secondNumber);
            }
        }
    }

    public static float readANumberFromConsole(Scanner sc, String errorMessage) {

        float aNumberToRead = Float.MAX_VALUE;
        while (aNumberToRead == Float.MAX_VALUE) {
            try {
                String userEntersAnything = sc.nextLine();
                aNumberToRead = Float.parseFloat(userEntersAnything);
            } catch (NumberFormatException thirdError) {
                System.out.println(errorMessage);
            }
        }
        return aNumberToRead;
    }

    public static String readAnOperatorFromConsole(Scanner sc, boolean[] key, String errorMessage1, String errorMessage2) {

        String anOperator = "";
        boolean loopExcapeforOperator = false;
        key[0] = false;
        while (!loopExcapeforOperator) {
            try {
                anOperator = sc.nextLine();

                if (anOperator.equals("+") || anOperator.equals("-") || anOperator.equals("*") || anOperator.equals("/")) {
                    loopExcapeforOperator = true;
                } else {
                    System.out.println("The calculator terminated!");
                    key[0] = true;
                    break;
                }
            } catch (NumberFormatException secondError) {
                System.out.println(errorMessage1);
            }
        }
        return anOperator;
    }

    public static float operations(float firstNumber, String operator, float secondNumber) {

        float result = 99;

        switch (operator) {
            case "+" -> {
                result = firstNumber + secondNumber;
                System.out.println("Sum: " + result);
            }
            case "-" -> {
                result = firstNumber - secondNumber;
                System.out.println("Subtraction: " + result);
            }
            case "*" -> {
                result = firstNumber * secondNumber;
                System.out.println("Multiplication: " + result);
            }
            case "/" -> {
                result = firstNumber / secondNumber;
                System.out.println("Division: " + result);
            }
        }
        return result;
    }
}

