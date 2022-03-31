package sergej.week03;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToeNew {


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

    public static int[][] updateBoard(Scanner sc, int[][] board) {
        int[][] updateBoard = board;
        int row = Integer.MAX_VALUE;
        int column = Integer.MAX_VALUE;
        int count = 0;

        boolean occupied = true;
        boolean player = true;
        boolean run = true;
        boolean draw = true;

        while (run&&draw) {
            occupied = true;
            if (player) {
                while (occupied) {
                    System.out.println("Player 1: Please enter row number.");
                    row = playerInput(sc);
                    System.out.println("Player 1: Please enter column number.");
                    column = playerInput(sc);
                    if (board[row - 1][column - 1] == 0) {
                        board[row - 1][column - 1] = 1;
                        occupied = false;
                    } else {
                        System.out.println("Place occupied! Please pick another one.");
                    }
                }
                count += 1;
                draw = draw(count);
                run = checkBoard(board, 1);
                for (int i = 0; i < board.length; i++) {
                    System.out.println(Arrays.toString(board[i]));
                }

                player = false;
            } else {
                while (occupied) {
                    System.out.println("Player 2: Please enter row number.");
                    row = playerInput(sc);
                    System.out.println("Player 2: Please enter column number.");
                    column = playerInput(sc);
                    if (board[row - 1][column - 1] == 0) {
                        board[row - 1][column - 1] = 2;
                        occupied = false;
                    } else {
                        System.out.println("Place occupied! Please pick another one.");
                    }
                }
                count += 1;
                draw = draw(count);
                run = checkBoard(board, 2);
                for (int i = 0; i < board.length; i++) {
                    System.out.println(Arrays.toString(board[i]));
                }
                player = true;

            }

        }
        return updateBoard;
    }

    public static boolean draw(int count){
        boolean draw = true;
        if(count==9){
            draw = false;
            System.out.println("Draw");
        }
        return draw;
    }

    public static boolean checkBoard(int[][] board, int player) {
        boolean win = true;
        int playNum = Integer.MAX_VALUE;

        if (player == 1) {
            playNum = 1;
        } else if (player == 2) {
            playNum = 2;
        }

        // for (int i = 0; i < board.length; i++) {
        //   for (int j = 0; j < board[i].length; j++)
        while (true) {

            if (board[0][0] == playNum && board[0][1] == playNum && board[0][2] == playNum) {

                System.out.println("Player " + playNum + " wins!");
                win = false;
                break;
            }
            if (board[1][0] == playNum && board[1][1] == playNum && board[1][2] == playNum) {

                System.out.println("Player " + playNum + " wins!");
                win = false;
                break;
            }

            if (board[2][0] == playNum && board[2][1] == playNum && board[2][2] == playNum) {

                System.out.println("Player " + playNum + " wins!");
                win = false;
                break;
            }
            if (board[0][0] == playNum && board[1][0] == playNum && board[2][0] == playNum) {

                System.out.println("Player " + playNum + " wins!");
                win = false;
                break;
            }
            if (board[0][1] == playNum && board[1][1] == playNum && board[2][1] == playNum) {

                System.out.println("Player " + playNum + " wins!");
                win = false;
                break;
            }
            if (board[0][2] == playNum && board[1][2] == playNum && board[2][2] == playNum) {

                System.out.println("Player " + playNum + " wins!");
                win = false;
                break;
            }
            if (board[0][0] == playNum && board[1][1] == playNum && board[2][2] == playNum) {

                System.out.println("Player " + playNum + " wins!");
                win = false;
                break;
            }
            if (board[2][0] == playNum && board[1][1] == playNum && board[0][2] == playNum) {

                System.out.println("Player " + playNum + " wins!");
                win = false;
                break;

            } else {
                break;
            }
        }
        return win;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] board = gameBoard();
        updateBoard(sc, board);
        System.out.println();

    }
}
