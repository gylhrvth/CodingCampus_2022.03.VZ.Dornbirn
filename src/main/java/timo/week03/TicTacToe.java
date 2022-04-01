package timo.week03;

import timo.week02.InputMenu;

import java.util.Scanner;

import static timo.week03.PascalArray.print2DArray;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean execution = true;

        while (execution) {
            int[][] game = ticTacToeField();
            boolean executionGame = true;
            print2DArray(game);
            int turncount = 0;

            while (executionGame) {
                turn(game, sc, 1, "PLAYER 1");
                if (checkForWin(game, 1)) {
                    displayWinMessage(1);
                    executionGame = false;
                    break;
                }
                turncount++;
                if (turncount == 9) {
                    System.out.println();
                    System.out.println("***** It's a draw! *****");
                    System.out.println();
                    System.out.println("- Game Over -");
                    executionGame = false;
                    break;
                }
                turn(game, sc, 2, "PLAYER 2");
                if (checkForWin(game, 2)) {
                    displayWinMessage(2);
                    executionGame = false;
                    break;
                }
                turncount++;
            }
            execution = restartGame(sc);
            System.out.println();
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

    public static boolean checkIfOccupied(int[][] array, int row, int column) {
        return array[row][column] != 0;
    }

    public static void turn(int[][] array, Scanner sc, int player, String message) {
        while (true) {
            System.out.println();
            System.out.println(message);
            int readPlayerInputRow = InputMenu.readNumber(sc, "Choose desired row:", 0, 4) - 1;
            int readPlayerInputColumn = InputMenu.readNumber(sc, "Choose desired column:", 0, 4) - 1;

            if (checkIfOccupied(array, readPlayerInputRow, readPlayerInputColumn)) {
                System.out.println("Space is occupied! Please choose a different space");
            } else {
                overwriteTicTacToeField(array, readPlayerInputRow, readPlayerInputColumn, player);
                System.out.println();
                print2DArray(array);
                break;
            }
        }
    }

    public static boolean checkForWin(int[][] array, int player) {
        // Check for row win
        for (int y = 0; y < array.length; y++) {
            boolean lost = false;
            for (int x = 0; x < array[y].length; x++) {
                if (array[y][x] != player) {
                    lost = true;
                    break;
                }
            }
            if (!lost) {
                return true;
            }
        }
        // Check for column win
        for (int y = 0; y < array.length; y++) {
            boolean lost = false;
            for (int x = 0; x < array[y].length; x++) {
                if (array[x][y] != player) {
                    lost = true;
                    break;
                }
            }
            if (!lost) {
                return true;
            }
        }
        // Check for \ win
        boolean lost = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i][i] != player) {
                lost = true;
                break;
            }
        }
        if (!lost) {
            return true;
        }
        //Check for / win
        lost = false;
        for (int x = 0; x < array.length; x++) {
            int y = array.length - 1 - x;
            if (array[y][x] != player) {
                lost = true;
                break;
            }
        }
        if (!lost) {
            return true;
        }
        return false;
    }

    public static void displayWinMessage(int player) {
        System.out.println();
        System.out.println("***** PLAYER " + player + " has won! *****");
        System.out.println();
        System.out.println("- Game Over -");
    }

    public static boolean restartGame(Scanner sc) {
        System.out.println("Do you want to play again? \nEnter \"y\" or \"n\"");
        boolean playAgainScanner = true;
        boolean executing = true;

        while (playAgainScanner) {
            String answer = sc.nextLine();

            if (answer.equals("y")) {
                executing = true;
                playAgainScanner = false;
            } else if (answer.equals("n")) {
                System.out.println("Thank you for playing!");
                executing = false;
                playAgainScanner = false;
            } else {
                System.out.println("Please enter valid answer");
            }
        }
        return executing;
    }


}
