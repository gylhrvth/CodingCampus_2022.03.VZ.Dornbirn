package murat.week2.day2;

public class PrimeNumber {

    public static void main(String[] args) {

        primeNumber(11);

    }

    public static void primeNumber(int number) {

        boolean flag = false;                     // Alert if the number prime is.

        for (int i = 2; i < number; i++) {        // It has to start with a 2

            if (number % i == 0) {
                flag = true;
                break;                            // Terminate if the number prime is
            }
        }

        // Print out
        if (flag) {
            System.out.println(number + " is NOT a prime number. ");
        } else {
            System.out.println(number + " is a prime number. ");
        }
    }
}
