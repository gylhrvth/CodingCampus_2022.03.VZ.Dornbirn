package timo.week03;

import timo.week02.InputMenu;

import java.util.Scanner;

import static timo.week03.PascalArray.print2DArray;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] game = ticTacToeField();
        print2DArray(game);

        while(true) {
            turn(game, sc, 1, "PLAYER 1");
            //check if player 1 won
            //break
            turn(game, sc, 2, "PLAYER 2");
            //check if player 2 won
            //break

            //check for draw
        }

    }

    public static int[][] ticTacToeField() {
        int[][] array2D = new int[3][3];
        for (int x = 0; x < array2D.length; x++) {
            for (int y = 0; y < array2D[x].length; y++) {
                array2D[x][y] = 0;
            }
        }
        return array2D;
    }

    public static void overwriteTicTacToeField(int[][] array, int row, int column, int player) {
        array[row][column] = player;
    }

    public static boolean checkIfOccupied(int[][] array2D, int row, int column) {
        return array2D[row][column] != 0;
    }

    public static void turn(int[][] array, Scanner sc, int player, String message) {
        while (true) {
            System.out.println();
            System.out.println(message);
            int readPlayerInputRow = InputMenu.readNumber(sc, "Choose desired row:", 0, 4) - 1;
            int readPlayerInputColumn = InputMenu.readNumber(sc, "Choose desired column:", 0, 4) - 1;

            if (checkIfOccupied(array, readPlayerInputRow, readPlayerInputColumn)) {
                System.out.println("Space is occupied! Please choose different space :)");
            } else {
                overwriteTicTacToeField(array, readPlayerInputRow, readPlayerInputColumn, player);
                System.out.println();
                print2DArray(array);
                break;
            }
        }
    }


}
