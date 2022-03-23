package aron.week02;

import java.util.Scanner;

public class TryCaulator {

    public static void num1(float num1) {
        Scanner sc = new Scanner(System.in);
        while (num1 == Float.MIN_VALUE) {

            try {
                String text = sc.nextLine();
                num1 = Float.parseFloat(text);
            } catch (NumberFormatException nfe) {
                System.out.println("please enter valid number");
            }
        }
    }

    public static void valiuOP(boolean valiuOp) {
        Scanner sc = new Scanner(System.in);
        String operator = "";
        while (valiuOp) {
            operator = sc.nextLine();
            if (!(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/") || operator.equals("^"))) {
                System.out.println("Please enter valid operator");

            } else {
                valiuOp = false;
            }
        }
    }

    public static void num2(float num2) {

        Scanner sc = new Scanner(System.in);
        while (num2 == Float.MIN_VALUE) {

            try {
                String text = sc.nextLine();
                num2 = Float.parseFloat(text);
            } catch (NumberFormatException nfe) {
                System.out.println("please enter valid number");

            }

        }
    }

    public static void run() {
        String answer;
        boolean run;
        Scanner sc = new Scanner(System.in);
        System.out.println("would you like to calculate again ? , please enter yes or no (y/n)");
        answer = "";
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

}
