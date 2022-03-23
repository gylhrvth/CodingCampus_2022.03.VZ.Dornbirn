package murat.week2.day3;

import java.util.Scanner;

public class InputTask3CalculatorWithCharAt {
    public static void main(String[] args) {
        // User enters the first value and the program proves it.
        // User enters the operator and the program proves it.
        // User enters the second value and the program proves it.

        Scanner scan = new Scanner(System.in);
        float usersFirstNumber = Float.MAX_VALUE;
        float usersSecondNumber = Float.MAX_VALUE;
        char usersOperator = ' ';
        boolean loopExcapeforOperator = false;

        System.out.println("Please enter the first value: ");
        while (usersFirstNumber == Float.MAX_VALUE) {
            try {
                String userEntersAnything = scan.nextLine();
                usersFirstNumber = Float.parseFloat(userEntersAnything);
            } catch (NumberFormatException firstError) {
                System.out.println("A number is requested.");
            }
        }

        System.out.println("Please enter the operator: ");
        while (!loopExcapeforOperator) {
            try {
                String userEntersAnything = scan.nextLine();
                usersOperator = userEntersAnything.charAt(0);
                if ((usersOperator == '+') || (usersOperator == '-') || (usersOperator == '*') || (usersOperator == '/')) {
                    loopExcapeforOperator = true;
                } else {
                    System.out.println("Please enter just an operator (+,-,*,/) ");
                }

            } catch (NumberFormatException secondError) {
                System.out.println("Please enter an operator (+,-,*,/): ");
            }
        }

        System.out.println("Please enter the second value: ");
        while (usersSecondNumber == Float.MAX_VALUE) {
            try {
                String userEntersAnything = scan.nextLine();
                usersSecondNumber = Float.parseFloat(userEntersAnything);
            } catch (NumberFormatException thirdError) {
                System.out.println("A number is requested.");
            }
        }

        calculatorWorks(usersFirstNumber, usersOperator, usersSecondNumber);
    }

    public static void calculatorWorks(float firstNumber, char operator, float secondNumber) {

        if (operator == '+') {
            System.out.println("Sum: " + (firstNumber + secondNumber));
        } else if (operator == '-') {
            System.out.println("Subtraction: " + (firstNumber - secondNumber));
        } else if (operator == '*') {
            System.out.println("Multiplication: " + (firstNumber * secondNumber));
        } else if (operator == '/') {
            System.out.println("Division: " + (firstNumber / secondNumber));
        }
    }
}
