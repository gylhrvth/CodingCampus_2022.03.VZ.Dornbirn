package zah.week02;

import java.util.Scanner;

public class Taschenrechner {
    public static void main(String[] args) {
        taschenrechner();

    }

    public static void taschenrechner() {
        float num1 = Float.MIN_VALUE;
        float num2 = Float.MIN_VALUE;
        String operator = "";

        Scanner sc = new Scanner(System.in);
        //float value = Float.MIN_VALUE;

        System.out.println("Enter e number:");
        while (num1 == Float.MIN_VALUE) {
            try {
                String text = sc.nextLine();
                num1 = Float.parseFloat(text);
            } catch (NumberFormatException nfe) {

            }
        }
        System.out.println("Enter a operator");
        // TODO: 23/03/2022 Hinweis fehlt
        while (operator.length() != 1) {
            operator = sc.nextLine();
            // TODO: 23/03/2022 Prüfung von Operator ist erforderlich, + - / *
            if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")) {
                System.out.println("Only +, -, *, / operator is allowed");
                operator = "";
            }
        }
        System.out.println("Enter a valid number");
        // TODO: 23/03/2022 Hinweis fehlt
        // TODO: 23/03/2022 Frage: Kann man das Einlesen von zwei Zahlen einfacher machen? Ohne Wiederholung?
        while (num2 == Float.MIN_VALUE) {
            try {
                String text = sc.nextLine();
                // TODO: 23/03/2022 Übernahme des Wertes in num2 mit Float.parseFloat()
                num2 = Float.parseFloat(text);
            } catch (NumberFormatException nfe) {
                // TODO: 23/03/2022 Message ist mir unklar
                System.out.println("The result is:");
            }
        }

        // TODO: 23/03/2022 Operation durchführen und Ergebnis präsentieren
        float result = 0;
        if (operator.equals("+")) {
            result = num1 + num2;
        }
        if (operator.equals("-")) {
            result = num1 - num2;
        }
        if (operator.equals("*")) {
            result = num1 * num2;
        }
        if (operator.equals("/")) {
            result = num1 / num2;
        } else {
            // this may not happen
        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

    }
}

