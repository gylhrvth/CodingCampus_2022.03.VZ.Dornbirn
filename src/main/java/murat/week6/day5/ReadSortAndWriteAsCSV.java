package murat.week6.day5;

import murat.week6.day4.ReadAndDisplayCSV;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

// Reads a file from "csv/sales_100.csv" and sorts it with user-wished column.
// Writes it as a csv file into "assets/tmp/CSVText.csv"
public class ReadSortAndWriteAsCSV {
    public static void main(String[] args) {

        Reader reader = new InputStreamReader(Objects.requireNonNull(ReadAndDisplayCSV.class.getClassLoader().getResourceAsStream("csv/sales_100.csv")));
        // printAMatrix(displayCVS(reader));
        writeFileAsText(displayCVS(reader));

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

        for (int i = 0; i < aMatrix.length; i++) {

            for (int j = 1; j < aMatrix.length - i - 1; j++) {

                if (aMatrix[j][col].matches("[+-]?[0-9]+")) {                      // Integers

                    int first = Integer.parseInt((aMatrix[j][col]));
                    int second = Integer.parseInt((aMatrix[j + 1][col]));

                    if (first > second) {

                        // Swap also other columns
                        for (int k = 0; k < aMatrix[i].length; k++) {
                            String tempString = aMatrix[j + 1][k];
                            aMatrix[j + 1][k] = aMatrix[j][k];
                            aMatrix[j][k] = tempString;
                        }
                    }

                } else if (aMatrix[j][col].matches("[+-]?([0-9]*[.])?[0-9]+")) {     // Floating numbers

                    float first = Float.parseFloat(aMatrix[j][col]);
                    float second = Float.parseFloat(aMatrix[j + 1][col]);

                    if (first > second) {

                        // Swap also other columns
                        for (int k = 0; k < aMatrix[i].length; k++) {
                            String tempString = aMatrix[j + 1][k];
                            aMatrix[j + 1][k] = aMatrix[j][k];
                            aMatrix[j][k] = tempString;
                        }
                    }

                } else if (aMatrix[j][col].matches("^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$")) {      // Dates

                    try {
                        Date first = new SimpleDateFormat("MM/dd/yyyy").parse(aMatrix[j][col]);
                        Date second = new SimpleDateFormat("MM/dd/yyyy").parse(aMatrix[j + 1][col]);

                        if (first.compareTo(second) > 0) {

                            // Swap also other columns
                            for (int k = 0; k < aMatrix[i].length; k++) {
                                String tempString = aMatrix[j + 1][k];
                                aMatrix[j + 1][k] = aMatrix[j][k];
                                aMatrix[j][k] = tempString;
                            }
                        }
                    } catch (ParseException pe) {
                        pe.printStackTrace();
                    }

                } else {

                    if (aMatrix[j][col].compareTo(aMatrix[j + 1][col]) > 0) {          // Strings

                        // Swap also other columns
                        for (int k = 0; k < aMatrix[i].length; k++) {
                            String tempString = aMatrix[j + 1][k];
                            aMatrix[j + 1][k] = aMatrix[j][k];
                            aMatrix[j][k] = tempString;
                        }
                    }
                }
            }
        }
        return aMatrix;
    }

    // Write as a CSV
    public static void writeFileAsText(String[][] aMatrix) {
        try {
            PrintStream ps = new PrintStream(new FileOutputStream("assets/tmp/CSVText.csv"));

            // Write the matrix into a csv file
            for (int i = 0; i < aMatrix.length; i++) {
                for (int j = 0; j < aMatrix[i].length; j++) {
                    ps.print(aMatrix[i][j] + ";");
                }
                ps.println();
            }
            ps.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }
}
