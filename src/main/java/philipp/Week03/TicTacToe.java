package philipp.Week03;

import java.util.Scanner;

public class TicTacToe {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter TicTacToe Size between 3 and 10:");
        int ticTacToeSize = readInputUser(sc, "Please enter a number between 3 and 10!", 2, 11);
        int[][] ticTacToe = new int[ticTacToeSize][ticTacToeSize];
        philipp.Week03.Array2D.printArray(ticTacToe);

        playGame(true, ticTacToe, ticTacToeSize);
    }

    private static void playGame(boolean user, int[][] input, int boardSize) {
        boolean occupied = true;
        int row = 0;
        int col = 0;
        int counter = boardSize * boardSize;
        while (counter > 0) {
            occupied = true;
            if (user) {
                while (occupied) {
                    System.out.println("User 1: Please enter row number.");
                    row = readInputUser(sc, "Please enter number 1, 2 or 3!", 0, 4);
                    System.out.println("User 1: Please enter column number.");
                    col = readInputUser(sc, "Please enter number 1, 2 or 3!", 0, 4);
                    if (input[row - 1][col - 1] == 0) {
                        input[row - 1][col - 1] = 1;
                        occupied = false;
                    } else {
                        System.out.println("Place occupied! Please pick another one.");
                    }
                }
                user = false;
            } else {
                while (occupied) {
                    System.out.println("User 2: Please enter row number.");
                    row = readInputUser(sc, "Please enter number 1, 2 or 3!", 0, 4);
                    System.out.println("User 2: Please enter column number.");
                    col = readInputUser(sc, "Please enter number 1, 2 or 3!", 0, 4);
                    if (input[row - 1][col - 1] == 0) {
                        input[row - 1][col - 1] = 2;
                        occupied = false;
                    } else {
                        System.out.println("Place occupied! Please pick another one.");
                    }
                }
                user = true;
            }
            philipp.Week03.Array2D.printArray(input);
            counter += 1;
        }
    }

    private static void resultOutput(int[][] data) {
        int sum = 0;
        if (sum != 6 || sum != 3) for (int i = 0; i < data.length; i++) {

        }

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


}
