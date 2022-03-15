package murat.Week1;

public class LearnFunctions {

    // Addition
    public static int addition(int firstNumber, int secondNumber) {

        return firstNumber + secondNumber;
    }

    // Substraction
    public static int substraction(int firstNumber, int secondNumber) {

        return firstNumber - secondNumber;
    }

    // Multiplication
    public static int multiplication(int firstNumber, int secondNumber) {

        return firstNumber * secondNumber;
    }

    // Division
    public static double division(int firstNumber, int secondNumber) {

        return firstNumber / secondNumber;
    }

    public static void main(String[] args) {
        // First Test
        int firstValue = 5000;
        int secondValue = 125;

        System.out.println(addition(firstValue, secondValue));
        System.out.println(substraction(firstValue, secondValue));
        System.out.println(multiplication(firstValue, secondValue));
        System.out.println(division(firstValue, secondValue));

        // Second Test
        int starter1 = 5;
        int starter2 = 10;
        int fixValue = 2;
        int result;

        result = addition(starter1, starter2);                      // 5 + 10 = 15
        System.out.println("After addition: " + result);

        result = substraction(result, fixValue);                    // 15-2 = 13
        System.out.println("After substraction: " + result);

        result = multiplication(result, fixValue);                  // 13*2 = 26
        System.out.println("After multiplication: " + result);

    }

}
