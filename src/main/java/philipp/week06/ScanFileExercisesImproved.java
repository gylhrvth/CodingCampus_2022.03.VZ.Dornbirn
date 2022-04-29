package philipp.week06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ScanFileExercisesImproved {
    public static void main(String[] args) {
        File f = new File("assets/tmp/large.txt");
        char[] searchedCharacters = {'l', 'b', 'a'};
        System.out.println("The file has " + countCharOfArrayBigFiles(f, searchedCharacters) + " of the searched characters."
                + Arrays.toString(searchedCharacters));

    }

    private static long countCharOfArrayBigFiles(File f, char[] input) {
        Scanner scFile = null;
        int counter = 0;
        try {
            scFile = new Scanner(f);
            while (scFile.hasNext()) {
                String s = scFile.next().toLowerCase();
                char[] tmpLC = s.toCharArray();
                char[] tmpUC = s.toUpperCase().toCharArray();
                for (int i = 0; i < tmpLC.length; i++) {
                    for (int j = 0; j < input.length; j++) {
                        if (tmpLC[i] == input[j] | tmpUC[i] == input[j]) {
                            counter++;
                        }
                    }
                }
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            if (scFile != null) {
                scFile.close();
            }
        }
        return counter;
    }
}
