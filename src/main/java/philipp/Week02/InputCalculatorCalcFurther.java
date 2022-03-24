package philipp.Week02;

import java.util.Scanner;

import static philipp.Week02.InputCalculatorImproved.*;

public class InputCalculatorCalcFurther {
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
            boolean further = true;
            while (further) {
                further = calcAgain(sc, further, "Calculate further? Y/N");
                if (!further) {
                    break;
                } else {
                    operator = operatorSign(sc, operator);
                    float numbersMore = numbers(sc, "Enter additional number:");
                    System.out.println();
                    result = calculate(result, operator, numbersMore, result);
                    System.out.println();
                }
            }
            restart = calcAgain(sc, restart, "New calculation? Y/N");
        }
    }
}
