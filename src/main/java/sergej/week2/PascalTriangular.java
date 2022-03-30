package sergej.week2;

import java.util.Arrays;

public class PascalTriangular {

    public static int[][] matrixArray(int arraysize) {
        int[][] array = new int[arraysize][];
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[arraysize];
            for (int j = 0; j < array[i].length; j++) {
                if (i == 0 || j == 0) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = array[i][j - 1] + array[i - 1][j];
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {

        int[][] testArray = matrixArray(10);

        for (int i = 0; i < testArray.length; i++) {
            System.out.println(Arrays.toString(testArray[i]));
        }


    }
}
