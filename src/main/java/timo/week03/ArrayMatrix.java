package timo.week03;

import java.util.Arrays;
import java.util.Random;

public class ArrayMatrix {
    static Random rand = new Random();

    public static void main(String[] args) {

        int[][] my2DArray = array2D(2, 5);
        for (int i = 0; i < my2DArray.length; i++) {
            System.out.println(Arrays.toString(my2DArray[i]));
        }
        System.out.println();
        System.out.println("The sum of all arrays combined is: " + array2DSumOfAll(my2DArray));
        System.out.println();
        array2DSumOfRow(my2DArray);
        System.out.println();
        array2DSumOfColumn(my2DArray);
        System.out.println();
    }

    public static int[][] array2D(int numberOfArrays, int length) {
        int[][] matrix = new int[numberOfArrays][length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rand.nextInt(10);
            }
        }
        return matrix;
    }

    public static int array2DSumOfAll(int[][] data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                sum += data[i][j];
            }
        }
        return sum;
    }


    public static void array2DSumOfRow(int[][] data) {
        for (int iRow = 0; iRow < data.length; iRow++) {
            int sum = 0;
            for (int iColumn = 0; iColumn < data[iRow].length; iColumn++) {
                sum += data[iRow][iColumn];
            }
            System.out.println("The sum of row " + iRow + " is: " + sum);
        }
    }

    public static void array2DSumOfColumn(int[][] data) {
        for (int iColumn = 0; iColumn < data[0].length; iColumn++) {
            int sum = 0;
            for (int iRow = 0; iRow < data.length; iRow++) {
                sum += data[iRow][iColumn];
            }
            System.out.println("The sum of column " + iColumn + " is: " + sum);
        }
    }

}
