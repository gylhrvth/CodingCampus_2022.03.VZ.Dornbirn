package cemil.week02;

import cemil.week03.Day4PascalDreieck;

import java.util.Scanner;

public class Day4TicTacToe {
    public static void ticTacToe(int[][] data) {
        for (int y = 0; y < data.length; y++) {
            for (int x = 0; x < data[y].length; x++) {
                int[] row = data[y];
                int col = row[x];
                System.out.printf("%1$8d", col);
            }
            System.out.println();
        }
    }

    private static int[][] creTicTakToe(int size) {
        return new int[size][size];

    }

    private static int readNumber(int min, int max, String massage, Scanner sc) {
        while (true) {
            System.out.println(massage);
            if (sc.hasNextInt()) {
                int number = sc.nextInt();
                if (number <= max && number >= min) {
                    return number;
                }
            } else {
                sc.next();
            }
        }
    }






    public static void main(String[] args) {
        int[][] arr = creTicTakToe(3);
        ticTacToe(arr);
    }
}
