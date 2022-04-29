package cemil.week07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

public class Day5CSVReadDisplay {
    public static void main(String[] args) {
        Reader reader = new InputStreamReader(Objects.requireNonNull(Day5CSVReadDisplay.class.getClassLoader().getResourceAsStream("csv/sales_100.csv")));

        String read = readString(reader);
        String[] lines = splitLines(read);

        for (String line : lines) {
            System.out.println("Zeile: " + line);
        }
        String[] col = splitColum(read);

    }
    public static String[] splitColum (String text){
       String[] col = text.split(System.lineSeparator());
       String[][] arr = new String[col.length][];
        for (int i = 0; i < arr.length; i++) {


        }return col;
    }

    public static String[] splitLines(String text) {
        return text.split(System.lineSeparator());
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
