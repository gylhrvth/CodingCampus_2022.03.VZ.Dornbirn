package gyula.week07;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CsvReadDisplaySort {
    public static void main(String[] args) {
        String[][] csvContent = readCSV("src/main/resources/csv/sales_100.csv", ",");
        bubbleSort(csvContent, 1);
        printContent(csvContent);
    }

    public static void bubbleSort(String[][] data, int columnIndex){
        for (int i = 0; i < data.length; i++) {
            for (int j = 1; j < data.length - i - 1; j++) {
                float testJ = Float.MAX_VALUE;
                try {
                    testJ = Float.parseFloat(data[j][columnIndex]);
                } catch (NumberFormatException nfe){ // do nothing
                }
                float testJplus1 = Float.MAX_VALUE;
                try {
                    testJplus1 = Float.parseFloat(data[j+1][columnIndex]);
                } catch (NumberFormatException nfe){ // do nothing
                }
                boolean swapCrit =
                        (testJ > testJplus1) || ((testJ == testJplus1) &&
                        (data[j][columnIndex].compareTo(data[j+1][columnIndex]) > 0));
                if (swapCrit){
                    String[] temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
    }


    public static void printContent(String[][] data){
        int[] columnWidth = calculateMinColumnWith(data);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.printf("| %-"+ columnWidth[j] +"s ", data[i][j].substring(0,
                        Math.min(columnWidth[j], data[i][j].length())));
            }
            System.out.println(" |");
        }
    }

    public static int[] calculateMinColumnWith(String[][] data){
        if (data.length == 0) return new int[0];
        int[] result = new int[data[0].length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j].length() > result[j]){
                    result[j] = data[i][j].length();
                }
            }
        }
        return result;
    }

    public static int countLines(String filename){
        int count = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            while (br.ready()){
                br.readLine();
                ++count;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

    public static String[][] readCSV(String filename, String separator){
        int lines = countLines(filename);
        String[][] content = new String[lines][];
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            int indexContent = 0;
            while (br.ready()){
                String line = br.readLine();
                content[indexContent] = line.split(separator);
                ++indexContent;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
}
