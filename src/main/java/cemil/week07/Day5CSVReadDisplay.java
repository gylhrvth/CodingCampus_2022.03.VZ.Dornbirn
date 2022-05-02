package cemil.week07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Objects;

public class Day5CSVReadDisplay {

    public static void main(String[] args) {
        Reader reader = new InputStreamReader(Objects.requireNonNull(Day5CSVReadDisplay.class.getClassLoader().getResourceAsStream("csv/sales_100.csv")));
        String read = readString(reader);
        String[][] matrix = splitList(read);
        int[] longest = longest(matrix);
        listBuilder(matrix,longest);

    }

    public static int[] longest(String[][] matrix) {
        int[] longest = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                String word = matrix[i][j];
                int cur = longest[j];
                if (word.length() > cur) {
                    longest[j] = word.length();
                }
            }
        }
        return longest;
    }

    public static void listBuilder(String[][] list,int[] longest) {
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
