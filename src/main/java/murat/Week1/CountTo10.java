package murat.Week1;

public class CountTo10 {

	public static void task1(String name, int limit){
		System.out.println("---"+ name +"---");
		System.out.println("---FOR---");
		for (int i = 0; i <= limit; ++i) {
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

	public static void task2 (String name, int limit){
		System.out.println("---TASK 2---");
		for (int i = 0; i < limit; ++i) {
			System.out.println("The Number: " + i);
		}
	}

	public static void task3 (String name, int limit){
		System.out.println("------------------------------------");
		System.out.println("---TASK 3---");
		for (int i = 0; i <= limit; ++i) {
			if ((i % 2) == 0) {
				System.out.println("Even Numbers: " + i);
			}
		}
	}

	public static void task3Simpler (String name, int limit){
		System.out.println("------------------------------------");
		System.out.println("---TASK 3-Simpler---");
		for (int i = 0; i <= limit; i = i + 2) {
			System.out.println("Even Numbers: " + i);
		}
	}

	public static void task4 (String name, int limit){
		System.out.println("------------------------------------");
		System.out.println("---TASK 4---");
		for (int i = 10; i >= limit; --i) {
			System.out.println("The Number: " + i);
		}
	}

	public static void main(String[] args) {
		task1("TASK 1", 10);                    // Count to 10 with FOR and WHILE
		task2("TASK 2", 10);                    // Count to 10 with FOR exclusively 10
		task3("TASK 3", 10);                    // Count to 10 and display the even numbers, Modulo Method
		task3Simpler("TASK 3-Simpler", 10);     // Display the even numbers between 0-10
		task4("TASK 4", -10);                   // Count backwards from 10 to -10 and display
	}

}
