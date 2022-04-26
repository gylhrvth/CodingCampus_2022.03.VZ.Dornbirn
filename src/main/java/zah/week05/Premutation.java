package zah.week05;

public class Premutation {
    private static int counter = 0;

    public static void main(String[] args) {
        printPermutations("", "abc");

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
    public static void printPermutations(String prefix, String rest) {

        if (rest.length() == 0) {
            ++counter;
            System.out.println(counter + ". " + prefix);
        } else {
            // Buchstabe wählen
            // zu Prefix zugügen
            // vom Rest löschen
            // Permutation auf neue Prefix und Rest aufrufen

            for (int i = 0; i < rest.length(); i++) {

                String newPrefix = prefix + rest.charAt(i);
                String left = rest.substring(0, i);
                String right = rest.substring(i + 1);
                printPermutations(newPrefix, left + right);

            }
        }
    }
}



