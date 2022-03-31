package lukas.week3.day4;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

        int[][] gameField = new int[3][3];

        Scanner sc = new Scanner(System.in);

        while (true) {
            turn(1, gameField, sc);
            print(gameField);
            if (checkForWin(gameField, 1)) {
                System.out.println("Player 1 has won");
                break;
            }
            //draw check
            turn(2, gameField, sc);
            print(gameField);
            if (checkForWin(gameField, 2)) {
                System.out.println("Player 2 has won");
                break;
            }
            //draw check
        }
    }

    private static boolean checkForWin(int[][] gameField, int player) {
        //Check for row win
        for (int y = 0; y < gameField.length; y++) {
            boolean lost = false;
            for (int x = 0; x < gameField[y].length; x++) {
                if (gameField[y][x] != player) {
                    lost = true;
                    break;
                }
            }
            if (!lost) {
                return true;
            }
        }
        //Check for col win -> :-D
        for (int y = 0; y < gameField.length; y++) {
            boolean lost = false;
            for (int x = 0; x < gameField[y].length; x++) {
                if (gameField[x][y] != player) {
                    lost = true;
                    break;
                }
            }
            if (!lost) {
                return true;
            }
        }

        //Check \
        boolean lost = false;
        for (int i = 0; i < gameField.length; i++) {
            if (gameField[i][i] != player) {
                lost = true;
                break;
            }
        }
        if (!lost) {
            return true;
        }

        //Check /
        lost = false;
        for (int x = 0; x < gameField.length; x++) {
            int y = gameField.length - 1 - x;
            if (gameField[y][x] != player) {
                lost = true;
                break;
            }
        }
        if (!lost) {
            return true;
        }
        return false;
    }

    private static void turn(int player, int[][] gameField, Scanner sc) {
        while (true) {
            int row = readNumber(0, 2, "Player: " + player + " Please enter row", sc);
            int col = readNumber(0, 2, "Player: " + player + " Please enter column", sc);

            if (gameField[row][col] == 0) {
                gameField[row][col] = player;
                break;
            } else {
                System.out.println("Field is not empty!!!");
            }
        }
    }

    private static int readNumber(int min, int max, String message, Scanner sc) {
        while (true) {
            System.out.println(message);
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

    private static void print(int[][] gameField) {
        for (int y = 0; y < gameField.length; y++) {
            for (int x = 0; x < gameField[y].length; x++) {
                System.out.print(gameField[y][x] + " ");
            }
            System.out.println();
        }
    }


}
