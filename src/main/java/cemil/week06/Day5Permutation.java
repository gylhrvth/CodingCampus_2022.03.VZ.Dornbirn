package cemil.week06;

import java.util.Objects;

public class Day5Permutation {
    static int counter = 0;

    public static void main(String[] args) {
        printPermutation("", "cemil");
    }

    public static void printPermutation(String prefix, String rest) {
        if (rest.length() == 0) {
            counter++;
            System.out.println(counter + ". " +
                    (prefix.equals("ilemc")?"Your Text ist: ":"")
                    + prefix);
        } else {
            for (int i = 0; i < rest.length(); i++) {
                String newPrefix = prefix + rest.charAt(i);
                String left = rest.substring(0, i);
                String right = rest.substring(i + 1);
                printPermutation(newPrefix, left + right);
            }
        }

    }
}
