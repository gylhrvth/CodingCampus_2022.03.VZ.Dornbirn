package murat.week2.day3;

import java.util.Scanner;

public class InputTask4CalculatorExtended {
    public static void main(String[] args) {
        // User uses the calculator
        // When it stops, it asks if the user wants to continue
        // When the user approves, the user must press Enter
        // If not, any other key

        boolean userNeedsNewOperations = false;
        calculator();

        while (!userNeedsNewOperations) {
            String enter = "";
            System.out.println("Want more?Then please press enter, if not press any key");
            Scanner scan = new Scanner(System.in);   // Reads the key enter
            enter = scan.nextLine();

            if ((enter.equals(""))) {             // If the user wants to continue
                calculator();
            } else {
                System.out.println("Calculator stops");
                userNeedsNewOperations = true;    // If the user do not want to continue
            }
        }
    }

    public static void calculator() {

        Scanner scan = new Scanner(System.in);
        float usersFirstNumber = Float.MAX_VALUE;
        float usersSecondNumber = Float.MAX_VALUE;
        String usersOperator = "";
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
                usersOperator = scan.nextLine();

                if (usersOperator.equals("+") || usersOperator.equals("-") || usersOperator.equals("*") || usersOperator.equals("/")) {
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

                // Avoids the zero division
                if(usersSecondNumber==0){
                    System.out.println("Please enter another number different than 0 (Zero)");
                    usersSecondNumber = Float.MAX_VALUE;
                }

            } catch (NumberFormatException thirdError) {
                System.out.println("A number is requested.");
            }
        }
        operations(usersFirstNumber, usersOperator, usersSecondNumber);
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
