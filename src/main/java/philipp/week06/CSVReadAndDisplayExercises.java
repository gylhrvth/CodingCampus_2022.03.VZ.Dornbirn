package philipp.week06;

import java.io.*;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class CSVReadAndDisplayExercises {

    public static void main(String[] args) {
        InputStream iS = Objects.requireNonNull(CSVReadAndDisplayExercises.class.getClassLoader().getResourceAsStream("csv/sales_100.csv"));
//        InputStream iS = Objects.requireNonNull(CSVReadAndDisplayExercises.class.getClassLoader().getResourceAsStream("csv/CSVTest-Philipp.csv"));
        String[][] stringArrayCSV = (createArrayOfStringCSV(createStringFromCSV(iS), ','));
        printArrayOfCSV(stringArrayCSV, 40);
        printArrayOfCSVOpt(stringArrayCSV);
    }

    private static String createStringFromCSV(InputStream iS) {
        Scanner fsc = new Scanner(iS);
        StringBuilder sb = new StringBuilder();
        while (fsc.hasNextLine()) {
            sb.append(fsc.nextLine()).append(System.lineSeparator());
        }
        fsc.close();
        return sb.toString();
    }

    private static String[][] createArrayOfStringCSV(String data, char separator) {
//        int countCols = 0;
//        int countRows = 0;
//        for (int i = 0; i < data.length(); i++) {
//            if (data.charAt(i) == '\n') {
//                countRows++;
//            }
//        }
//        for (int i = 0; i < data.length(); i++) {
//            if (data.charAt(i) == separator) {
//                countCols++;
//            }
//            if (data.charAt(i) == '\n') {
//                countCols++;
//                break;
//            }
//        }
//        System.out.println(countCols+" Rows: "+countRows);
        String[] tmpRows = data.split(System.lineSeparator());
        String[][] stringArrayOfCSV = new String[tmpRows.length][];

        for (int i = 0; i < tmpRows.length; i++) {
            stringArrayOfCSV[i] = tmpRows[i].split(String.valueOf(separator));

        }
        return stringArrayOfCSV;
    }

    private static void printArrayOfCSV(String[][] data, int colSize) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.printf("%-" + colSize + "s", data[i][j]);
            }
            System.out.println();
            if (i == 0) {
                System.out.println("-".repeat(data[i].length * colSize));
            }
        }
    }

    private static void printArrayOfCSVOpt(String[][] data) {
        int[] cs = colSizeByLongestWord(data);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (j == 0) {
                    System.out.printf("| %-" + cs[j] + "s |", data[i][j]);
                } else {
                    System.out.printf(" %-" + cs[j] + "s |", data[i][j]);
                }
            }
            System.out.println();
            if (i == 0) {
                for (int c : cs) {
                    System.out.print("-".repeat(c + 3));
                }
                System.out.print("-");
                System.out.println();
            }
        }
    }

    private static int[] colSizeByLongestWord(String[][] data) {
        int tmpSize = 0;
        int[] colSizes = new int[data[0].length];
        for (int i = 0; i < data[0].length; i++) {
            for (String[] datum : data) {
                if (tmpSize < datum[i].length()) {
                    tmpSize = datum[i].length();
                }
            }
            colSizes[i] = tmpSize;
            tmpSize = 0;
        }
//        System.out.println(Arrays.toString(colSizes));
        return colSizes;
    }
}



