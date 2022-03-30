package zah.week03;

import java.util.Arrays;
import java.util.Random;

public class TwoDimensionlArray {
    static Random rand = new Random();

    public static void main(String[] args) {
        int[][] matrix=twoDemensional();


        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println(summeArray(matrix));
    }

    public static int[][] twoDemensional() {
        int[][] matrix = new int[10][10];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rand.nextInt(10);
            }
        }
        return matrix;
    }
    public static int summeArray(int[][]data){
        int sum=0;


        for (int i = 0; i < data.length ; i++) {
            for (int j = 0; j <data[i].length ; j++) {
                sum = sum+ data[i][j];


            }

        }
        return sum;
    }
}
