package zah.week06;

import java.io.*;
import java.util.Objects;

public class ReadAndDisplayCSV {
    public static void main(String[] args) {
        Reader reader = new InputStreamReader(Objects.requireNonNull(ReadAndDisplayCSV.class.getClassLoader().getResourceAsStream("csv/sales_100.csv")));
        String read = readString(reader);
        String[][] matrix = splitList(read);
        listBuilder(matrix);
        // String[] lines = splitLines(read);
    }

    public static void listBuilder(String[][] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                System.out.printf("%-40s",list[i][j]);
            }
            System.out.println();
        }
    }

    public static String[][] splitList(String text) {
        String[] lines = text.split(System.lineSeparator());
        String[][] arr = new String[lines.length][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = lines[i].split(",");
        }
        return arr;
    }

//    public static String[] splitLines(String text) {
//        return text.split(System.lineSeparator());
//    }

    public static String readString(Reader re) {
        StringBuilder text = new StringBuilder();
        BufferedReader br = null;
        try {
            br = new BufferedReader(re);
            while (br.ready()) {
                text.append(br.readLine());
                text.append(System.lineSeparator());
            }
        } catch (IOException e) {
            // noop
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    // noop
                }
            }
        }
        return text.toString();
    }
}

