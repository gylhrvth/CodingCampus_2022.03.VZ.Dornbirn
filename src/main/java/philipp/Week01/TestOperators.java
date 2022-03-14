package philipp.Week01;

public class TestOperators {
    public static void main(String[] args) {
        int valueA = 5; // Assignment Operator
        int valueB = 2;
        int result;
        System.out.println("Original: " + valueA);

        ++valueA; // Increment Operator
        System.out.println("After increment: " + valueA);

        --valueA; // Decrement Operator
        System.out.println("After decrement: " + valueA);

        result = valueA + valueB; // Add Operator
        System.out.println("Plus: " + result);

        result = valueA - valueB; // Subtract Operator
        System.out.println("Minus: " + result);

        result = valueA * valueB; // Multiplication Operator
        System.out.println("Multiplication: " + result);

        result = valueA / valueB; // Division Operator
        System.out.println("Division: " + result);

        result = valueA % valueB; // Modulo Operator
        System.out.println("Rest: " + result);

        System.out.println("---------------");

        System.out.println("less:          " + (valueA < valueB));
        System.out.println("more:          " + (valueA > valueB));
        System.out.println("less or equal: " + (valueA <= valueB));
        System.out.println("more or equal: " + (valueA >= valueB));
        System.out.println("equal:         " + (valueA == valueB));
        System.out.println("not equal:     " + (valueA != valueB));

    }
}
