package philipp.Week02;

import java.util.Objects;
import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = Float.MIN_VALUE;
        float b = Float.MIN_VALUE;
        boolean o = true;
        boolean ag = true;
        boolean restart = true;

        while (restart) {
            System.out.println("Enter a decimal number:");
            while (a == Float.MIN_VALUE) {
                try {
                    String text = sc.nextLine();
                    a = Float.parseFloat(text);
                } catch (NumberFormatException nfe) {
                    System.out.println("A number is requested");
                }
            }
            System.out.println("Enter Operator + , - , * or /");
            String operator = "";
            while (o) {
                operator = sc.nextLine();
                if (operator.equals("+") || Objects.equals(operator, "-") ||
                        Objects.equals(operator, "*") || Objects.equals(operator, "/")) {
                    o = false;
                } else {
                    System.out.println("Enter Operator + , - , * or /");
                }
            }
            System.out.println("Enter a second decimal number:");
            while (b == Float.MIN_VALUE) {
                try {
                    String text = sc.nextLine();
                    b = Float.parseFloat(text);
                } catch (NumberFormatException nfe) {
                    System.out.println("A number is requested");
                }
            }
            System.out.println();
            if (Objects.equals(operator, "+")) {
                System.out.println(a + b);
            } else if (Objects.equals(operator, "-")) {
                System.out.println(a - b);
            } else if (Objects.equals(operator, "*")) {
                System.out.println(a * b);
            } else if (Objects.equals(operator, "/")) {
                System.out.println(a / b);
            }
            System.out.println("New calculation? Y/N");
            String again = "";
            while (ag) {
                again = sc.nextLine();
                if (Objects.equals(again, "Y") || Objects.equals(again, "y") ||
                        Objects.equals(again, "N") || Objects.equals(again, "n")) {
                    ag = false;
                } else {
                    System.out.println("Please enter Y or N");
                }
            }
            if (again.equals("N") || again.equals("n")) {
                return;
            } else {
                a = Float.MIN_VALUE;
                b = Float.MIN_VALUE;
                o = true;
                ag = true;
            }
        }
    }
}

