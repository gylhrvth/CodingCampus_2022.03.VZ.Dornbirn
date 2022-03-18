package murat.Week1;

public class DiffBetwPlusPlusCounterAndCounterPlusPlus {

	public static void main(String[] args) {

		int number1 = 1;
		int number2 = 1;
		System.out.println("Number 1: " + number1 + " " + "Number 2: " + number2);
		System.out.println("Number 1: " + ++number1 + " " + "Number 2: " + number2++);
		System.out.println("Number 1: " + number1 + " " + "Number 2: " + number2);

		System.out.println("-----------------------------------------------------------");

		int testNumber1 = 0;
		int testNumber2 = 0;
		number1 = 1;
		number2 = 1;
		++number1;
		number2++;
		testNumber1 = number1;
		testNumber2 = number2;
		System.out.println("TestNumber 1: " + testNumber1 + " " + "TestNumber 2: " + testNumber2);
		System.out.println("Number 1: " + number1 + " " + "Number 2: " + number2);

	}

}
