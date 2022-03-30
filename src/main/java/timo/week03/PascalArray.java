package timo.week03;

import java.util.Arrays;
import java.util.Scanner;

import timo.week02.InputMenu;

public class PascalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countRows = InputMenu.readNumber(sc, "Please enter number of rows ", 0, 20);
        int countColumns = InputMenu.readNumber(sc, "Please enter number of column", 0, 30);

        int[][] userPascalArray2D = pascalArray2D(countRows, countColumns);
        print2DArray(userPascalArray2D);
    }

    public static void print2DArray(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println(Arrays.toString(data[i]));
        }
    }

    public static int[][] pascalArray2D(int numberOfArrays, int length) {
        int[][] array = new int[numberOfArrays][length];
        for (int iRow = 0; iRow < array.length; iRow++) {
            for (int iColumn = 0; iColumn < array[iRow].length; iColumn++) {
                if (iRow == 0 || iColumn == 0) {
                    array[iRow][iColumn] = 1;
                } else {
                    array[iRow][iColumn] = array[iRow][iColumn - 1] + array[iRow - 1][iColumn];
                }
            }
        }
        return array;
    }

}
