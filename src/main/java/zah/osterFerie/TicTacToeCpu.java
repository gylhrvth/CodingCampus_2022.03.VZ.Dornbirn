package zah.osterFerie;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacToeCpu {
    public static Random rand = new Random();
    static String[] playerSymbol = {"X", "O"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean execution = false;
        boolean draw = false;



        while (!execution && !draw) {
            int[][] gameField = new int[3][3];
            print(gameField);


            while (true) {
                turn(1, gameField, sc);
                print(gameField);
                if (checkForWin(gameField, 1)) {
                    System.out.println("player 1 has won");
                    break;
                } else if (checkDraw(gameField)) {
                    System.out.println(" The game is tie");
                    break;
                }
                System.out.println(".....................");
                turnCpu("cpu", gameField);
                print(gameField);
                if (checkForWin(gameField, 2)) {
                    System.out.println("Player 2 has won");
                    break;
                }
            }

            execution = restartGame(sc);
        }
    }

    public static boolean restartGame(Scanner sc) {
        System.out.println("Do you want to play again? \nPlease enter y or n!");
        boolean playAgainScanner = true;
        boolean execution = true;

        while (playAgainScanner) {
            String answer = sc.nextLine();
            if (answer.equals("y")) {
                execution = true;
                playAgainScanner = false;
            } else if (answer.equals("n")) {
                execution = false;
                playAgainScanner = false;
            } else {
                System.out.println();
            }
        }

        return execution;
    }

    public static boolean checkForWin(int[][] gameField, int player) {


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
        boolean lost = false;
        for (int y = 0; y < gameField.length; y++) {
            if (gameField[y][y] != player) {
                lost = true;
                break;
            }
        }
        if (!lost) {
            return true;
        }
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

    public static boolean checkDraw(int[][] gameField) {
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[i].length; j++) {
                if (gameField[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void turn(int player, int[][] gameField, Scanner sc) {


        while (true) {
            int row = readNumber(1, 3, "Player " + player + " Please enter row: ", sc) - 1;
            int col = readNumber(1, 3, "Player " + player + " Please enter col: ", sc) - 1;
            if (gameField[row][col] == 0) {
                gameField[row][col] = player;
                break;
            } else {
                System.out.println("Fieled is not empty!");
            }
        }
    }

    public static void turnCpu(String PlayeCpu, int[][] gameField) {
        while (true) {
            int cpu = rand.nextInt(9);
            int row = cpu / 3;
            int col = cpu / 3;
            if (gameField[row][col] == 0) {
                gameField[row][col] = 2;
                break;
            } else {
                // System.out.println("Fieled is not empty!");
            }
        }

    }

    public static int readNumber(int min, int max, String mesage, java.util.Scanner sc) {
        while (true) {
            System.out.println(mesage);
            if (sc.hasNextInt()) {
                int number = sc.nextInt();
                if (number <= max || number >= min)
                    return number;
            } else {
                sc.next();
            }
        }
    }


    public static void print(int[][] gameField) {
        for (int y = 0; y < gameField.length; y++) {
            for (int x = 0; x < gameField[y].length; x++) {
                System.out.print(gameField[y][x] + " ");

            }
            System.out.println();

        }
    }
}

