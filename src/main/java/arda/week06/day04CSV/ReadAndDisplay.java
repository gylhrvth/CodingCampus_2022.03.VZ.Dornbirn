package arda.week06.day04CSV;

import arda.week04.day03.BubblesortString;

import javax.sound.midi.Soundbank;
import java.io.*;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class ReadAndDisplay {
    static String RESET = "\033[0m";
    static String RED = "\033[0;91m";

    public static void main(String[] args) {
        Reader reader = new InputStreamReader(Objects.requireNonNull(ReadAndDisplay.class.getClassLoader().getResourceAsStream("csv/sales_100.csv")));
        String data = buildStringer(reader);
        String[][] list = readerToStringArr(data);
        int[] longest = findLongestWord(list);
        int columnToSort = userInput(list);
        header(longest, list);
        dictionarySortBody(list, columnToSort);
        printList(list, longest);
        //the list without sort //body(longest, list);
    }

    public static void header(int[] longest, String[][] list) {
        for (int i = 0; i < list[i].length; i++) {
            System.out.printf(RED + "%-" + longest[i] + "s | " + RESET, list[0][i]);
        }
    }

    public static void body(int[] longest, String[][] list) {
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

    public static void dictionarySortBody(String[][] list, int columnToSort) {
        //lukas helped me with this
        System.out.println();
        for (int i = 0; i < list.length; i++) {
            for (int j = 1; j < list.length - i - 1; j++) {
                String topRow = list[j][columnToSort];
                String bottomRow = list[j + 1][columnToSort];
                if (list[j][columnToSort].matches("[+-]?[0-9]+")) {
                    int top = Integer.parseInt(list[j][columnToSort]);
                    int bottom = Integer.parseInt(list[j + 1][columnToSort]);

                    if (top > bottom) {
                        String[] swap = list[j];
                        list[j] = list[j + 1];
                        list[j + 1] = swap;
                    }
                } else if (topRow.compareToIgnoreCase(bottomRow) > 0) {
                    String[] swap = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = swap;
                }
            }
        }
    }

    public static void printList(String[][] list, int[] longest) {
        for (int i = 1; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                System.out.printf("%-" + longest[j] + "s | ", list[i][j]);
            }
            System.out.println();
        }
    }

    public static int userInput(String[][] list) {
        Scanner sc = new Scanner(System.in);
        int listL = list[0].length;

        System.out.println("at which column would you like to start sorting?\n" +
                "you can choose from 0 to " + listL);
        while (true) {
            try {
                String input = sc.nextLine();
                int value = Integer.parseInt(input);
                if (value < 0 || value > listL) {
                    System.out.println("number is out of bounds");
                    //if sort location is a location containing numbers then execute bubblesort method for numbers?
                } else {
                    return value;
                }
            } catch (NumberFormatException exc) {
                System.out.println("this is not a number!\nplease enter a number between 0 and " + listL);
            } catch (ArrayIndexOutOfBoundsException aiobe) {
                System.out.println("number is out of bounds\nplease enter a number between 0 an " + listL);
            }
        }
    }
}