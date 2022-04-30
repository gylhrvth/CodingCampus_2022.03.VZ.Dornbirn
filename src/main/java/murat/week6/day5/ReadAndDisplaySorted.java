package murat.week6.day5;

import murat.week6.day4.ReadAndDisplayCSV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Objects;
import java.util.Scanner;

public class ReadAndDisplaySorted {
    public static void main(String[] args) {

        Reader reader = new InputStreamReader(Objects.requireNonNull(ReadAndDisplayCSV.class.getClassLoader().getResourceAsStream("csv/sales_100.csv")));
        printAMatrix(displayCVS(reader));

    }

    public static String[][] displayCVS(Reader reader) {

        String[][] matrix = null;
        BufferedReader buffer = null;
        StringBuilder builder = new StringBuilder();
        String wholeText;

        try {
            // Read lines for line and append the lines to a whole String text
            buffer = new BufferedReader(reader);
            while (buffer.ready()) {
                String line = buffer.readLine();
                builder.append(line);
                builder.append(System.lineSeparator());
            }
            wholeText = builder.toString();

            // Split the text as lines and construct the first dimension
            String[] lines = wholeText.split(System.lineSeparator());
            matrix = new String[lines.length][];

            // Split words and construct the columns
            for (int i = 0; i < matrix.length; i++) {
                String[] words = lines[i].split(",");
                matrix[i] = new String[words.length];

                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = words[j];
                }
            }

            // Read the column from user and sort the relevant column
            int userColumn = readUserNumber(matrix[0].length);
            sortAColumnLexi(matrix, userColumn);

        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            if (buffer != null) {
                try {
                    buffer.close();
                } catch (IOException exc) {
                    //noop
                }
            }
        }
        return matrix;
    }

    public static void printAMatrix(String[][] aMatrix) {

        for (int i = 0; i < aMatrix.length; i++) {

            for (int j = 0; j < aMatrix[i].length; j++) {
                System.out.printf("%" + (-(getMaxOfAColumnString(aMatrix, j) + 1)) + "s", aMatrix[i][j]);
            }
            System.out.println();
        }
    }

    // Get the maximum length of each column
    public static int getMaxOfAColumnString(String[][] aMatrix, int col) {

        if (aMatrix.length == 0 || aMatrix[0].length == 0) {
            return -1;
        }

        int max = aMatrix[0][col].length();

        for (int i = 0; i < aMatrix.length; i++) {

            if (aMatrix[i][col].length() > max) {
                max = aMatrix[i][col].length();
            }
        }
        return max;
    }

    // Read user number for a column number
    public static int readUserNumber(int limitOfCol) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the column number!");
        while (true) {
            if (sc.hasNextInt()) {
                int col = sc.nextInt();
                if (col < 0 || col >= limitOfCol) {
                    System.out.println("Please enter a value between [0-" + (limitOfCol - 1) + "].");
                } else {
                    return col;
                }
            } else {
                System.out.println("An integer is required!");
                sc.nextLine();
            }
        }
    }

    // Bubble sort the column
    public static String[][] sortAColumnLexi(String[][] aMatrix, int col) {

        String temp;
        for (int i = 0; i < aMatrix.length; i++) {

            // j is 1 because we do not sort the titles.
            for (int j = 1; j < aMatrix.length - i - 1; j++) {

                if (aMatrix[j][col].compareTo(aMatrix[j + 1][col]) > 0) {

                    // Swap also other columns
                    for (int k = 0; k < aMatrix[i].length; k++) {
                        temp = aMatrix[j + 1][k];
                        aMatrix[j + 1][k] = aMatrix[j][k];
                        aMatrix[j][k] = temp;
                    }
                }
            }
        }
        return aMatrix;
    }
}



