package zah.week03;

import java.util.Arrays;

public class TicTacToe {
    public static void main(String[] args) {
        int [][] size = ticTacToe();





        for (int i = 0; i < size.length ; i++) {
            System.out.println(Arrays.toString(size[i]));
        }
    }

    public static int[][] ticTacToe() {
        int[][] data = new int[3][3];
        for (int y = 0; y < data.length; y++) {
            for (int x = 0; x < data[y].length; x++) {

            }
        }
        return data;
    }
}
