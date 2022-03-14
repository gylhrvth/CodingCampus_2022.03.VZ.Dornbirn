package murat.week01;

public class CountTo10 {

	public static void main(String[] args) {

		System.out.println("---FOR---");
		for(int i=0; i <= 10; ++i)
		{
			System.out.println("The Number: " + i);
		}
		System.out.println("---WHILE---");

		int counter = 0;
		while (counter <= 10)
		{
			System.out.println("The Number: " + counter);
			++counter;
		}
	}

}
