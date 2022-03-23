package sergej.week02;

import java.util.Scanner;

public class AlphaCalculator {


    public static double numberInput() {

        Scanner sc = new Scanner(System.in);

        double num = Double.MAX_VALUE;
        boolean validOp = true;


        System.out.println("Please enter a number:");

        while (num == Double.MAX_VALUE) {

            try {
                String number = sc.nextLine();
                num = Double.parseDouble(number);
            } catch (NumberFormatException nfe) {
                System.out.println("please enter a valid number!");

            }
        }
        return num;
    }

    public static String operatorInput() {

        Scanner sc = new Scanner(System.in);
        String operator = "";
        boolean validOp = true;

        System.out.println("Please enter a math operator  (+,-,*,^,/)");

        while (validOp) {
            operator = sc.nextLine();
            if (!(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/") || operator.equals("^"))) {
                System.out.println("Please enter valid operator");

            } else {
                validOp = false;
            }
        }
        return operator;

    }

    public static void calculation(String operator, double num1, double num2) {
        if (operator.equals("+")) {
            System.out.println("your result is " + (num1 + num2));
        }
        if (operator.equals("-")) {
            System.out.println("your result is " + (num1 - num2));
        }
        if (operator.equals("*")) {
            System.out.println("your result is " + (num1 * num2));
        }
        if (operator.equals("/")) {
            System.out.println("your result is " + (num1 / num2));
        }
        if (operator.equals("^")) {
            System.out.println("your result is " + Math.pow(num1, num2));
        }
    }

    public static boolean askUser() {
        Scanner sc = new Scanner(System.in);
        String answer = "";
        boolean run = true;

        System.out.println("Hello would you like to calculate with me ? , please enter yes or no (y/n)");

        while (answer.length() != 1) {
            answer = sc.nextLine();
            if (answer.equals("y") || answer.equals("yes")) {
                answer = "y";
                run = true;
                return run;

            } else if (answer.equals("n") || answer.equals("no")) {
                System.out.println("OK!,Have a nice day!");
                answer = "n";
                run = false;
                return run;

            } else {
                System.out.println("please enter yes or no");
                answer = "";
            }
        }
        answer = "";
        return run;
    }

    public static double calculationReturn(String operator, double num1, double num2) {
        double result = 0;
        if (operator.equals("+")) {
            result = num1 + num2;
            return result;
        }
        if (operator.equals("-")) {
            result = num1 - num2;
            return result;
        }
        if (operator.equals("*")) {
            result = num1 * num2;
            return result;
        }
        if (operator.equals("/")) {
            result = num1 / num2;
            return result;
        }
        if (operator.equals("^")) {
            result = Math.pow(num1, num2);
            return result;

        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean run = true;
        // boolean equals = false;

        while (run = askUser()) {

            double num1 = numberInput();
            String operator = operatorInput();
            double num2 = numberInput();
            double result = calculationReturn(operator, num1, num2);
            boolean equals = true;

            while (equals) {
                operator = operatorInput();
                System.out.println("press the equal sign to get the result(=) or press any key to continue");
                String input = sc.nextLine();
                if (input.equals("=")) {
                    equals = false;
                    System.out.println("your result = " + result);

                } else {
                    num2 = numberInput();
                    result = calculationReturn(operator, result, num2);
                }
            }
            System.out.println("your result = " + result);
        }
    }
}
