package murat.Week1;

public class Operators {

	public static void main(String[] args) {

		int valueA = 5; // Assignment operator
		int valueB = 2; //
		int result;
		System.out.println("Original: " + valueA);
		++valueA; // Increment Operator
		System.out.println("After increment: " + valueA);
		--valueA; // Decrement Operator
		System.out.println("After decrement: " + valueA);
		result = valueA + valueB; // Add operator
		System.out.println("Plus: " + result);
		result = valueA - valueB; // Substract Operator
		System.out.println("Minus: " + result);
		result = valueA * valueB; // Multiplication Operator
		System.out.println("Multiplication: " + result);
		result = valueA / valueB; // Division Operator;
		System.out.println("Division: " + (double) result);
		result = valueA % valueB; // Modulo Operator;
		System.out.println("Rest: " + result);
		System.out.println("------------------------------");
		System.out.println("less: " + (valueA < valueB));
		System.out.println("more: " + (valueA > valueB));
		System.out.println("less or equal: " + (valueA <= valueB));
		System.out.println("more or equal: " + (valueA >= valueB));
		System.out.println("more or equal: " + (valueA == valueB));
		System.out.println("not equal: " + (valueA != valueB));

	}
}
