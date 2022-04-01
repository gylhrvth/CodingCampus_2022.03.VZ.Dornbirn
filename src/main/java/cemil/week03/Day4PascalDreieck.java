package cemil.week03;

import cemil.week02.Day4Random;

import java.util.Arrays;
import java.util.Scanner;

public class Day4PascalDreieck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = Day4Random.readInt(sc, "Gib deine Zahl ein", 1, 100);


        int[][] arr = crePas(row);
        buiPas(arr);
        priPas(arr);
    }

    private static void buiPas(int[][] arr) {
        for (int y = 0; y < arr.length; y++) {
            for (int x = 0; x < arr[y].length; x++) {
                if (y == 0 || x == 0) {
                    int[] row = arr[y];
                    row[x] = 1;
                } else {
                    int leftNumber = arr[y][x - 1];
                    int rightNumber = arr[y - 1][x];
                    arr[y][x] = leftNumber + rightNumber;
                }
            }

        }
    }

    private static void priPas(int[][] data) {
        for (int y = 0; y < data.length; y++) {
            for (int x = 0; x < data[y].length; x++) {
                int[] row = data[y];
                int col = row[x];
                System.out.printf("%1$8d", col);
            }
            System.out.println();
        }
    }

    private static int[][] crePas(int size) {
        return new int[size][size];

    }
}
