package murat.week3.day4;

import java.util.Arrays;
import java.util.Scanner;

// Asks the user for the dimension of the matrix
// Creates Pascal Matrix
public class PascalTriangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the size of the rows: ");
        int sizeOfRows = readUserNumber(input);

        System.out.println("Please enter the size of the columns: ");
        int sizeOfColumns = readUserNumber(input);

        int[][] userMatrix = new int[sizeOfRows][sizeOfColumns];

        System.out.println();
        System.out.println("Your Pascal Matrix:");
        printAMatrix(pascalMatrix(userMatrix));
    }

    public static int[][] pascalMatrix(int[][] aMatrix) {

        for (int y = 1; y < aMatrix.length; y++) {
            for (int x = 1; x < aMatrix[y].length; x++) {
                aMatrix[0][0] = 1;       // The left upper corner must be 1
                aMatrix[y][0] = 1;       // The farther left column must be 1
                aMatrix[0][x] = 1;       // The upper row must be 1
                aMatrix[y][x] = aMatrix[y - 1][x] + aMatrix[y][x - 1];   // The other cells
            }
        }
        return aMatrix;
    }

    public static void printAMatrix(int[][] aMatrix) {

        for (int i = 0; i < aMatrix.length; i++) {
            for (int j = 0; j < aMatrix[i].length; j++) {
                System.out.print(aMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int readUserNumber(Scanner sc) {

        int number = Integer.MAX_VALUE;

        while (number == Integer.MAX_VALUE) {
            try {
                String userText = sc.nextLine();
                number = Integer.parseInt(userText);
                if (number < 2 || number > 50) {
                    System.out.println("Please enter a number between [2-50]");
                    number = Integer.MAX_VALUE;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("A number is required!");
            }
        }

        return number;
    }

}
