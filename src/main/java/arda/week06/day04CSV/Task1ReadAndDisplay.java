package arda.week06.day04CSV;

import java.io.*;
import java.util.Arrays;
import java.util.Objects;

public class Task1ReadAndDisplay {
    static String RESET = "\033[0m";
    static String RED = "\033[0;91m";

    public static void main(String[] args) {
        Reader reader = new InputStreamReader(Objects.requireNonNull(Task1ReadAndDisplay.class.getClassLoader().getResourceAsStream("csv/sales_100.csv")));
        String data = buildStringer(reader);
        String[][] list = readerToStringArr(data);
        int[] longest = findLongestWord(list);
        listBuilder(longest, list);

    }

    public static void listBuilder(int[] longest, String[][] list) {
        String text = "man I love data";
        for (int i = 0; i < list[i].length; i++) {
            System.out.printf( RED + "%-" + longest[i] + "s | " + RESET, list[0][i]);
        }
        System.out.println();
        for (int i = 1; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                System.out.printf("%-" + longest[j] + "s | ", list[i][j]);
            }
            System.out.println();
        }


    }

    public static String[][] readerToStringArr(String data) {
        String[] dataNewLine = data.split(System.lineSeparator());
        String[][] list = new String[dataNewLine.length][];
        String[] cols = null;
        int min = 0;
        int biggest = 0;
        for (int i = 0; i < dataNewLine.length; i++) {
            cols = dataNewLine[i].split(",");
            list[i] = cols;
        }

        return list;
    }

    public static int[] findLongestWord(String[][] list) {
        int[] longest = new int[list[0].length];

        for (int row = 0; row < list.length; row++) {
            for (int col = 0; col < list[row].length; col++) {
                String word = list[row][col];
                int currentLongestWordOfColumnSize = longest[col];

                if (word.length() > currentLongestWordOfColumnSize) {
                    longest[col] = word.length();
                }
            }
        }
        return longest;
    }

    public static String buildStringer(Reader reader) {
        BufferedReader br = null;
        StringBuilder strBuilder = null;
        try {
            br = new BufferedReader(reader);
            strBuilder = new StringBuilder();
            while (br.ready()) {
                String line = br.readLine();
                strBuilder.append(line);
                strBuilder.append(System.lineSeparator());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return strBuilder.toString();
    }
}