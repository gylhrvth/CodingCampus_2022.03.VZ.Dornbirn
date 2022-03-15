package cemil.week01;

public class TestOperators {
    public static void main(String[] args) {
        int valueA = 5; // Assignment Operator
        int valueB = 2;
        int result;
        System.out.println("Orginal: " + valueA);

        ++valueA; // Increment Operator
        System.out.println("After increment; " + valueA);


        --valueA; // Decrement Operator
        System.out.println("After decrement; " + valueA);

        result = valueA + valueB; // Add operator
        System.out.println("Plus: " + result);

        result = valueA - valueB; // Substract operator
        System.out.println("Minus: " + result);

        result = valueA * valueB; // Multiplication operator
        System.out.println("Multiplikation: " + result);

        result = valueA / valueB; // Division operator
        System.out.println("Division: " + result);

        result = valueA % valueB; // Modulo operator
        System.out.println("Rest: " + result);

        System.out.println("------------------");

        System.out.println("kleiner:        " + (valueA < valueB)); // Less
        System.out.println("größer:         " + (valueA > valueB)); // More
        System.out.println("kleiner gleich: " + (valueA <= valueB)); // Less or Equal
        System.out.println("größer gleich:  " + (valueA >= valueB)); // More or Equal
        System.out.println("gleich gleich:  " + (valueA == valueB)); // Equal Equal
        System.out.println("nicht gleich:   " + (valueA != valueB)); // No Equal


    }
}
