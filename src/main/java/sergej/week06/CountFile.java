package sergej.week06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountFile {
    static final int MAX_CHAR = 256;

    public static void countChars(Scanner file) {
        int count[] = new int[MAX_CHAR];

        while (file.hasNextLine()) {
            String line = file.nextLine().replaceAll("[(0-9)\s\\p{Punct}]", "");
            countSingleChar(line, count, 'y');
            //countCharsArr(line, count);
        }
        file.close();
        printResult(count);
    }

    public static int counter(char[] array) {

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count++;

        }
        return count;
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

    public static int countSingleChar2(File f, char d) {
        int count[] = new int[MAX_CHAR];
        countCharsArr(f, count);
        return count[d];
    }

    public static void countSingleChar(String text, int[] count, char d) {

        int len = text.length();

        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            if (c < 0 || c >= count.length) c = 0;
            if (c == d) {
                count[c]++;
            }
        }
        /*
        char ch[] = new char[text.length()];
        for (int i = 0; i < len; i++) {
            ch[i] = text.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {
                if (text.charAt(i) == ch[j]) {
                    find++;
                }

            }
            if (find == 1) {
                System.out.println("the letter " + text.charAt(i) + " shows up: " + count[text.charAt(i)]);
            }
        }
        */
    }


    public static void printResult(int[] result) {
        for (int i = 0; i < result.length; i++) {
            if (result[i] > 0) {
                if (i == 0) {
                    System.out.println(result[i] + " other unicode charakters.");
                } else {
                    System.out.println("the letter " + (char) i + " shows up: " + result[i]);
                }
            }

        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter file path: ");
        String input = sc.nextLine();
        File file = new File(input);


        int count[] = new int[MAX_CHAR];
        countCharsArr(file, count);
        printResult(count);

        System.out.println("********************");
        System.out.println(countSingleChar2(file, 'c'));
        //Scanner scf = new Scanner(file);

        //countChars(scf);

        //int test = countChars(scf);
        // System.out.println(test);
    }
}
