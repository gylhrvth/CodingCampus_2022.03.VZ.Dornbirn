package cemil.week03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TwoDimensionalArrayCemil {
    public static Random rand = new Random();
    Scanner sc = new Scanner(System.in);

    public static void sumRow(int[][] data) {
        System.out.println();
        for (int i = 0; i < data.length; i++) {
            int sum = 0;
            for (int j = 0; j < data[i].length; j++) {
                sum += data[i][j];
            }
            System.out.println("Row " + i + ": " + sum);
        }
    }

    public static void sumColumn(int[][] data) {
        for (int iColumn = 0; iColumn < data[0].length; iColumn++) {
            int sum = 0;
            for (int iRow = 0; iRow < data.length; iRow++) {
                sum += data[iRow][iColumn];
            }
            System.out.println("Column " + iColumn + ": " + sum);
        }
    }
//    Pascal Dreieck machen!!!


    public static int sumRow(int[][] data, int iRow) {
        int sum = 0;
        if ((iRow >= 0) && (iRow < data.length)) {
            for (int j = 0; j < data[iRow].length; j++) {
                sum += data[iRow][j];
            }
        }
        return sum;
    }

/*
    public static int[] sumAllRows(int[][] data){
        // int[] result = new int[data.length]
    }
*/

    public static int sumArray(int[][] data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                sum += data[i][j];
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        int[][] matrix = twoDimensional();

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        sumRow(matrix);
        System.out.println("\n===========================");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Row " + i + ": " + sumRow(matrix, i));
        }
        System.out.println();
        sumColumn(matrix);

    }

    public static int[][] twoDimensional() {
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rand.nextInt(10);
            }
        }
        return matrix;
    }


}








