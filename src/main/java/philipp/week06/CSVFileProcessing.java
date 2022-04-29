package philipp.week06;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Objects;
import java.util.Scanner;

public class CSVFileProcessing {

    public static void main(String[] args) {
//        InputStream iS = Objects.requireNonNull(CSVReadAndDisplayExercises.class.getClassLoader().getResourceAsStream("csv/sales_100.csv"));
        InputStream iS = Objects.requireNonNull(CSVReadAndDisplayExercises.class.getClassLoader().getResourceAsStream("csv/CSVTest-Philipp.csv"));

        CSVFileProcess(iS, ',');
    }

    private static void CSVFileProcess(InputStream file, char separator) {
        String[][] array2dOfCSV = createArrayOfStringCSV(createStringFromCSV(file), separator);
        printArrayOfCSVOpt(array2dOfCSV);
        int again = 1;
        while (again == 1) {
            System.out.println("*******");

            int colToSort = userInput(sortMsg(array2dOfCSV), "Please enter a correct number!", 1, array2dOfCSV[0].length);
            colToSort -= 1;
            System.out.println("Asc or Dsc?");
            int ascOrDsc = userInput("Please enter 1 for ASC or 2 for DSC!", "Please enter a correct number!", 1, 2);
            boolean asc = true;
            if (ascOrDsc == 2) {
                asc = false;
            }
            if (rowsOfNumbers(array2dOfCSV, colToSort)) {
                bubbleSort2dArrayInt(array2dOfCSV, colToSort, asc);
            } else {
                bubbleSorted2dArray2(array2dOfCSV, colToSort, asc);
            }
            printArrayOfCSVOpt(array2dOfCSV);
            int saveToFile = userInput("Do you want to save the data in a file?\n 1 for YES, 2 for NO", "Please enter a correct number", 1, 2);
            if (saveToFile == 1) {
                safeFile(array2dOfCSV,colToSort);
            }
            again = userInput("Do you want to sort again?\n1 for YES, 2 for NO", "Please enter a correct number!", 1, 2);
        }
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
        String[] tmpRows = data.split(System.lineSeparator());
        String[][] stringArrayOfCSV = new String[tmpRows.length][];

        for (int i = 0; i < tmpRows.length; i++) {
            stringArrayOfCSV[i] = tmpRows[i].split(String.valueOf(separator));
        }
        return stringArrayOfCSV;
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
        return colSizes;
    }

    private static void bubbleSorted2dArray(String[][] data, int columnToSort, boolean asc) {
        String[] colToSort = new String[data.length];
        for (int i = 0; i < colToSort.length; i++) {
            colToSort[i] = data[i][columnToSort];
        }
        for (int i = 0; i < colToSort.length; i++) {
            for (int j = 1; j < colToSort.length - 1 - i; j++) {
                if (asc != (colToSort[j].compareTo(colToSort[j + 1]) < 0)) {
                    String swap = colToSort[j];
                    colToSort[j] = colToSort[j + 1];
                    colToSort[j + 1] = swap;

                    String[] tmp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = tmp;
                }
            }
        }
    }

    // version Lukas:
    private static void bubbleSorted2dArray2(String[][] data, int columnToSort, boolean asc) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 1; j < data.length - i - 1; j++) {
                String lhs = data[j][columnToSort];
                String rhs = data[j + 1][columnToSort];

                boolean swap;
                if (asc) {
                    swap = lhs.compareTo(rhs) > 0;
                } else {
                    swap = lhs.compareTo(rhs) < 0;
                }
                if (swap) {
                    String[] tmp = data[j + 1];
                    data[j + 1] = data[j];
                    data[j] = tmp;
                }
            }
        }
    }

    private static void bubbleSort2dArrayInt(String[][] data, int columnToSort, boolean asc) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 1; j < data.length - 1 - i; j++) {
                float lhs = Float.parseFloat(data[j][columnToSort]);
                float rhs = Float.parseFloat(data[j + 1][columnToSort]);
                if (asc != (lhs < rhs)) {
                    float tmpFloat = lhs;
                    lhs = rhs;
                    rhs = tmpFloat;

                    String[] tmpString = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = tmpString;
                }
            }
        }
    }

    private static int userInput(String msg, String alertMsg, int min, int max) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(msg);
            if (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println(alertMsg);
            } else {
                int n = sc.nextInt();
                if (n < min || n > max) {
                    System.out.println(alertMsg);
                } else {
                    return n;
                }
            }
        }
    }

    private static String sortMsg(String[][] data) {
        StringBuilder sb = new StringBuilder();
        sb.append("Please choose a column to sort:").append(System.lineSeparator());
        for (int i = 0; i < data[0].length; i++) {

            sb.append("[").append(i + 1).append("] ").append(data[0][i]).append(System.lineSeparator());
        }
        return sb.toString();
    }

    private static boolean rowsOfNumbers(String[][] data, int columnToSort) {
        for (int i = 1; i < data.length; i++) {
            try {
                Float.parseFloat(data[i][columnToSort]);
            } catch (NumberFormatException nfe) {
                return false;
            }
        }
        return true;
    }

    private static void safeFile(String[][] data,int column) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
        LocalDateTime now = LocalDateTime.now();
        String path = "C:\\Users\\user\\Desktop\\File " + dtf.format(now) + "sorted by column "+data[0][column]+".csv";
        File f = new File(path);
        f.getParentFile().mkdirs();
        PrintStream ps = null;
        try {
            ps = new PrintStream(new FileOutputStream(f, true));
            int[] cs = colSizeByLongestWord(data);
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length; j++) {
                    if (j == 0) {
                        ps.printf("| %-" + cs[j] + "s |", data[i][j]);
                    } else {
                        ps.printf(" %-" + cs[j] + "s |", data[i][j]);
                    }
                }
                ps.println();
                if (i == 0) {
                    for (int c : cs) {
                        ps.print("-".repeat(c + 3));
                    }
                    ps.print("-");
                    ps.println();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ps.close();
        System.out.println("Your data has been saved under " + path + ".");
    }
}



