package murat.week3.day4;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class FourInRows {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] gameMatrix = new int[6][7];
        int[] keepInMind = new int[7];
        int height = gameMatrix.length - 1;
        int userTurn = 0;
        boolean somebodyWins = false;
        boolean isItADraw = false;

        // Generate an array to keep the positions in mind
        createANullArray(keepInMind);

        System.out.println("LET'S GO");
        printAMatrix(gameMatrix);                  // Empty game field
        while (!somebodyWins && !isItADraw) {      // Game stop condition

            System.out.println("User " + (userTurn + 1) + " please enter a column number between [1-7]");
            int colNo = readUserNumber(input) - 1;

            while (gameMatrix[0][colNo] != 0) {

                System.out.println("The column is full. Please enter another column number!");
                colNo = readUserNumber(input) - 1;

                // If all the columns are full, it is a draw.
                isItADraw = drawCriterion(gameMatrix);
                if (isItADraw) {
                    break;
                }
            }

            if (userTurn == 0) {
                gameMatrix[height - keepInMind[colNo]][colNo] = 1;
            } else {
                gameMatrix[height - keepInMind[colNo]][colNo] = 2;
            }

            keepInMind[colNo]++;    // Count the columns
            printAMatrix(gameMatrix);

            somebodyWins = winCriterion(gameMatrix);
            if (somebodyWins) {
                System.out.println(("Player " + userTurn + 1) + " wins!");
            }
            isItADraw = drawCriterion(gameMatrix);
            userTurn = (userTurn + 1) % 2;
        }
    }

    public static void createANullMatrix(int[][] aMatrix) {

        for (int i = 0; i < aMatrix.length; i++) {
            for (int j = 0; j < aMatrix[i].length; j++) {
                aMatrix[i][j] = 0;
            }
        }
    }

    public static int[] createANullArray(int[] anArray) {

        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = 0;
        }
        return anArray;
    }

    public static int readUserNumber(Scanner sc) {

        int number = Integer.MAX_VALUE;

        while (number == Integer.MAX_VALUE) {
            try {
                String userText = sc.nextLine();
                number = Integer.parseInt(userText);
                if (number < 1 || number > 7) {
                    System.out.println("Please enter a number between [1-7]");
                    number = Integer.MAX_VALUE;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("A number is required!");
            }
        }

        return number;
    }

    public static boolean winCriterion(int[][] aMatrix) {

        boolean won = false;

        if (rowCheck(aMatrix) || columnCheck(aMatrix) || diagonalCheck(aMatrix) || reverseDiagCheck(aMatrix)) {
            won = true;
        }

        return won;
    }

    public static boolean drawCriterion(int[][] aMatrix) {

        boolean draw = false;
        int countFullBoxes = 0;

        // Scan the first upper row
        for (int col = 0; col < aMatrix.length; col++) {

            // If there isn't a zero
            if (aMatrix[0][col] != 0) {
                countFullBoxes++;   // Count it

                // If the whole row full is, it's a draw!
                if (countFullBoxes == aMatrix[0].length - 1) {
                    draw = true;
                }
            }
        }
        return draw;
    }

    public static boolean rowCheck(int[][] aMatrix) {

        int counter = 0;
        boolean won = false;

        // Check example: 1-2-0-1-1-2-1   1-2 and 2-0 and 0-1
        for (int row = 0; row < aMatrix.length; row++) {
            for (int column = 0; column < aMatrix[row].length - 1; column++) {

                // Check always if column and column+1 are equal and not a zero
                if (aMatrix[row][column] == aMatrix[row][column + 1] && aMatrix[row][column] != 0) {
                    counter++;
                    if (counter == 3) {        // 3 comparisons, 4 numbers!
                        System.out.println("4 Numbers in the " + (row + 1) + ". row from left to right!");
                        won = true;            // Somebody wins
                        break;                 // Quit
                    }
                } else {
                    counter = 0;   // Example: 1-0-1-1-1-2-0  4 Times 1, but not consecutive. Make the counter 0, if !=
                }
            }
            counter = 0;        // Turn the counter to 0 for every new row
        }
        return won;
    }

    public static boolean columnCheck(int[][] aMatrix) {

        int counter = 0;
        boolean won = false;
        int column = 0;

        // Go down to the next row
        for (int row = 0; row < aMatrix.length - 1; row++) {

            // If two consecutive numbers in the same column are equal.
            if (aMatrix[row][column] == aMatrix[row + 1][column] && aMatrix[row][column] != 0) {
                counter++;

                // If there are 4 numbers the same, (3 pairs, 4 numbers)
                if (counter == 3) {
                    System.out.println("4 Numbers in the " + (column + 1) + ". column from top to bottom!");
                    won = true;    // somebody won
                    break;         // quit
                }

            } else {              // if two consecutive numbers in a column are not the same, set counter to zero.
                counter = 0;
            }

            // If each colum ends, get the next column to the right.
            if (row == 4 && column < aMatrix[row].length - 1) {
                column++;
                row = -1;             // Set the row number to -1 in order to start from 0 in the next column.
                counter = 0;          // Set the counter to zero for the next column.
            }
        }
        return won;
    }

    public static boolean diagonalCheck(int[][] aMatrix) {

        boolean won = false;
        int counter = 0;
        int diagShift = 0;

        // Possible diagonal wins if Row = 0-2 and Column 0-3
        for (int row = 0; row < aMatrix.length - 3; row++) {

            for (int col = 0; col < aMatrix[row].length - 3; col++) {

                // Check if the current number in the current slash and shifted slash are the same and not a zero
                while (aMatrix[row + diagShift][col + diagShift] == aMatrix[row + diagShift + 1][col + diagShift + 1]
                        && aMatrix[row + diagShift][col + diagShift] != 0) {
                    counter++;      // If two diagonal numbers are the same, count it
                    diagShift++;    // Get the next diagonal number

                    // If 3 pairs, 4 numbers are the same, somebody wins
                    if (counter == 3) {
                        System.out.println("4 Numbers in the " + (row + 1) + ". row " + (col + 1) + ". column diagonally!");
                        won = true;
                        break;
                    }
                }
                diagShift = 0;
                counter = 0;
            }
        }
        return won;
    }

    public static boolean reverseDiagCheck(int[][] aMatrix) {

        boolean won = false;
        int counter = 0;
        int revDiagShift = 0;

        // Possible reverse diagonal wins if Row = 0-2 and Column 3-6
        for (int row = 0; row < aMatrix.length - 3; row++) {

            for (int col = aMatrix[row].length - 1; col > 2; col--) {

                // Check if the current number in the current slash and shifted slash are the same and not a zero
                while (aMatrix[row + revDiagShift][col - revDiagShift] == aMatrix[row + revDiagShift + 1][col - revDiagShift - 1]
                        && aMatrix[row + revDiagShift][col - revDiagShift] != 0) {
                    counter++;           // If two diagonal numbers are the same, count it
                    revDiagShift++;      // Get the next diagonal number (Right to left)

                    // If 3 pairs, 4 numbers are the same, somebody wins
                    if (counter == 3) {
                        System.out.println("4 Numbers in the " + (row + 1) + ". row " + (col + 1) + ". column reverse diagonally!");
                        won = true;
                        break;
                    }
                }
                revDiagShift = 0;
                counter = 0;
            }
        }
        return won;
    }

    public static void printAMatrix(int[][] aMatrix) {

        for (int i = 0; i < aMatrix.length; i++) {
            for (int j = 0; j < aMatrix[i].length; j++) {
                System.out.print(aMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printAnArray(int[] anArray) {

        for (int j = 0; j < anArray.length; j++) {
            System.out.print(anArray[j] + " ");
        }
        System.out.println();
        System.out.println();
    }
}
