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
            countCharsArr(line, count);
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

    public static void countCharsArr(String text, int[] count) {

        int len = text.length();

        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            if (c < 0 || c >= count.length) c = 0;
            count[c]++;
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


    public static void printResult(int[] result){
        for (int i = 0; i < result.length; i++) {
            if (result[i] > 0){
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
        Scanner scf = new Scanner(file);

        countChars(scf);

        //int test = countChars(scf);
        // System.out.println(test);
    }
}
