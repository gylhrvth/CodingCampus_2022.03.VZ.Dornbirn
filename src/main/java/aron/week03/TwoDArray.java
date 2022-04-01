package aron.week03;


import java.util.Arrays;
import java.util.Random;

public class TwoDArray {

    static Random rand = new Random();

    public static void main(String[] args) {

        int[][] myTwoDArray = dimension();
        for (int i = 0; i < myTwoDArray.length; i++) {
            System.out.println(Arrays.toString(myTwoDArray[i]));
        }
        System.out.println();
        System.out.println("Colum:");
        colum(myTwoDArray);
        System.out.println("Row:");
        row(myTwoDArray);
    }

    public static int[][] dimension() {
        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rand.nextInt(100);
            }
        }

        return matrix;
    }

    public static void colum(int[][] data) {
        int columSum = 0;
        for (int i = 0; i < data[0].length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                columSum += data[i][j];
            }
            System.out.println(columSum);
            columSum = 0;
        }
    }

    public static void row(int[][] data) {
        int rowSum = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                rowSum += data[i][j];

            }
            System.out.println(rowSum);
            rowSum = 0;
        }

    }

}




