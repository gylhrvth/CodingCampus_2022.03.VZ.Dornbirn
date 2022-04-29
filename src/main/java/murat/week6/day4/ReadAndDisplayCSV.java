package murat.week6.day4;

import java.io.*;
import java.util.Objects;

public class ReadAndDisplayCSV {
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
}
