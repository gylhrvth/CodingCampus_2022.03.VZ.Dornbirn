package murat.week2.day3;

import java.util.Scanner;

public class BasicCalculatorOptimal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        float usersFirstNumber = Float.MAX_VALUE;
        float usersSecondNumber = Float.MAX_VALUE;

        System.out.println("Please enter the first value: ");
        usersFirstNumber = readANumberFromConsole(scan, "A number is required!");

        System.out.println("Please enter the operator: ");
        String usersOperator = readAnOperatorFromConsole(scan, "Please enter an operator (+,-,*,/): ", "An operator (+,-,*,/) is required!");

        System.out.println("Please enter the second value: ");
        usersSecondNumber = readANumberFromConsole(scan, "A number is required!");

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

    public static void operations(float firstNumber, String operator, float secondNumber) {

        switch (operator) {
            case "+" -> System.out.println("Sum: " + (firstNumber + secondNumber));
            case "-" -> System.out.println("Subtraction: " + (firstNumber - secondNumber));
            case "*" -> System.out.println("Multiplication: " + (firstNumber * secondNumber));
            case "/" -> System.out.println("Division: " + (firstNumber / secondNumber));
        }
    }
}
