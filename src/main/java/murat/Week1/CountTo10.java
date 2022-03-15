package murat.Week1;

public class CountTo10 {

	// Task 1
	public static void task1(String name, int start, int limit) {

		System.out.println("---" + name + "---");
		System.out.println("---FOR---");
		for (int i = start; i <= limit; ++i) {
			System.out.println("The Number: " + i);
		}
		System.out.println("---WHILE---");
		int counter = 0;
		while (counter <= limit) {
			System.out.println("The Number: " + counter);
			++counter;
		}
		System.out.println("------------------------------------");
	}

	// Task 2
	public static void task2(String name, int start, int limit) {

		System.out.println("---TASK 2---");
		for (int i = start; i < limit; ++i) {
			System.out.println("The Number: " + i);
		}
	}

	// Task 3 mit Modulo
	public static void task3(String name, int start, int limit, int divisor) {

		System.out.println("------------------------------------");
		System.out.println("---TASK 3---");
		for (int i = start; i <= limit; ++i) {
			if ((i % divisor) == 0) {
				System.out.println("Even Numbers: " + i);
			}
		}
	}

	// Task 3 Simpler
	public static void task3Simpler(String name, int start, int limit) {

		System.out.println("------------------------------------");
		System.out.println("---TASK 3-Simpler---");
		for (int i = start; i <= limit; i = i + 2) {
			System.out.println("Even Numbers: " + i);
		}
	}

	// Task 4
	public static void task4(String name, int start, int limit) {

		System.out.println("------------------------------------");
		System.out.println("---TASK 4---");
		for (int i = start; i >= limit; --i) {
			System.out.println("The Number: " + i);
		}
	}

	public static void main(String[] args) {

		task1("TASK 1", 0,10);                    // Count to 10 with FOR and WHILE
		task2("TASK 2", 0,10);                    // Count to 10 with FOR exclusively 10
		task3("TASK 3", 0,10, 2);                    // Count to 10 and display the even numbers, Modulo Method
		task3Simpler("TASK 3-Simpler", 0,10);     // Display the even numbers between 0-10
		task4("TASK 4", 10,-10);                   // Count backwards from 10 to -10 and display
	}

}
