package sergej.week02;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {


        float num1 = Float.MIN_VALUE;
        float num2 = Float.MIN_VALUE;
        String operator = "";

        Scanner sc = new Scanner(System.in);

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

        while (operator.length() != 1) {

            try {
                operator = sc.nextLine();
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter valid operator");
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
            System.out.print("your result is " + (num1 + num2));
        }
        if (operator.equals("-")) {
            System.out.print("your result is " + (num1 - num2));
        }
        if (operator.equals("*")){
            System.out.print("your result is "+(num1*num2));
        }
        if (operator.equals("/")){
            System.out.print("your result is "+(num1/num2));
        }
        if (operator.equals("^")){
            System.out.print("your result is "+Math.pow(num1,num2));
        }


    }
}
