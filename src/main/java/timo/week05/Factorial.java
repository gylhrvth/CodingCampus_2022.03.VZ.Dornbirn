package timo.week05;

public class Factorial {
    public static void main(String[] args) {


        System.out.println(getFactorial(5));

        printPermutation("", "FUCK");

    }

    public static long getFactorial(int number) {
        if (number == 1) {
            return 1;
        }
        return number * getFactorial(number - 1);
    }


    public static void printPermutation(String prefix, String rest) {

        if (rest.length() == 0) {
            System.out.println(prefix);
        }
        for (int i = 0; i < rest.length(); i++) {
            String newPrefix = prefix + rest.charAt(i);
            String newRest = rest.substring(0, i) + rest.substring(i + 1);
            printPermutation(newPrefix, newRest);
        }
    }

}
