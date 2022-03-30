package gyula.week03;

import java.util.Arrays;
import java.util.Random;

public class TwoDimensionalArray {
    static Random rand = new Random();
    public static void main(String[] args) {
        int[][] matrix = new int[20][];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = new int[1+i];
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rand.nextInt(1000);
            }
        }


        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

    }
}
