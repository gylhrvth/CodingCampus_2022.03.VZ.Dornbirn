package cemil.week02;

import cemil.week03.Day4PascalDreieck;

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






    public static void main(String[] args) {
        int[][] arr = creTicTakToe(3);
        ticTacToe(arr);
    }
}
