package philipp.week05;

public class FactorialAndPermutation {


    public static void main(String[] args) {
        System.out.println(factorial(8));
        System.out.println("---");
        printPermutations("", "ABCD");
    }

    /**
     * factorial(n) = n * factorial(n-1)
     * factorial(1) = 1
     *
     * @param val
     * @return
     */
    private static long factorialForLoop(int val) {
        long factorial = 1;
        for (int i = 1; i <= val; i++) {
            factorial = i * factorial;
        }
        return factorial;
    }

    //Version Sergej
    private static long factorial(int number) {
        if (number == 1) {
            return 1;
        }
        return (number * factorial(number - 1));
    }

    /**
     * ABC
     * ACB
     * BAC
     * BCA
     * CAB
     * CBA
     * <p>
     * zum Beispiel "ABC"
     * <p>
     * Prefix, Rest
     */
    private static void printPermutations(String prefix, String rest) {
        System.out.println("printPermutations(\"" + prefix + "\", \"" + rest + "\")");

        if (rest.length() == 0) {
            System.out.println(prefix);
        }
        for (int i = 0; i < rest.length(); i++) {
            String newPrefix = prefix + rest.charAt(i);
            String newRest = rest.substring(0, i) + rest.substring(i + 1);
            printPermutations(newPrefix, newRest);
        }

    }

}
