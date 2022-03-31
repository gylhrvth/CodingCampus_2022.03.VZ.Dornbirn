package philipp.Week03;

import java.util.Objects;
import java.util.Scanner;

public class TicTacToe {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter TicTacToe Size between 3 and 10:");
        int ticTacToeSize = readInputUser(sc, "Please enter a number between 3 and 10!", 2, 11);
        int[][] ticTacToe = board(ticTacToeSize);

        playGame(ticTacToe, ticTacToeSize);
    }

    private static void playGame(int[][] input, int boardSize) {
        while (true) {
            philipp.Week03.Array2D.printArray(input);
            turn(1, input, boardSize);
            if (resultOutput(input, 1)) {
                philipp.Week03.Array2D.printArray(input);
                System.out.println("Player 1 has won!");
                break;
            }
            if (drawcheck(input)) {
                philipp.Week03.Array2D.printArray(input);
                System.out.println("Draw!!");
                break;
            }
            philipp.Week03.Array2D.printArray(input);
            turn(2, input, boardSize);
            if (resultOutput(input, 2)) {
                philipp.Week03.Array2D.printArray(input);
                System.out.println("Player 2 has won!");
                break;
            }
            if (drawcheck(input)) {
                philipp.Week03.Array2D.printArray(input);
                System.out.println("Draw!!");
                break;
            }
        }
    }

    private static boolean drawcheck(int[][] input) {
        boolean drawCheck = true;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if (input[i][j] == 0) {
                    drawCheck = false;
                    break;
                }
            }
        }
        if (drawCheck) {
            return true;
        }
        return false;
    }

    private static int turn(int userNo, int[][] input, int boardSize) {
        int row;
        int col;
        while (true) {
            System.out.println("Player " + userNo + ": Please enter row number.");
            row = readInputUser(sc, "Please enter number from 1 and " + boardSize, 0, boardSize);
            System.out.println("Player " + userNo + ": Please enter column number.");
            col = readInputUser(sc, "Please enter number from 1 and " + boardSize, 0, boardSize);
            if (input[row - 1][col - 1] != 0) {
                System.out.println("Place occupied! Please pick another one.");
            } else {
                input[row - 1][col - 1] = userNo;
                break;
            }
        }
        return userNo;
    }

    private static boolean resultOutput(int[][] input, int playerNumber) {
        for (int i = 0; i < input.length; i++) {
            boolean lost = false;
            for (int j = 0; j < input[i].length; j++) {
                if (input[i][j] != playerNumber) {
                    lost = true;
                    break;
                }
            }
            if (!lost) {
                return true;
            }
        }
        for (int i = 0; i < input.length; i++) {
            boolean lost = false;
            for (int j = 0; j < input[i].length; j++) {
                if (input[j][i] != playerNumber) {
                    lost = true;
                    break;
                }
            }
            if (!lost) {
                return true;
            }
        }
        boolean lost = false;
        for (int i = 0; i < input.length; i++) {
            if (input[i][i] != playerNumber) {
                lost = true;
                break;
            }
        }
        if (!lost) {
            return true;
        }
        lost = false;
        for (int i = 0; i < input.length; i++) {
            int j = input.length - 1 - i;
            if (input[i][j] != playerNumber) {
                lost = true;
                break;
            }
        }
        if (!lost) {
            return true;
        }
        return false;
    }


    private static int readInputUser(Scanner sc, String alertMessage, int sizeMin, int sizeMax) {
        int n = Integer.MIN_VALUE;
        while (n == Integer.MIN_VALUE) {
            try {
                String text = sc.nextLine();
                n = Integer.parseInt(text);
                if (n < sizeMin || n > sizeMax) {
                    n = Integer.MIN_VALUE;
                    System.out.println(alertMessage);
                }
            } catch (NumberFormatException nfe) {
                System.out.println(alertMessage);
            }
        }
        return n;
    }

    private static int[][] board(int boardSize) {
        int[][] board = new int[boardSize][boardSize];
        for (int i = 0; i < board.length; i++) {
            board[i] = new int[boardSize];
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = 0;
            }
        }
        return board;
    }
}
