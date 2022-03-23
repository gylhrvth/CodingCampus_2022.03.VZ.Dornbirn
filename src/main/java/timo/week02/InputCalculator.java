package timo.week02;

import javax.management.OperationsException;
import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float value1 = Float.MAX_VALUE;
        float value2 = Float.MAX_VALUE;
        String operator = "";
        //boolean operatorInput = true

        System.out.println("Enter first number");

        while (value1 == Float.MAX_VALUE) {

            try {
                String text = sc.nextLine();
                value1 = Float.parseFloat(text);

            } catch (NumberFormatException nfe) {
                System.out.println("Enter valid number");
            }
        }
        System.out.println("Enter operator");

        while (operator.length() != 1) {

            try {
                operator = sc.nextLine();
            } catch (NumberFormatException nfe) {
                System.out.println("Enter valid operator");

            }
        }
        System.out.println("Enter second number");

        while (value2 == Float.MAX_VALUE) {

            try {
                String text = sc.nextLine();
                value2 = Float.parseFloat(text);

            } catch (NumberFormatException nfe) {
                System.out.println("Enter valid number");
            }
        }

        if (operator.equals("+")) {
            System.out.println("The result is " + (value1 + value2));
        }
        if (operator.equals("-")) {
            System.out.println("The result is " + (value1 - value2));
        }
        if (operator.equals("*")) {
            System.out.println("The result is " + (value1 * value2));
        }
        if (operator.equals("/")) {
            System.out.println("The result is " + (value1 / value2));
        }
        if (operator.equals("^")) {
            System.out.println("The result is " + Math.pow(value1, value2));
        }


    }
}
