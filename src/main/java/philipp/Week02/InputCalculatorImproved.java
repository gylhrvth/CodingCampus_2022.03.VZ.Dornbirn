package philipp.Week02;

import java.util.Objects;
import java.util.Scanner;

public class InputCalculatorImproved {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float number1 = 0f;
        String operator = "";
        float number2 = 0f;
        float result = 0f;
        boolean restart = true;

        while (restart) {
            number1 = numbers(sc, "Enter a decimal number:");
            operator = operatorSign(sc, operator);
            number2 = numbers(sc, "Enter a second decimal number:");
            System.out.println();
            result = calculate(number1, operator, number2, result);
            System.out.println();
            restart = calcAgain(sc, restart,"New calculation? Y/N");
        }
    }

    public static float numbers(Scanner sc, String textMessage) {
        float n = Float.MIN_VALUE;
        System.out.println(textMessage);
        while (n == Float.MIN_VALUE) {
            try {
                String text = sc.nextLine();
                n = Float.parseFloat(text);
            } catch (NumberFormatException nfe) {
                System.out.println("A number is requested");
            }
        }
        return n;
    }

    public static String operatorSign(Scanner sc, String op) {
        boolean o = true;
        System.out.println("Enter Operator + , - , * or /");
        while (o) {
            op = sc.nextLine();
            if (op.equals("+") || Objects.equals(op, "-") ||
                    Objects.equals(op, "*") || Objects.equals(op, "/")) {
                o = false;
            } else {
                System.out.println("Enter Operator + , - , * or /");
            }
        }
        return op;
    }

    public static Float calculate(float a, String x, float b, float result) {
        if (Objects.equals(x, "+")) {
            result = a + b;
        } else if (Objects.equals(x, "-")) {
            result = a - b;
        } else if (Objects.equals(x, "*")) {
            result = a * b;
        } else if (Objects.equals(x, "/")) {
            result = a / b;
        }
        System.out.println(result);
        return result;
    }

    public static Boolean calcAgain(Scanner sc, boolean restart, String text) {
        System.out.println(text);
        boolean loop = true;
        String aga = "";
        while (loop) {
            aga = sc.nextLine();
            if (Objects.equals(aga, "Y") || Objects.equals(aga, "y") ||
                    Objects.equals(aga, "N") || Objects.equals(aga, "n")) {
                loop = false;
            } else {
                System.out.println("Please enter Y or N");
            }
        }
        if (aga.equals("N") || aga.equals("n")) {
            restart = false;
        }
        return restart;
    }
}

