package murat.week3.day3;

import javax.imageio.ImageReader;
import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

        int size = 3;

        Scanner input = new Scanner(System.in);
        int[][] gameMatrix = new int[size][size];

        createANullMatrix(gameMatrix);
        printAMatrix(gameMatrix);
        // TEST Values
        // gameMatrix[0][0] = 1; gameMatrix[0][1] = 2; gameMatrix[0][2] = 1;
        // gameMatrix[1][0] = 2; gameMatrix[1][1] = 0; gameMatrix[1][2] = 1;
        // gameMatrix[2][0] = 1; gameMatrix[2][1] = 2; gameMatrix[2][2] = 1;

        boolean finish = false;

        while (!finish) {

            // USER 1
            System.out.println("User 1: Enter Row between 1-3 (Top to bottom)");
            int rowNo = readUserNumber(input);
            System.out.println("User 1: Enter Column between 1-3 (Left to right");
            int colNo = readUserNumber(input);
            gameMatrix[rowNo - 1][colNo - 1] = 1;
            printAMatrix(gameMatrix);
            finish = winCriterion(gameMatrix);
            if (finish) {
                System.out.println("USER 1 wins");
            }

            // USER 2
            System.out.println("User 2: Enter Row (Top to bottom)");
            rowNo = readUserNumber(input);
            System.out.println("User 2: Enter Column (Left to right");
            colNo = readUserNumber(input);
            gameMatrix[rowNo - 1][colNo - 1] = 2;
            printAMatrix(gameMatrix);
            finish = winCriterion(gameMatrix);
            if (finish) {
                System.out.println("USER 2 wins");
            }
        }

        // printAMatrix(gameMatrix, size);
        //  winCriterion(gameMatrix);

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

}
