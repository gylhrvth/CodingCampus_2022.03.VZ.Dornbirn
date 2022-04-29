package sergej.week06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Objects;

public class ReadCSV {

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

    public static void main(String[] args) {
        Reader reader = new InputStreamReader(Objects.requireNonNull(CountWordsFile.class.getClassLoader().getResourceAsStream("csv/sales_100.csv")));

        String data = csvToString(reader);
        String[][] dataArray = createTable(data);


        //System.out.println(Arrays.toString(dataArray[1]));
        // System.out.println(Arrays.toString(dataArray[1]));
        for (int i = 0; i < dataArray.length; i++) {
            System.out.print("[");
            for (int j = 0; j < dataArray[i].length; j++) {
                if(j > 0) {
                    System.out.print(", ");
                }
                System.out.printf("%s", dataArray[i][j]);
            }
            System.out.println("]");
        }
    }
}
