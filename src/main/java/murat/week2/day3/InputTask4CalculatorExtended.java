package murat.week2.day3;

import java.util.Scanner;

public class InputTask4CalculatorExtended {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);   // Input Scanner
        continueOrNot(scan, "Want more?Then please press enter, if not press any key", "Calculator stops");

    }

    public static void continueOrNot(Scanner sc, String question, String message) {

        boolean userNeedsNewOperations = false;
        calculator();

        while (!userNeedsNewOperations) {

            System.out.println(question);
            String enter = sc.nextLine();

            if ((enter.equals(""))) {             // If the user wants to continue, presses Enter
                calculator();
            } else {
                System.out.println(message);
                userNeedsNewOperations = true;    // If the user do not want to continue, presses any other key
            }
        }
    }

    public static void calculator() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the first value: ");
        float usersFirstNumber = readANumberFromConsole(scan, "A number is required!");

        System.out.println("Please enter the operator: ");
        String usersOperator = readAnOperatorFromConsole(scan, "Please enter an operator (+,-,*,/): ", "An operator (+,-,*,/) is required!");

        System.out.println("Please enter the second value: ");
        float usersSecondNumber = readANumberFromConsole(scan, "A number is required!");

        operations(usersFirstNumber, usersOperator, usersSecondNumber);
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

    public static String readAnOperatorFromConsole(Scanner sc, String errorMessage1, String errormessage2) {

        String AnOperator = "";
        boolean loopExcapeforOperator = false;

        while (!loopExcapeforOperator) {
            try {
                AnOperator = sc.nextLine();

                if (AnOperator.equals("+") || AnOperator.equals("-") || AnOperator.equals("*") || AnOperator.equals("/")) {
                    loopExcapeforOperator = true;
                } else {
                    System.out.println(errormessage2);
                }
            } catch (NumberFormatException secondError) {
                System.out.println(errorMessage1);
            }
        }
        return AnOperator;
    }

    public static float operations(float firstNumber, String operator, float secondNumber) {

        float result = 0;

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
