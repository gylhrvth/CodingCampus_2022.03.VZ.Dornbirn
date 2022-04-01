package sergej.week03;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToeAlpha {
    // create board
    // player turn
    // checkboard

    public static int[][] gameBoard() {
        int[][] board = new int[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = 0;
            }
        }
        for (int i = 0; i < board.length; i++) {
            System.out.println(Arrays.toString(board[i]));
        }
        return board;
    }

    public static int playerInput(Scanner sc) {
        int input = Integer.MAX_VALUE;

        System.out.println("Please enter a number:");

        while (input == Integer.MAX_VALUE) {

            try {
                String number = sc.nextLine();
                input = Integer.parseInt(number);
            } catch (NumberFormatException nfe) {
                System.out.println("please enter a valid number!");
            }
        }
        return input;
    }

    public static void playerTurn(Scanner sc, int[][] board, int player) {
        boolean occupied = true;

        while (occupied) {
            System.out.println("Player " + player + ": Please enter row number.");
            int row = playerInput(sc);
            System.out.println("Player " + player + ": Please enter column number.");
            int column = playerInput(sc);
            if (board[row - 1][column - 1] == 0) {
                board[row - 1][column - 1] = player;
                occupied = false;
            } else {
                System.out.println("Place occupied! Please pick another one.");
            }
        }

    }

    public static void updateBoard(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            System.out.println(Arrays.toString(board[i]));
        }

    }

    public static boolean checkWin(int[][] board, int player) {
        boolean run = true;


        for (int y = 0; y < board.length; y++) {
            boolean lost = false;
            for (int x = 0; x < board[y].length; x++) {
                if (board[y][x] != player) {
                    lost = true;
                    break;
                }
            }
            if (!lost) {
                System.out.println("Win");
                run = false;
            }
        }

        for (int y = 0; y < board.length; y++) {
            boolean lost = false;
            for (int x = 0; x < board[y].length; x++) {
                if (board[x][y] != player) {
                    lost = true;
                    break;
                }
            }
            if (!lost) {
                System.out.println("Win");
                run = false;
            }
        }

        boolean lost = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] != player) {
                lost = true;
                break;
            }
        }
        if (!lost) {
            System.out.println("Win");
            run = false;
        }


        lost = false;
        for (int x = 0; x < board.length; x++) {
            int y = board.length - 1 - x;
            if (board[y][x] != player) {
                lost = true;
                break;
            }
        }
        if (!lost) {
            System.out.println("Win");
            run = false;
        }
        return run;
    }

    public static boolean draw(int count) {
        boolean draw = true;
        if (count == 9) {
            draw = false;
            System.out.println("Draw");
        }
        return draw;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean run = true;
        boolean draw = true;

        int count = 0;

        int[][] board = gameBoard();


        while (run && draw ) {
            playerTurn(sc, board, 1);
            count++;
            draw = draw(count);
            if(!draw){
                updateBoard(board);
                break;
            }
            run = checkWin(board, 1);
            if(!run){
                updateBoard(board);
                break;
            }
            updateBoard(board);
            playerTurn(sc, board, 2);
            count++;
            draw = draw(count);
            run = checkWin(board, 2);
            updateBoard(board);
        }

    }

}

