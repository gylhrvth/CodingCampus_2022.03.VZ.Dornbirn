package gyula.week03;

import java.util.Scanner;
import gyula.week02.MenuExample;

public class TicTacToe {
    static Scanner sc = new Scanner(System.in);
    static String[] playerSymbol = {"X", "O"};
    public static void main(String[] args) {
        int size = 3;
        int[][] gameField = initGameField(size);
        // 0 is player X
        // 1 is player O
        // -1 is empty;

        printGameField(gameField);

        int actualPlayer = 0;
        boolean winning = false;
        boolean draw = false;
        while (!winning && !draw) {
            turn(actualPlayer, gameField);
            printGameField(gameField);
            if (checkWin(actualPlayer, gameField)){
                System.out.println("Congratulation for Player " + playerSymbol[actualPlayer] + ". Nice win!");
                winning = true;
            }
            draw = checkDraw(gameField);
            actualPlayer = 1 - actualPlayer;
        }
        if (draw){
            System.out.println("The game has been finished by draw.");
        }
    }

    public static boolean checkDraw(int[][] field){
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == -1){
                    return false;
                }
            }
        }
        return true;
    }


    public static boolean checkRow(int actualPlayer, int[][] field, int row){
        for (int i = 0; i < field[i].length; i++) {
            if (field[row][i] != actualPlayer) return false;
        }
        return true;
    }

    public static boolean checkColumn(int actualPlayer, int[][] field, int column) {
        for (int i = 0; i < field.length; i++) {
            if (field[i][column] != actualPlayer) return false;
        }
        return true;
    }

    public static boolean checkDiagonal(int actualPlayer, int[][] field){
        for (int i = 0; i < field.length; i++) {
            if (field[i][i] != actualPlayer) return false;
        }
        return true;
    }

    public static boolean checkDiagonal2(int actualPlayer, int[][] field){
        for (int i = 0; i < field.length; i++) {
            if (field[field.length - i - 1][i] != actualPlayer) return false;
        }
        return true;
    }

    public static boolean checkWin(int actualPlayer, int[][] field){
        boolean win = false;
        for (int i = 0; i < field.length; i++) { // Check Rows
            win = win || checkRow(actualPlayer, field, i);
        }
        for (int i = 0; i < field[0].length; i++) { // Check Columns
            win = win || checkColumn(actualPlayer, field, i);
        }
        win = win || checkDiagonal(actualPlayer, field);
        win = win || checkDiagonal2(actualPlayer, field);
        return win;
    }

    public static void turn(int actualPlayer, int[][] field){
        System.out.println("Player " + playerSymbol[actualPlayer]);
        boolean validStep = false;

        while (!validStep) {
            int column = MenuExample.readNumber(sc, "Please enter the selected column: ", 1, 3) -1;
            int row = MenuExample.readNumber(sc, "Please enter the selected row: ", 1, 3) -1 ;

            if (field[row][column] == -1){
                field[row][column] = actualPlayer;
                validStep = true;
            } else {
                System.out.println("The position is not empty. Please select an other field");
            }
        }
    }

    public static void printGameField(int[][] field) {
        System.out.println("  | 1 | 2 | 3 |");
        System.out.println("===============");
        for (int i = 0; i < field.length; i++) {
            System.out.print((1+i) + " |");
            for (int j = 0; j < field[i].length; j++) {
                int player = field[i][j];
                if (player >= 0) {
                    System.out.print(" " + playerSymbol[player] + " |");
                } else {                      // Empty
                    System.out.print("   |");
                }
            }
            System.out.println();
            System.out.println("---------------");
        }
    }

    public static int[][] initGameField(int size) {
        int[][] field = new int[size][size];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = -1;
            }
        }
        return field;
    }
}
