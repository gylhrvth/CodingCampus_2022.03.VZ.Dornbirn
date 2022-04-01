package aron.week03;


import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean executiongame = true;
        while (executiongame) {
            int[][] battlefield = new int[3][3];
            boolean execution = true;

            while (execution) {
                turn(1, battlefield, sc);
                print(battlefield);
                if (checkForWin(battlefield, 1)) {
                    System.out.println("Player 1 has won");
                    execution = true;
                    break;


                }
                turn(2, battlefield, sc);
                print(battlefield);
                if (checkForWin(battlefield, 2)) {
                    System.out.println("Player 2 has won");
                    execution = true;
                    break;

                }

            }
            executiongame = restartGame(sc);


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

            if (answer.equals("yes")) {
                execution = true;
                restart = false;
            } else if (answer.equals("no")) {
                execution = false;
                restart = false;
            } else {
                System.out.println("Try it Again");
            }
        }
        return execution;
    }
}