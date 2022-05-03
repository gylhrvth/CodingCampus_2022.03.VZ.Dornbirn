package timo.week06;

import timo.week04.CountLetters;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class CountLettersFile {
    static final int MAX_CHAR = 256;
    public static void main(String[] args) throws FileNotFoundException {

        // /Users/tika/Desktop/PrintStream
        // /Users/tika/IdeaProjects/CodingCampus_2022.03.VZ.Dornbirn/assets/tmp/timoslog.txt

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter file name");
        String input = sc.nextLine();
        File userFile = new File(input);
        Scanner fileScanner = new Scanner(userFile);

        char[] charsToCount = new char[]{'a','z','e'};
        for (int i = 0; i < charsToCount.length; i++) {
            System.out.println(charsToCount[i] + " shows up: " + countSingleChar2(userFile, charsToCount[i]) + " times");
        }


        printLettersInFile(fileScanner);


    }

    public static void printLettersInFile(Scanner file) {
        int count[] = new int[MAX_CHAR];

        while (file.hasNextLine()) {
            String line = file.nextLine();
            // countSingleChar(line, count, 'x');
        }
        file.close();

        printResult(count);
    }


    public static void countCharsArr(File f, int[] count) {
        try {
            Scanner sc = new Scanner(f);

            while (sc.hasNextLine()) {
                String text = sc.nextLine().replaceAll("[(0-9)\s\\p{Punct}]", "");

                int len = text.length();
                for (int i = 0; i < len; i++) {
                    char c = text.charAt(i);
                    if (c < 0 || c >= count.length) c = 0;
                    count[c]++;
                }
            }
        } catch (FileNotFoundException fnfe){}
    }

    public static void countSingleChar(String text, int[] count, char letter) {
        int len = text.length();

        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            if (c < 0 || c >= count.length) c = 0;
            if (letter == c) {
                count[c]++;
            } else {
                System.out.println("No matching letters found");
                break;
            }
        }
    }

    public static int countSingleChar2(File f, char d) {
        int count[] = new int[MAX_CHAR];
        countCharsArr(f, count);
        return count[d];
    }


    public static void printResult(int[] result){
        for (int i = 0; i < result.length; i++) {
            if (result[i] > 0){
                if (i == 0) {
                    System.out.println(result[i] + " other unicode characters.");
                } else {
                    System.out.println("Letter " + (char) i + " occurs " + result[i] + " times");
                }
            }

        }
    }


}
