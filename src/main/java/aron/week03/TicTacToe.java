package aron.week03;


import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

        int[][] battlefield = new int[3][3];

        Scanner sc = new Scanner(System.in);

        while (true) {
            turn(1, battlefield, sc);
            print(battlefield);
            if (checkForWin(battlefield, 1)) {
                System.out.println("Player 1 has won");
                break;

            }
            turn(2, battlefield, sc);
            print(battlefield);
            if (checkForWin(battlefield, 2)) {
                System.out.println("Player 2 has won");
                break;
            }
        }
    }

    private static boolean checkForWin(int[][] battlefield, int player) {
        for (int y = 0; y < battlefield.length; y++) {
            boolean lost = false;
            for (int x = 0; x < battlefield[y].length; x++) {
                if (battlefield[y][x] != player) {
                    lost = true;
                    break;
                }
            }
            if (!lost) {
                return true;

            }

        }
        for (int y = 0; y < battlefield.length; y++) {
            boolean lost = false;
            for (int x = 0; x < battlefield[y].length; x++) {
                if (battlefield[x][y] != player) {
                    lost = true;
                    break;
                }
            }
            if (!lost) {
                return true;
            }
        }
        boolean lost = false;
        for (int i = 0; i < battlefield.length; i++) {
            if (battlefield[i][i] != player) {
                lost = true;
                break;
            }
        }
        if (!lost) {
            return true;
        }


        lost = false;
        for (int x = 0; x < battlefield.length; x++) {
            int y = battlefield.length - 1 - x;
            if (battlefield[y][x] != player) {
                lost = true;
                break;
            }
        }

        if (!lost) {
            return true;

        }
        return false;
    }

    private static int turn(int player, int[][] battlefield, Scanner sc) {
        while (true) {
            int row = readNumber(0, 2, "Player: " + player + "Please enter row", sc);
            int col = readNumber(0, 2, "Player: " + player + "Please enter colum", sc);

            if (battlefield[row][col] == 0) {
                battlefield[row][col] = player;
                break;
            } else {
                System.out.println("Field is not empty");
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