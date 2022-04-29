package philipp.week06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ScanFileExercises {

    public static void main(String[] args) throws FileNotFoundException {
        try {
            File f = new File("assets/tmp/output.txt");
            Scanner fsc = new Scanner(f);
//            while (fsc.hasNextLine()) {
//                System.out.println(fsc.nextLine());
//            }
//            fsc.close();
            System.out.println("------------");

            countCharFile();
            System.out.println("------------");

            fsc = new Scanner(f);
            StringBuilder sb = new StringBuilder();
            while (fsc.hasNextLine()) {
                sb.append(fsc.nextLine());
                sb.append(("\n"));
            }
            fsc.close();
            System.out.println("The String has " + countChar(sb.toString(), 'o') + " of the required character.");
            System.out.println("------------");

            char[] requiredCharacters = {'l', 'b', 'a' };
            System.out.println("The Text has " + countCharOfArray(sb.toString(), requiredCharacters) +
                    " of the required characters." + Arrays.toString(requiredCharacters));
            System.out.println("------------");

        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }

    private static void countCharFile() throws FileNotFoundException {
        String text = "";
        StringBuilder sb = new StringBuilder();
        try {
            File f = new File("assets/tmp/text.txt");
            Scanner scFile = new Scanner(f);
            while (scFile.hasNextLine()) {
                sb.append(scFile.nextLine());
                sb.append(("\n"));
            }
            scFile.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
        text = sb.toString().replaceAll("[^a-zA-Z0-9öÖäÄüÜß]", "");
        char[] charText = text.toCharArray();
        int counter = 0;
        for (int i = 0; i < charText.length; i++) {
            counter++;
        }
        System.out.println("The text of the file has " + counter + " letters.");
    }

    private static int countChar(String text, char character) {
        int counter = 0;
        char[] charOfTextLC = text.toLowerCase().toCharArray();
        char[] charOfTextUC = text.toUpperCase().toCharArray();
        for (int i = 0; i < charOfTextLC.length; i++) {
            if (charOfTextLC[i] == character | charOfTextUC[i] == character) {
                counter++;
            }
        }
        return counter;
    }

    private static int countCharOfArray(String text, char[] input) {
        int counter = 0;
        char[] charTextLC = text.toLowerCase().toCharArray();
        char[] charTextUC = text.toUpperCase().toCharArray();
        for (int i = 0; i < charTextLC.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if (charTextLC[i] == input[j] | charTextUC[i] == input[j]) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
