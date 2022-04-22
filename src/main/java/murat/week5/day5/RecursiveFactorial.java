package murat.week5.day5;

public class RecursiveFactorial {
    public static void main(String[] args) {

        for (int i = 1; i < 21; i++) {
            System.out.print("Number: " + i + " Factorial: " + factorial(i) + "\n");
        }

    }

    public static long factorial(long number) {

        if (number == 1) {
            return 1;
        }
        return (number * factorial(number - 1));
    }
}
