package cemil.week02;

import java.util.Scanner;

public class day1Calculator {
    public static void main(String[] args) {

        Scanner Calculator = new Scanner(System.in);
        int tries = 10;
        System.out.println("Gib deine Rechnung ein ");
        int counter1 = Integer.parseInt(Calculator.nextLine());
        String operator = Calculator.nextLine();
        int coounter2 = Integer.parseInt(Calculator.nextLine());

        System.out.println();
            if (operator.equals("+")) {
                System.out.println(" " + (counter1 + coounter2));
            } else {
            }
            if (operator.equals("-")) {
                System.out.println(" " + (counter1 - coounter2));
            } else {
            }
            if (operator.equals("*")) {
                System.out.println(" " + (counter1 * coounter2));
            } else {
            }
            if (operator.equals("/")) {
                System.out.println(" " + (counter1 / coounter2));
            } else {
            }


    }
}

