package gyula.week02;

import java.util.Scanner;

public class HandCalculator {

    public static float readFloatFromConsole(Scanner sc, String message){
        float number = 0;
        boolean ready = false;

        while (!ready){
            System.out.println(message);
            String text = sc.nextLine();
            try {
                number = Float.parseFloat(text);
                ready = true;
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter a valid float");
            }
        }
        return number;
    }

    public static String readOperatorFromConsole(Scanner sc, String message){
        String operator = "";
        boolean ready = false;

        while (!ready){
            System.out.println(message);
            operator = sc.nextLine();
            if (!operator.equals("+") &&
                    !operator.equals("-") &&
                    !operator.equals("*") &&
                    !operator.equals("/")
            ){
                System.out.println(operator + " is not a valid operator");
            } else {
                ready = true;
            }
        }
        return operator;
    }

    public static float customOperation(String operator, float number1, float number2){
        float result = 0;
        if (operator.equals("+")){
            result = number1 + number2;
        } else if (operator.equals("-")){
            result = number1 - number2;
        } else if (operator.equals("*")){
            result = number1 * number2;
        } else if (operator.equals("/")){
            result = number1 / number2;
        } else {
            System.err.println("ERROR: this may not happen... Check operator: " + operator);
        }

        return result;
    }

    public static boolean readShallWeContinue(Scanner sc, String message){
        boolean shallContinue = true;

        System.out.println(message);
        String answer = sc.nextLine();
        if (!answer.equals("YES") &&
                !answer.equals("yes") &&
                !answer.equals("y")
        ){
            System.out.println("No future calculation is requested");
            shallContinue = false;
        } else {
            System.out.println("Initiate new calculation");
            shallContinue = true;
        }
        return shallContinue;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean repeatCalculation = true;

        float number1 = readFloatFromConsole(sc, "Enter the first number");
        while (repeatCalculation) {
            String operator = readOperatorFromConsole(sc, "Enter an operator. The valid values are: + - * /");
            float number2 = readFloatFromConsole(sc, "Enter the second number");
            float result = customOperation(operator, number1, number2);

            System.out.println(number1 + " " + operator + " " + number2 + " = " + result);
            repeatCalculation = readShallWeContinue(sc, "Please Enter \"YES\" for repeat");
            number1 = result;
        }
    }
}
