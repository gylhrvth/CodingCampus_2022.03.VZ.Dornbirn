package arda.week05.day05;

public class RecursiveFunctionPermutation {
    private static int counter = 0;

    public static void main(String[] args) {
        permutate("", "ABCD");
    }

    public static void permutate(String prefix, String rest) {
        System.out.println("permute(\"" + prefix + "\", \"" + rest + "\")");
        if (rest.length() == 0) {
            ++counter;
            System.out.println(counter + ". " + prefix);
        } else {
            for (int i = 0; i < rest.length(); i++) {
                permutate(prefix + rest.charAt(i), rest.substring(0, i) + rest.substring(i + 1));
            }
        }
    }
}
