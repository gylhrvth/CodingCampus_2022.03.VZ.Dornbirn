package philipp.Week03;

import java.util.Random;
import java.util.Scanner;

public class FourInRow {
    static Scanner sc = new Scanner(System.in);
    static Random rn = new Random();

    public static void main(String[] args) {
        //int[][] test = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        play4InRow(board(6, 7), 7);
    }

    private static void play4InRow(int[][] board, int cols) {
        int[] coord;
        while (true) {
            Array2D.printArray(board);
            coord = turn(1, board, cols);
            if (winCheckRowCol(board, coord, 1)) {
                Array2D.printArray(board);
                System.out.println("Player 1 has won!");
                return;
            }
//          check win slash backslash
            if (drawCheck(board)) {
                Array2D.printArray(board);
                System.out.println("Draw!!");
                return;
            }
            Array2D.printArray(board);
            coord = turn(2, board, cols);
            if (winCheckRowCol(board, coord, 2)) {
                Array2D.printArray(board);
                System.out.println("Player 2 has won!");
                return;
            }
//          check win slash backslash
            if (drawCheck(board)) {
                Array2D.printArray(board);
                System.out.println("Draw!!");
                return;
            }
        }
    }

    private static boolean drawCheck(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean winCheckRowCol(int[][] board, int[] coord, int playerNo) {
        int i = coord[0];
        int j = coord[1];
        int counter = 0;
        int x = 0;
        while (x < board.length-1) {
            if (board[x][j] == playerNo) {
                counter++;
                if (counter == 4) {
                    return true;
                }
            } else {
                counter = 0;
            }
            x++;
        }
        x = 0;
        while (x < board[i].length) {
            if (board[i][x] == playerNo) {
                counter++;
                if (counter == 4) {
                    return true;
                }
            } else {
                counter = 0;
            }
            x++;
        }
        return false;
    }

    private static boolean winCheckDiagonal(int[][] board, int[] coord, int playerNo){
        int i = coord[0];
        int j = coord[1];
        int counter = 0;


        return false;
    }

    private static int[] turn(int playerNo, int[][] board, int numberOfCols) {
        System.out.println("Player " + playerNo + ": Please enter row number from 1 to " + numberOfCols);
        int colNo = readInputUser(sc, "Please enter row number from 1 to " + numberOfCols, 0, numberOfCols);
        // Ask again when row full!!
        while (board[0][colNo - 1] != 0) {
            System.out.println("Player " + playerNo + ": Row full, pleas pick another one! ");
            colNo = readInputUser(sc, "Please enter a row number!", 0, numberOfCols);
        }
        int j = colNo - 1;
        int i = board.length - 1;
        while (board[i][j] != 0) {
            i--;
        }
        board[i][j] = playerNo;
        int[] coordinates = {i, j};
        return coordinates;
    }


    private static int[][] board(int row, int col) {
        int[][] board = new int[row][col];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = 0;
            }
        }
        return board;
    }

    private static int readInputUser(Scanner sc, String alertMsg, int sizeMin, int sizeMax) {
        int n = Integer.MIN_VALUE;
        while (n == Integer.MIN_VALUE) {
            try {
                String text = sc.nextLine();
                n = Integer.parseInt(text);
                if (n < sizeMin || n > sizeMax) {
                    n = Integer.MIN_VALUE;
                    System.out.println(alertMsg);
                }
            } catch (NumberFormatException nfe) {
                System.out.println(alertMsg);
            }
        }
        return n;
    }
}
