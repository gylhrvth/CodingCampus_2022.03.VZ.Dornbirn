package philipp.Week03;

import java.util.Arrays;
import java.util.Random;

public class Array2D {
    static Random rn = new Random();

    public static void main(String[] args) {
        int[][] testArray = getRandomNo(4, 10, 11);
        printArray(testArray);
        System.out.println();
//        System.out.println("Sum Row: "+sumRowOrColumn(testArray, true));
//        System.out.println();
//        System.out.println("Sum Column: "+sumRowOrColumn(testArray, false));
        sumRowOrColumn(testArray, true);
        System.out.println();
        sumRowOrColumn(testArray, false);
        System.out.println();
    }

    private static int[][] getRandomNo(int arraySize, int insideArraySize, int bound) {
        int[][] getRandomNo = new int[arraySize][];
        for (int i = 0; i < getRandomNo.length; i++) {
            getRandomNo[i] = new int[insideArraySize];
            for (int j = 0; j < getRandomNo[i].length; j++) {
                getRandomNo[i][j] = rn.nextInt(bound);
            }
        }
        return getRandomNo;
    }

    public static void printArray(int[][] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.println(Arrays.toString(input[i]));
        }
    }

    private static int sumRowOrColumn(int[][] input, boolean sumRow) {
        int sum = 0;
        if (sumRow) {
            for (int i = 0; i < input.length; i++) {
                for (int j = 0; j < input[0].length; j++) {
                    sum += input[i][j];
                }
                System.out.println(sum);
                sum = 0;
            }
        } else {
            for (int j = 0; j < input[0].length; j++) {
                for (int i = 0; i < input.length; i++) {
                    sum += input[i][j];
                }
                System.out.print(sum + " ");
                sum = 0;
            }
        }
        return sum;
    }
}

