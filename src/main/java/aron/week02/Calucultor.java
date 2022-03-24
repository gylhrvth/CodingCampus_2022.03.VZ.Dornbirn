package aron.week02;

import java.util.Scanner;

public class Calucultor {


    public static void main(String[] args) {


        float num1 = Float.MIN_VALUE;
        float num2 = Float.MIN_VALUE;
        String operator = "";
        boolean valiuOp = true;
        boolean run = true;
        Scanner sc = new Scanner(System.in);
        String answer;

        while (run) {


        System.out.println("Please enter your first number:");

        TryCaulator.num1(num1);
        System.out.println("Please enter a math operator  (+,-,*,^,/)");

     TryCaulator.valiuOP(valiuOp);
     System.out.println("Please enter your second number:");



        if (operator.equals("+")) {
            System.out.print("your result is " + (num1 + num2));
        }
        if (operator.equals("-")) {
            System.out.print("your result is " + (num1 - num2));
        }
        if (operator.equals("*")) {
            System.out.print("your result is " + (num1 * num2));
        }
        if (operator.equals("/")) {
            System.out.print("your result is " + (num1 / num2));
        }
        if (operator.equals("^")) {
            System.out.print("your result is " + Math.pow(num1, num2));
        }



            answer = "";
            while (answer.length() != 1) {
                answer = sc.nextLine();
                if (answer.equals("y") || answer.equals("yes")) {
                    answer = "y";



                } else if (answer.equals("n") || answer.equals("no")) {
                    answer = "n";
                    run = false;


                } else {
                    System.out.println("would you like to calculate again ? , please enter yes or no (y/n)");
                    answer = "";

                }
            }
            answer = "";

















        }

    }
}
