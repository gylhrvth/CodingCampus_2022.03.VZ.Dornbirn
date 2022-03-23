package sergej.week02;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {


        float num1 = Float.MIN_VALUE;
        float num2 = Float.MIN_VALUE;
        String operator = "";
        boolean validOp = true;
        boolean run = true;
        String answer = "";

        Scanner sc = new Scanner(System.in);

        while (run) {

            System.out.println("Please enter your first number:");

            while (num1 == Float.MIN_VALUE) {

                try {
                    String text = sc.nextLine();
                    num1 = Float.parseFloat(text);
                } catch (NumberFormatException nfe) {
                    System.out.println("please enter valid number");

                }

            }
            System.out.println("Please enter a math operator  (+,-,*,^,/)");

            while (validOp) {
                operator = sc.nextLine();
                if (!(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/") || operator.equals("^"))) {
                    System.out.println("Please enter valid operator");

                } else {
                    validOp = false;
                }
            }

            System.out.println("Please enter your second number:");

            while (num2 == Float.MIN_VALUE) {

                try {
                    String text = sc.nextLine();
                    num2 = Float.parseFloat(text);
                } catch (NumberFormatException nfe) {
                    System.out.println("please enter valid number");

                }

            }

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

            num1 = Float.MIN_VALUE;
            num2 = Float.MIN_VALUE;
            operator = "";
            validOp = true;

            System.out.println("would you like to calculate again ? , please enter yes or no (y/n)");
            while (answer.length() != 1) {
                answer = sc.nextLine();
                if (answer.equals("y") || answer.equals("yes")) {
                    answer = "y";
                    run = true;


                } else if (answer.equals("n") || answer.equals("no")) {
                    answer = "n";
                    run = false;


                } else {
                    System.out.println("please enter yes or no");
                    answer = "";

                }
            }
            answer = "";


        }
    } /////////////
}
