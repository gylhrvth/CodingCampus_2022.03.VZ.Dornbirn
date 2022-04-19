package gyula.week05;

import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class TicTacToeWithComputer {
    private static Random rand = new Random();
    private final static int WINNING_CONDITION = 10;
    private final static int DEFFENSIVE_CONDITION = 5;


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean executiongame = true;
        while (executiongame) {
            int[][] battlefield = new int[3][3];

            while (true) {
                turn(1, battlefield, sc);
                print(battlefield);
                if (checkForWin(battlefield, 1)) {
                    System.out.println("Player 1 has won");
                    break;
                }
                if (checkForDraw(battlefield)){
                    System.out.println("Draw. The banks win forever!!!");
                    break;
                }
                turnByComputer(2, battlefield);
                print(battlefield);
                if (checkForWin(battlefield, 2)) {
                    System.out.println("Player 2 has won");
                    break;
                }
            }
            executiongame = restartGame(sc);
        }

    }


    private static boolean checkForDraw(int[][] battlefield) {
        for (int y = 0; y < battlefield.length; y++) {
            for (int x = 0; x < battlefield[y].length; x++) {
                if (battlefield[y][x] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkForWin(int[][] battlefield, int player) {
        for (int y = 0; y < battlefield.length; y++) {
            boolean isEmptyOrOtherPlayer = false;
            for (int x = 0; x < battlefield[y].length; x++) {
                if (battlefield[y][x] != player) {
                    isEmptyOrOtherPlayer = true;
                    break;
                }
            }
            if (!isEmptyOrOtherPlayer) {
                return true;
            }

        }
        for (int y = 0; y < battlefield.length; y++) {
            boolean isEmptyOrOtherPlayer = false;
            for (int x = 0; x < battlefield[y].length; x++) {
                if (battlefield[x][y] != player) {
                    isEmptyOrOtherPlayer = true;
                    break;
                }
            }
            if (!isEmptyOrOtherPlayer) {
                return true;
            }
        }

        boolean isEmptyOrOtherPlayer = false;
        for (int i = 0; i < battlefield.length; i++) {
            if (battlefield[i][i] != player) {
                isEmptyOrOtherPlayer = true;
                break;
            }
        }
        if (!isEmptyOrOtherPlayer) {
            return true;
        }

        isEmptyOrOtherPlayer = false;
        for (int x = 0; x < battlefield.length; x++) {
            int y = battlefield.length - 1 - x;
            if (battlefield[y][x] != player) {
                isEmptyOrOtherPlayer = true;
                break;
            }
        }
        if (!isEmptyOrOtherPlayer) {
            return true;
        }
        return false;
    }

    private static int turn(int player, int[][] battlefield, Scanner sc) {
        while (true) {
            int row = readNumber(0, 2, "Player: " + player + "\nPlease enter row", sc);
            int col = readNumber(0, 2, "Player: " + player + "\nPlease enter colum", sc);

            if (battlefield[row][col] == 0) {
                battlefield[row][col] = player;
                break;
            } else {
                System.out.println("Field is not empty");
            }

        }
        return 0;
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

    private static void print(int[][] gameField){
        for (int y = 0; y < gameField.length; y++) {
            for (int x = 0; x < gameField[y].length; x++) {
                System.out.print(gameField[y][x] + " ");
            }
            System.out.println();
        }
    }

    public static boolean restartGame (Scanner sc) {

        System.out.println("Do want play again? Yes or No");
        boolean restart = true;
        boolean execution = true;

        while (restart) {
            String answer = sc.nextLine();

            if (answer.equalsIgnoreCase("yes")) {
                execution = true;
                restart = false;
            } else if (answer.equalsIgnoreCase("no")) {
                execution = false;
                restart = false;
            } else {
                System.out.println("Try it Again");
            }
        }
        return execution;
    }

    private static void turnByComputer(int player, int[][] battlefield) {
        System.out.println("Player: " + player);

        int maxNrPossibleMoves = battlefield.length * battlefield[0].length;
        int[] possibleMoves = new int[maxNrPossibleMoves];
        int[] possibleMovesQuality = new int[maxNrPossibleMoves];
        for (int i = 0; i < possibleMoves.length; i++) {
            possibleMoves[i] = -1;
            possibleMovesQuality[i] = -1;
        }

        int indexPossibleMoves = 0;
        for (int i = 0; i < maxNrPossibleMoves; i++) {
            int row = i / battlefield.length;
            int col = i % battlefield.length;
            // Check if the field is free
            if (battlefield[row][col] == 0){
                possibleMoves[indexPossibleMoves] = i;
                possibleMovesQuality[indexPossibleMoves] = whatIfPlayerSet(player, battlefield, row, col);

                ++indexPossibleMoves;
            }
        }

        // Direct winning
        for (int i = 0; i < possibleMovesQuality.length; i++) {
            if (possibleMovesQuality[i] == WINNING_CONDITION){
                int row = possibleMoves[i] / battlefield.length;
                int col = possibleMoves[i] % battlefield.length;
                battlefield[row][col] = player;
                return;
            }
        }
        // Defensiv Stpe
        for (int i = 0; i < possibleMovesQuality.length; i++) {
            if (possibleMovesQuality[i] == DEFFENSIVE_CONDITION){
                int row = possibleMoves[i] / battlefield.length;
                int col = possibleMoves[i] % battlefield.length;
                battlefield[row][col] = player;
                return;
            }
        }
        // Anything else
        int move = rand.nextInt(indexPossibleMoves);
        int row = possibleMoves[move] / battlefield.length;
        int col = possibleMoves[move] % battlefield.length;
        battlefield[row][col] = player;

        /*
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
        return 0;
         */
    }

    private static int whatIfPlayerSet(int player, int[][] battlefield, int row, int column){
        int[][] testField = new int[battlefield.length][];
        for (int i = 0; i < testField.length; i++) {
            testField[i] = new int[battlefield[i].length];
            for (int j = 0; j < testField[i].length; j++) {
                testField[i][j] = battlefield[i][j];
            }
        }

        testField[row][column] = player;
        if (checkForWin(testField, player)){
            System.out.println("Idealer Schritt " + row + " " + column);
            return WINNING_CONDITION;
        }
//        int otherPlayer = (player == 1)?2:1; // 1 + (1 - (player - 1));
        int otherPlayer;
        if (player == 1) {
            otherPlayer = 2;
        } else {
            otherPlayer = 1;
        }
        testField[row][column] = otherPlayer; // The other player
        if (checkForWin(testField, otherPlayer)){
            System.out.println("Defensiver Schritt " + row + " " + column);
            return DEFFENSIVE_CONDITION;
        }

        return 0;
    }
}