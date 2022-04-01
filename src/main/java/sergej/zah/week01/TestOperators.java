package sergej.zah.week01;

public class TestOperators {
    public static void main(String[] args){
        int valueA = 5; // Assignment Operator
        int valueB = 2;
        int result;

        System.out.println("Original: " + valueA);

        ++valueA; // Increment Operator
        System.out.println("After increment: " + valueA);

        --valueA; // Decrement Operator
        System.out.println( "After decrement:" + valueA);
        result = valueA + valueB; // Add operator
        System.out.println( " Plus:" + result);

        result = valueA - valueB; // Minus operator
        System.out.println( " Minus:" + result);

        result = valueA * valueB; //Multiplication operator
        System.out.println( " Plus:" + result);

        result = valueA / valueB; // division operator
        System.out.println( " Division:" + result);

        result = valueA % valueB; // modulo operator
        System.out.println( " Rest:" + result);

        System.out.println("-----------------------------");

        System.out.println("less:           " + (valueA < valueB));
        System.out.println("more:           " + (valueA > valueB));
        System.out.println("less  ore equal:" + (valueA <= valueB));
        System.out.println("more ore equal: " +  (valueA >= valueB));
        System.out.println("equal:          " +  (valueA == valueB));
        System.out.println("not equal:      " + (valueA != valueB));




    }
}
