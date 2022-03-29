package arda.week02.day02and03;

import java.util.Scanner;

public class Taschenrechner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean execution = true;
        float value01 = readFloatFromConsole(sc, "enter first number");

        while (execution) {

            String operator = readOperator(sc);
            float value02 = readFloatFromConsole(sc, "enter second number");
            float result = executeOperation(operator, value01, value02);
            value01 = result;
            System.out.println("your result is =" + " " + result);
            execution = continueCalculation(sc);
        }
    }

    public static String readOperator(Scanner sc) {
        String operator = "";
        while (operator.length() == 0) {
            System.out.println("enter operator");
            operator = sc.nextLine();

            if (!operator.equals("+") &&
                    !operator.equals("-") &&
                    !operator.equals("*") &&
                    !operator.equals("/") &&
                    !operator.equals("^")) {
                System.out.println("Illegal Operator");
                operator = "";
            }
        }
        return operator;
    }

    public static float readFloatFromConsole(Scanner sc, String message) {
        float value = Float.MAX_VALUE;
        boolean ready = false;

        while (!ready) {
            System.out.println(message);
            String text = sc.nextLine();
            try {
                value = Float.parseFloat(text);
                ready = true;
            } catch (NumberFormatException nfe) {
                System.out.println("Only valid numbers are allowed.");
            }
        }
        return value;
    }

    public static float executeOperation(String op, float value01, float value02) {
        float result = 0;

        if (op.equals("+")) {
            result = value01 + value02;
        } else if (op.equals("-")) {
            result = value01 - value02;
        } else if (op.equals("*")) {
            result = value01 * value02;
        } else if (op.equals("/")) {
            result = value01 / value02;
        } else if (op.equals("^")) {
            result = (float) Math.pow(value01, value02);
        } else {
            System.out.println("that is not an operator these are: +, -, *, /, ^");
        }
        return result;


    }

    public static boolean continueCalculation(Scanner sc) {
        System.out.println("would you like to continue calculating with your result?");
        boolean calculateAgain = true;
        boolean execution = true;

        while (calculateAgain) {
            String answer = sc.nextLine();
            if (answer.equals("y")) {
                execution = true;
                calculateAgain = false;
            } else if (answer.equals("n")) {
                execution = false;
                calculateAgain = false;
            } else {
                System.out.println("please answer y/n");
            }
        }
        return execution;
    }

}
