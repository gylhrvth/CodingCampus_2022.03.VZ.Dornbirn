package aron.week03;

import java.util.Arrays;

public class PascalTriangle {

    public static void main(String[] args) {

        int[][] myArray = pascal();
        for (int i = 0; i < myArray.length; i++) {

            System.out.println();
            System.out.println(Arrays.toString(myArray[i]));

        }
        System.out.println();
    }

    public static int[][] pascal() {
        int[][] data = new int[10][10];
        for (int y = 0; y < data.length; y++) {
            for (int x = 0; x < data[y].length; x++) {
                if (y == 0 || x == 0) {
                    data[y][x] = 1;
                } else {
                    int leftNumber = data[y][x - 1];
                    int topNumber = data[y - 1][x];
                    data[y][x] = leftNumber + topNumber;
                }
            }
        }
        return data;
    }
}



