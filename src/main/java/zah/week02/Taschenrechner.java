package zah.week02;

import java.util.Scanner;

public class Taschenrechner {
    public static void main(String[] args) {
        taschenrechner();

    }

    public static float readFloatFromConsole(Scanner sc, String message, String messageForError){
        float result = Float.MIN_VALUE;

        System.out.println(message);
        while (result == Float.MIN_VALUE) {
            try {
                String text = sc.nextLine();
                result = Float.parseFloat(text);
            } catch (NumberFormatException nfe) {
                System.out.println(messageForError);
            }
        }
        return result;
    }

    public static void taschenrechner() {
        String operator = "";

        Scanner sc = new Scanner(System.in);
        //float value = Float.MIN_VALUE;
        String errorMessageForFloat = "You\'d use a valid float number";
        float num1 = readFloatFromConsole(sc, "Enter a number", errorMessageForFloat);

        /*
        System.out.println("Enter a number:");

        while ((num1 == Float.MIN_VALUE) && (num2== Float.MIN_VALUE)){
            try {
                String text = sc.nextLine();
                num1 = Float.parseFloat(text);
                num2 = Float.parseFloat(text);
            } catch (NumberFormatException nfe) {
            }
        }
         */
        System.out.println("Enter a operator");

        while (operator.length() == 0) {
            operator = sc.nextLine();
            if (!operator.equals("plus") && !operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")) {
                System.out.println("Only +, -, *, / operator is allowed");
                operator = "";
            }
        }
        float num2 = readFloatFromConsole(sc, "Enter the second number", errorMessageForFloat);
/*
        System.out.println("Enter a valid number");
        while (num2 == Float.MIN_VALUE) {
            try {
                String text = sc.nextLine();
                num2 = Float.parseFloat(text);
            } catch (NumberFormatException nfe) {
                System.out.println("The result is:");
            }
        }
*/
        float result = 0;
        if (operator.equals("+") || (operator.equals("plus"))) {
            result = num1 + num2;
        } else if (operator.equals("-")) {
            result = num1 - num2;
        } else if (operator.equals("*")) {
            result = num1 * num2;
        } else if (operator.equals("/")) {
            result = num1 / num2;
        } else {
            // this may not happen
        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);


    }

}


