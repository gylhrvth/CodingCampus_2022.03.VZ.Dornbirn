package timo.week06;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

public class ReadCSV {
    public static void main(String[] args) {
        Reader reader = new InputStreamReader(Objects.requireNonNull(ReadCSV.class.getClassLoader().getResourceAsStream("csv/sales_100.csv")));

        String csvString = convertCSVToString(reader);
        String[][] csvArr = (createTable(csvString));


        for (String[] array : csvArr) {
            System.out.print("[");
            for (int j = 0; j < array.length; j++) {
                int max = getLongestString(csvArr);
                if (j > 0) {
                    System.out.print(" || ");
                }
                System.out.printf("%-" + max + "s", array[j]);
            }
            System.out.println("]");
        }
    }


    public static String convertCSVToString(Reader reader) {
        String data = "";
        try (BufferedReader bufferedReader = new BufferedReader(reader)) {

            while (bufferedReader.ready()) {
                data += bufferedReader.readLine() + System.lineSeparator();
            }
        } catch (IOException exc) {
            exc.printStackTrace();
        }
        //noop
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

    public static int getLongestString(String[][] names) {
        int max = 0;
        for (String[] name : names) {
            for (String str : name) {
                if (max < str.length()) {
                    max = str.length();
                }
            }
        }
        return max;
    }
}
