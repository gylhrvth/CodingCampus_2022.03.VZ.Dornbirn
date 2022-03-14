
package murat.week01;

public class HelloWorld {

	public static void main(String[] args) {

		int number = 3;
		System.out.println("Hello World " + number);
		//Line comment
		/*
		Block Comment
		 */
		// Sequence
		System.out.print("---------------------------------\n");
		System.out.println("Hello");
		System.out.println("World");
		// If Statement
		if (number > 5) {
			System.out.println("Number is more than 5");
		} else{
			System.out.println("Number is less than or equal to 5");
		}

		// While and For Statement
		int counter = 0;
		int limit = 5;
		while (counter < limit){
			System.out.println(counter + " Hello Murat");
			//counter = counter + 1;
			//counter += 1;
			counter++;
		}

		for(int counter2 =0; counter2<5; ++counter2){
			System.out.print("A");
		}
	}
}
