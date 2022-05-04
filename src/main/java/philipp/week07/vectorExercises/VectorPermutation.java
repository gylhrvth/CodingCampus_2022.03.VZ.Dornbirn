package philipp.week07.vectorExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class VectorPermutation {

    public static void main(String[] args) {
        String[] s = {"A", "B", "C"};
        Vector<String> rest = new Vector<>(Arrays.asList(s));
        Vector<String> prefix = new Vector<>();
        System.out.println(rest);
        printPermutationVector(prefix, rest);


    }

    private static void printPermutationVector(Vector<String> prefix, Vector<String> rest) {
        System.out.println("printPermutations(\"" + prefix + "\", \"" + rest + "\")");

        if (rest.size() == 0) {
            System.out.println(prefix);
        }
        for (int i = 0; i < rest.size(); i++) {
            Vector<String> newPrefix = new Vector<>(prefix);
            Vector<String> newRest = new Vector<>(rest);
            String element = newRest.remove(i);
            newPrefix.add(element);
            printPermutationVector(newPrefix, newRest);
        }

    }
}
