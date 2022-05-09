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

    public static void printTable(String[][] data, int maxReg, int maxCou, int maxItem, int maxSales, int maxOrderP, int maxOrderD, int maxOrderI, int maxShip, int maxUnits, int maxUnitsP, int maxUnitsC, int maxTotal, int maxTotalC, int maxTotalP, String[] region, String[] country, String[] item, String[] sales, String[] orderP, String[] orderD, String[] orderI, String[] ship, String[] units, String[] unitsP, String[] unitsC, String[] total, String[] totalC, String[] totalP) {

        for (int i = 0; i < data.length; i++) {

            System.out.printf("%-" + maxReg + "s%-" + maxCou + "s%-" + maxItem + "s%" + maxSales + "s%" + maxOrderP + "s%" + maxOrderD + "s%" + maxOrderI + "s%" + maxShip + "s%" + maxUnits + "s%" + maxUnitsP + "s%" + maxUnitsC + "s%" + maxTotal + "s%" + maxTotalC + "s%" + maxTotalP + "s\n", region[i], country[i], item[i], sales[i], orderP[i], orderD[i], orderI[i], ship[i], units[i], unitsP[i], unitsC[i], total[i], totalC[i], totalP[i]);
        }
    }

    public static void main(String[] args) {
        Reader reader = new InputStreamReader(Objects.requireNonNull(CountWordsFile.class.getClassLoader().getResourceAsStream("csv/sales_100.csv")));

        String data = csvToString(reader);
        String[][] dataArray = createTable(data);
        int maxReg = getCol(dataArray, 0, 0);
        int maxCou = getCol(dataArray, 0, 1);
        int maxItem = getCol(dataArray, 0, 2);
        int maxSales = getCol(dataArray, 0, 3);
        int maxOrderP = getCol(dataArray, 0, 4);
        int maxOrderD = getCol(dataArray, 0, 5);
        int maxOrderI = getCol(dataArray, 0, 6);
        int maxShip = getCol(dataArray, 0, 7);
        int maxUnits = getCol(dataArray, 0, 8);
        int maxUnitsP = getCol(dataArray, 0, 9);
        int maxUnitsC = getCol(dataArray, 0, 10);
        int maxTotal = getCol(dataArray, 0, 11);
        int maxTotalC = getCol(dataArray, 0, 12);
        int maxTotalP = getCol(dataArray, 0, 13);

        String[] region = getCol(dataArray, 0);
        String[] country = getCol(dataArray, 1);
        String[] item = getCol(dataArray, 2);
        String[] sales = getCol(dataArray, 3);
        String[] orderP = getCol(dataArray, 4);
        String[] orderD = getCol(dataArray, 5);
        String[] orderI = getCol(dataArray, 6);
        String[] ship = getCol(dataArray, 7);
        String[] units = getCol(dataArray, 8);
        String[] unitsP = getCol(dataArray, 9);
        String[] unitsC = getCol(dataArray, 10);
        String[] total = getCol(dataArray, 11);
        String[] totalC = getCol(dataArray, 12);
        String[] totalP = getCol(dataArray, 13);


        printTable(dataArray, maxReg, maxCou, maxItem, maxSales, maxOrderP, maxOrderD, maxOrderI, maxShip, maxUnits, maxUnitsP, maxUnitsC, maxTotal, maxTotalC, maxTotalP, region, country, item, sales, orderP, orderD, orderI, ship, units, unitsP, unitsC, total, totalC, totalP);
        // System.out.println(Arrays.deepToString(dataArray).replace("],","]\n"));
        // System.out.println(Arrays.toString(test));
    }

}
