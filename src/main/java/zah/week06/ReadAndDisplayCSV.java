package zah.week06;

import java.io.*;
import java.util.Objects;

public class ReadAndDisplayCSV {
    public static void main(String[] args) {
        Reader reader = new InputStreamReader(Objects.requireNonNull(ReadAndDisplayCSV.class.getClassLoader().getResourceAsStream("csv/sales_100.csv")));
        String read = readString(reader);
        String[][] matrix = splitList(read);
        int []longest = longest(matrix);
        listBuilder(matrix,longest);

        // String[] lines = splitLines(read);
    }
    public static int [] longest(String[][] list){
        int [] longest = new int[list.length];
        for (int i = 0; i <list.length ; i++) {
            for (int j = 0; j <list[i].length ; j++) {
                String word = list[i][j];
                int cour = longest[j];
                if (word.length()>cour)
                    longest[j]=word.length();
            }

        }
        return longest;
    }

    public static void listBuilder(String[][] list, int [] longest) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                System.out.printf("%-" + longest[j] + "s | ", list[i][j]);
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

