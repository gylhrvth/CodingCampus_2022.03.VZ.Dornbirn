package gyula.week05;

public class Permutation {
    public static void main(String[] args) {
        printPermutations("", "", "ABCDE");
    }

    /**
     * ABC
     * ACB
     * BAC
     * BCA
     * CAB
     * CBA
     *
     * zum Beispiel "ABC"
     *
     * Prefix, Rest
     *
     */
    public static void printPermutations(String indentation, String prefix, String rest){
        System.out.println(indentation + "printPermutations(" + prefix + ", " + rest + ")");
        if (rest.length() == 0){
            //System.out.println(prefix); // Result
        } else {
            for (int i = 0; i < rest.length(); i++) {
                printPermutations(
                        indentation + "  ",
                        prefix + rest.substring(i, i+1),
                         rest.substring(0, i) + rest.substring(i+1)
                        );
            }
        }
    }
}
