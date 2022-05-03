package sergej.week06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Objects;

public class ReadCSVNew {

    public static String csvToString(Reader reader) {
        String data = "";
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(reader);

            while (bufferedReader.ready()) {
                data += bufferedReader.readLine() + System.lineSeparator();
            }

        } catch (IOException exc) {
            exc.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    //noop
                }
            }
        }
        return data;

    }


    public static String[][] createTable(String data) {
        String[] dataArr = data.split(System.lineSeparator());
        String[][] data2d = new String[dataArr.length][];
        for (int i = 0; i < dataArr.length; i++) {
            data2d[i] = dataArr[i].split(",");
        }
        return data2d;
    }

    public static int getMaxString(String[][] names) {
        int max = 0;
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                if (max < names[i][j].length()) {
                    max = names[i][j].length();
                }
            }
        }
        return max;
    }

    public static int getCol(String[][] arr, int i, int col) {

        int max = 0;
        for (i = 0, col = col; i < arr.length; i++) {
            if (max < arr[i][col].length()) {
                max = arr[i][col].length();
            }
        }
        return max;
    }

    public static int getMax(String names, int max) {
        for (int i = 0; i < names.length(); i++) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }

    public static String[] getCol(String[][] data, int colStart) {
        String[] col = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            col[i] = data[i][colStart];
        }

        return col;
    }

    public static void printTable(String[][] data) {

        for (int i = 0; i < data.length; i++) {
            System.out.print("[");
            for (int j = 0; j < data[i].length; j++) {
                int max = getMaxString(data);
                if (j > 0) {
                    System.out.print("|");
                }
                System.out.printf("%-" + max + "s", data[i][j]);
            }
            System.out.println("]");

        }
    }

    public static void main(String[] args) {
        Reader reader = new InputStreamReader(Objects.requireNonNull(CountWordsFile.class.getClassLoader().getResourceAsStream("csv/sales_100.csv")));

        String data = csvToString(reader);
        String[][] dataArray = createTable(data);

        printTable(dataArray);
    }

}
