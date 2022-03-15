package arda.week01;

public class TestOperatoren {
    public static void main(String[] args) {
        int valueA = 5; //Assignment Operator
        int valueB = 2;
        int result;

        System.out.println("Original: " + valueA);

        ++valueA; //Increment Operator
        System.out.println("After Increment " + valueA);

        --valueA; //Decrement  Operator
        System.out.println("After Decrement " + valueA);

        System.out.println("Plus " + valueA + valueB);

        result = valueA + valueB; //add operator
        System.out.println("Plus " + result);

        result = valueA - valueB; //subtract Operator
        System.out.println("Minus " + result);

        result = valueA * valueB; //multiplication Operator
        System.out.println("Multiplication " + result);

        result = valueA / valueB; //division Operator
        System.out.println("Division " + result);

        result = valueA % valueB; //module Operator
        System.out.println("Rest " + result);

        System.out.println("----------------------------------");

        System.out.println("less: " + (valueA < valueB));

        System.out.println("more: " + (valueA > valueB));

        System.out.println("less or equal: " + (valueA <= valueB));

        System.out.println("more or equal: " + (valueA >= valueB));

        System.out.println("equal: " + (valueA == valueB));

        System.out.println("not equal: " + (valueA != valueB));

    }
}
