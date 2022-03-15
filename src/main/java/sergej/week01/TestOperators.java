package sergej.week01;

public class TestOperators {
    public static void main(String[] args) {
        int valueA = 5; // Assignment Operator
        int valueB = 2;
        int result ;

        System.out.println("Original " + valueA);

        ++valueA; // Increment Operator
        System.out.println("After Increment " +valueA);

        --valueA; // Decrement Operator
        System.out.println("After Decrement " +valueA);

        result = valueA + valueB; // add operator
        System.out.println("Plus: " + result);

        result = valueA - valueB; // minus operator
        System.out.println("Minus: " + result);

        result = valueA * valueB; // multiplicaton operator
        System.out.println("Multi: " + result);

        result = valueA / valueB; // Divide operator
        System.out.println("Div: " + result);

        result = valueA % valueB; // Modulo operator
        System.out.println("Modulo: " + result); // remainder of division

        System.out.println("-------------------");

        System.out.println("kleiner:        " + (valueA < valueB));
        System.out.println("größer:         " + (valueA > valueB));
        System.out.println("kleiner gleich: " + (valueA <= valueB));
        System.out.println("größer gleich:  " + (valueA >= valueB));
        System.out.println("gleich:         " + (valueA == valueB));
        System.out.println("nich gleich:    " + (valueA != valueB));

    }
}
