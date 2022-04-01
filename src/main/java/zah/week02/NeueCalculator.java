package zah.week02;

import java.util.Scanner;

public class NeueCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean execution = true;

        System.out.println("Hello I am a calculator!");
        float number1 = readFloatFromConsole(sc, "Please enter the first number");
        while (execution) {
            String operator = readOperatorFromConsole(sc, "Please enter operator (+, -, *, /, ^)");
            float number2 = readFloatFromConsole(sc, "Please enter the second number");
            float result = calculateResult(number1, operator, number2);
                number1=result;
            System.out.println(result);

            execution = restartCalculator(sc);

        }
    }

    public static float readFloatFromConsole(Scanner sc, String message) {
        float number = Float.MAX_VALUE;

        System.out.println(message);
        while (number == Float.MAX_VALUE) {
            try {
                String text = sc.nextLine();
                number = Float.parseFloat(text);
            } catch (NumberFormatException nfe) {
                System.out.println("Enter a valid number you clown");
            }
        }
        return number;
    }

    public static String readOperatorFromConsole(Scanner sc, String message) {
        System.out.println(message);
        String operator = "";

        while (operator.length() != 1) {
            operator = sc.nextLine();

            if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/") && !operator.equals("^")) {
                System.out.println("Pleas enter a operator!");
                operator = "";
            }
        }
        return operator;
    }



    public static boolean restartCalculator(Scanner sc) {
        System.out.println("Do you want to calculate again? If yes  press y, if no press n");
        boolean calculateAgainScanner = true;
        boolean execution = true;

        while (calculateAgainScanner) {
            String answer = sc.nextLine();

            if (answer.equals("y")) {
                execution = true;
                calculateAgainScanner = false;
            } else if (answer.equals("n")) {
                execution = false;
                calculateAgainScanner = false;
            } else {
                //
            }
        }
        return execution;
    }


    public static float calculateResult(float input1, String operator, float input2) {
        float result = 0;

        if (operator.equals("+")) {
            result = input1 + input2;
        } else if (operator.equals("-")) {
            result = input1 - input2;
        } else if (operator.equals("*")) {
            result = input1 * input2;
        } else if (operator.equals("/")) {
            result = input1 / input2;
        } else if (operator.equals("^")) {
            result = (float) Math.pow(input1, input2);
        } else {
            System.out.println("Invalid operator (must be +, -, *, /, ^)");
        }
        return result;
    }


}



