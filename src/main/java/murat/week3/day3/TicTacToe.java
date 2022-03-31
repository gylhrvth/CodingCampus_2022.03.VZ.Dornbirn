package murat.week3.day3;

import javax.imageio.ImageReader;
import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

        int size = 3;
        boolean someoneWins = false;
        boolean itIsADraw = false;
        int userTurn = 1;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the name of the 1st Player");
        String firstPlayer = readUserText(input);

        System.out.println("Please enter the name of the 2nd Player");
        String secondPlayer = readUserText(input);

        int[][] gameMatrix = new int[size][size];

        createANullMatrix(gameMatrix);

        System.out.println("LET'S BEGIN");
        printAMatrix(gameMatrix);

        while (!someoneWins && !itIsADraw) {

            // Change userTurn turn
            if (userTurn > 2) {
                userTurn = 1;
            }

            // Enter row number
            if (userTurn == 1) {
                System.out.println(firstPlayer + " please enter the ROW number between 1-3 (Top to bottom)");
            } else {
                System.out.println(secondPlayer + " please enter the ROW number between 1-3 (Top to bottom)");
            }
            int rowNo = readUserNumber(input);

            // Enter column number
            if (userTurn == 1) {
                System.out.println(firstPlayer + " please enter the COLUMN number between 1-3 (Left to right)");
            } else {
                System.out.println(secondPlayer + " please enter the COLUMN number between 1-3 (Left to right)");
            }
            int colNo = readUserNumber(input);

            // If the cells are already filled! (if the value other than 0 is)
            while (gameMatrix[rowNo - 1][colNo - 1] != 0) {

                // Enter row number
                System.out.println("Please fill the empty cells (zeros)");
                if (userTurn == 1) {
                    System.out.println(firstPlayer + " please enter the ROW number between 1-3 (Top to bottom)");
                } else {
                    System.out.println(secondPlayer + " please enter the ROW number between 1-3 (Top to bottom)");
                }
                rowNo = readUserNumber(input);

                // Enter column number
                if (userTurn == 1) {
                    System.out.println(firstPlayer + " please enter the COLUMN number between 1-3 (Left to right)");
                } else {
                    System.out.println(secondPlayer + " please enter the COLUMN number between 1-3 (Left to right)");
                }
                colNo = readUserNumber(input);
            }

            // For User 1 overwrite 1, for userTurn 2 overwrite 2
            if (userTurn == 1) {
                gameMatrix[rowNo - 1][colNo - 1] = 1;
            } else {
                gameMatrix[rowNo - 1][colNo - 1] = 2;
            }

            printAMatrix(gameMatrix);

            // If someone wins, game finishes.
            someoneWins = winCriterion(gameMatrix);
            itIsADraw = drawOrNot(gameMatrix);

            if (someoneWins) {
                System.out.println("USER " + userTurn + " wins");
            } else if (itIsADraw) {
                System.out.println("DRAW");
            } else {
                userTurn++;
            }
        }
    }

    public static void createANullMatrix(int[][] aMatrix) {

        for (int i = 0; i < aMatrix.length; i++) {
            for (int j = 0; j < aMatrix[i].length; j++) {
                aMatrix[i][j] = 0;
            }
        }
    }

    public static void printAMatrix(int[][] aMatrix) {

        for (int i = 0; i < aMatrix.length; i++) {
            for (int j = 0; j < aMatrix[i].length; j++) {
                System.out.print(aMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean winCriterion(int[][] aMatrix) {

        boolean won = false;

        // Row Check
        for (int i = 0; i < aMatrix.length; i++) {
            if (aMatrix[i][0] == aMatrix[i][1] && aMatrix[i][1] == aMatrix[i][2] && aMatrix[i][2] != 0) {
                System.out.println("Row!");
                won = true;
            }
        }
        // Column Check
        for (int j = 0; j < aMatrix.length; j++) {
            if (aMatrix[0][j] == aMatrix[1][j] && aMatrix[1][j] == aMatrix[2][j] && aMatrix[2][j] != 0) {
                System.out.println("Column!");
                won = true;
            }
        }

        // Diagonal check
        if (aMatrix[0][0] == aMatrix[1][1] & aMatrix[1][1] == aMatrix[2][2] && aMatrix[2][2] != 0) {
            System.out.println("Diagonal!");
            won = true;

            // Reverse diagonal check
        } else if (aMatrix[2][0] == aMatrix[1][1] & aMatrix[1][1] == aMatrix[0][2] && aMatrix[0][2] != 0) {
            System.out.println("Reverse Diagonal!");
            won = true;
        }

        return won;
    }

    public static boolean drawOrNot(int[][] aMatrix) {

        boolean thereIsNoZero = true;
        boolean draw = false;

        for (int i = 0; i < aMatrix.length; i++) {
            for (int j = 0; j < aMatrix[i].length; j++) {
                if (aMatrix[i][j] == 0) {
                    thereIsNoZero = false;
                    break;
                }
            }
        }

        // There is a 0-cell in matrix? If not, it is a draw
        if (thereIsNoZero) {
            draw = true;
        }
        return draw;
    }

    public static int readUserNumber(Scanner sc) {

        int number = Integer.MAX_VALUE;

        while (number == Integer.MAX_VALUE) {
            try {
                String userText = sc.nextLine();
                number = Integer.parseInt(userText);
                if (number < 1 || number > 3) {
                    System.out.println("Please enter a number between [1-3]");
                    number = Integer.MAX_VALUE;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("A number is required!");
            }
        }

        return number;
    }

    public static String readUserText(Scanner sc) {
        return sc.nextLine();
    }

}
