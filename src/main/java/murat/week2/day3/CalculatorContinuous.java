//package murat.week2.day3;
//
//import java.util.Scanner;
//
//public class CalculatorContinuous {
//
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);   // Input Scanner
//        boolean exitDoor = false;
//        float result = calculator();
//
//        while (!exitDoor) {
//
//            System.out.println("Please either enter an operator or press any key: ");
//            String enter = "";
//            enter = scan.nextLine();
//
//            if (enter.equals("+") || enter.equals("-") || enter.equals("*") || enter.equals("/")) {
//                System.out.println("Please enter a number in if: ");
//                float usersThirdNumber = 100;
//                usersThirdNumber = readANumberFromConsole(scan, "A number is required!");
//
//                 result = operations(result, enter, usersThirdNumber);
//                System.out.println("Unter Result : " + result);
//
//            } else {
//                System.out.println("Stop!");
//                exitDoor = true;
//            }
//        }
//    }
//
//    public static float calculator() {
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Please enter the first value: ");
//        float usersFirstNumber = readANumberFromConsole(scan, "A number is required!");
//
//        System.out.println("Please enter the operator: ");
//        String usersOperator = readAnOperatorFromConsole(scan, "Please enter an operator (+,-,*,/): ", "An operator (+,-,*,/) is required!");
//
//        System.out.println("Please enter the second value: ");
//        float usersSecondNumber = readANumberFromConsole(scan, "A number is required!");
//
//        return operations(usersFirstNumber, usersOperator, usersSecondNumber);
//    }
//
//    public static float readANumberFromConsole(Scanner sc, String errorMessage) {
//
//        float aNumberToRead = Float.MAX_VALUE;
//        while (aNumberToRead == Float.MAX_VALUE) {
//            try {
//                String userEntersAnything = sc.nextLine();
//                aNumberToRead = Float.parseFloat(userEntersAnything);
//            } catch (NumberFormatException thirdError) {
//                System.out.println(errorMessage);
//            }
//        }
//        return aNumberToRead;
//    }
//
//    public static String readAnOperatorFromConsole(Scanner sc, String errorMessage1, String errormessage2) {
//
//        String AnOperator = "";
//        boolean loopExcapeforOperator = false;
//
//        while (!loopExcapeforOperator) {
//            try {
//                AnOperator = sc.nextLine();
//
//                if (AnOperator.equals("+") || AnOperator.equals("-") || AnOperator.equals("*") || AnOperator.equals("/")) {
//                    loopExcapeforOperator = true;
//                } else {
//                    System.out.println(errormessage2);
//                }
//            } catch (NumberFormatException secondError) {
//                System.out.println(errorMessage1);
//            }
//        }
//        return AnOperator;
//    }
//
//    public static float operations(float firstNumber, String operator, float secondNumber) {
//
//        float result = 99;
//
//        switch (operator) {
//            case "+" -> {
//                result = firstNumber + secondNumber;
//                System.out.println("Sum: " + result);
//            }
//            case "-" -> {
//                result = firstNumber - secondNumber;
//                System.out.println("Subtraction: " + result);
//            }
//            case "*" -> {
//                result = firstNumber * secondNumber;
//                System.out.println("Multiplication: " + result);
//            }
//            case "/" -> {
//                result = firstNumber / secondNumber;
//                System.out.println("Division: " + result);
//            }
//        }
//        return result;
//    }
//}
