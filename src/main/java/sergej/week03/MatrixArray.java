package sergej.week03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MatrixArray {

    public static int[][] randoMatrixArray(int arraysize, int arraysize2) {
        Random rand = new Random();
        int[][] array = new int[arraysize][];
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[arraysize2];
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(100);
            }
        }
        return array;
    }

    public static void sumMatrix(Scanner sc, int[][] array) {
        int answer = 0;
        int sum_row = 0;
        int rowNum = 0;
        int sum_col = 0;
        int colNum = 0;
        boolean row = true;

        System.out.println("Hello what SUM  would you like to calculate:\n" +
                "sum of rows  enter: 1\n" +
                "sum of cols enter: 2");

        while (sc.hasNextInt()) {
            answer = sc.nextInt();
            if (answer == 1) {
                row = true;
                break;
            } else if (answer == 2) {
                row = false;
                break;
            }
        }


        if (row) {
            for (int i = 0; i < array.length; ++i) {
                for (int j = 0; j < array[i].length; ++j) {
                    sum_row += array[i][j];
                    rowNum = i + 1;
                }
                System.out.println("Total sum of row " + rowNum + " is: " + sum_row);
                sum_row = 0;
            }
        } else {
            for (int j = 0; j < array[0].length; ++j) {
                for (int i = 0; i < array.length; ++i) {
                    sum_col += array[i][j];
                    colNum = j + 1;
                }
                System.out.println("Total sum of col " + colNum + " is: " + sum_col);
                sum_col = 0;
            }
        }

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] testArray = randoMatrixArray(2, 5);
        //System.out.println(Arrays.toString(testArray));

        for (int i = 0; i < testArray.length; i++) {
            System.out.println(Arrays.toString(testArray[i]));
        }

        sumMatrix(sc, testArray);
    }
}
