package zah.week03;

import java.util.Arrays;
import java.util.Random;

public class TwoDimensionlArray {
    static Random rand = new Random();

    public static void main(String[] args) {
        int[][] number = twoDemensional(5,2);


        for (int i = 0; i < number.length; i++) {
            System.out.println(Arrays.toString(number[i]));

        }


        summeArray1(number);
        summeArray2(number);
        System.out.println("\n================================");
        for (int i = 0; i < number.length; i++) {
            System.out.println("Sum of row " + i + " is " + getSumOfRow(number, i));
        }
        for (int j = 0; j < number[0].length; j++) {
            System.out.println("Sum of column " + j + " is " + getSumOfColumn(number, j));
        }
    }

    public static int[][] twoDemensional( int row, int colum) {
        int[][] data = new int[row][colum];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = rand.nextInt(10);
            }
        }
        return data;
    }


    public static int getSumOfColumn(int[][] data, int iColumn){
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            if (iColumn >= 0 && iColumn<data[i].length) {
                sum = sum + data[i][iColumn];
            }
        }
        return sum;
    }


    public static int getSumOfRow(int[][] data, int iRow){
        int sum = 0;
        if (iRow >= 0 && iRow<data.length) {
            for (int j = 0; j < data[iRow].length; j++) {
                sum = sum + data[iRow][j];
            }
        }
        return sum;
    }

    public static void summeArray1(int[][] data) {

        for (int i = 0; i < data.length; i++) {
            int sum = 0;
            for (int j = 0; j < data[i].length; j++) {
                sum = sum+ data[i][j];
            }
            System.out.println("The row " + i + " summe is; " +  sum);
        }
    }
    public static void summeArray2(int[][] data) {

        for (int j = 0; j < data[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < data.length; i++) {
                sum += data[i][j];
            }
            System.out.println("The collum " + j + " summe is; " + sum);
        }
    }

}
