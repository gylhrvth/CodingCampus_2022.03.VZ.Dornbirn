package murat.week3.day3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// User enters the size of the row of a matrix between [2,50]
// User enters the size of the column of a matrix between [2,50]
// User chooses to sum the rows or columns (For row R or r, for column C or c)
// The algorithm calculates and prints the sums of columns or rows

public class TwoDArray {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the size of the rows: ");
        int sizeOfRows = readUserNumber(input);

        System.out.println("Please enter the size of the columns: ");
        int sizeOfColumns = readUserNumber(input);

        // Create the matrix with random numbers
        int[][] userMatrix = createA2DArrayWithRandNumbers(rand, sizeOfRows, sizeOfColumns);

        System.out.println();
        System.out.println("Please press R for row sum, C for column sum");
        String userChoice = readUserText(input);

        // If the user chooses R for Rows and C for Columns
        if (userChoice.equals("R") || userChoice.equals("r")) {
            int[] accumulatedRows = accumulateTheNumbersOfRows(userMatrix);

            System.out.println("Accumulated rows");
            printAnArray(accumulatedRows, userChoice);

        } else {
            int[] accumulatedColumns = accumulateTheNumbersOfColumn(userMatrix);
            System.out.println("Accumulated columns");
            printAnArray(accumulatedColumns, userChoice);
        }

    }

    public static int[][] createA2DArrayWithRandNumbers(Random rand, int size1, int size2) {

        int[][] twoDArray = new int[size1][size2];
        int randomNumber;

        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                randomNumber = rand.nextInt(100);
                twoDArray[i][j] = randomNumber;
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }
        return twoDArray;
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

    public static String readUserText(Scanner sc) {

        String userText;

        while (true) {
            userText = sc.nextLine();

            if (!(userText.equals("R") || userText.equals("C") || userText.equals("r") || userText.equals("c"))) {
                System.out.println("Please enter R or C");
            } else {
                break;
            }
        }

        return userText;
    }

    public static int[] accumulateTheNumbersOfColumn(int[][] matrix) {

        int[] sumOfColumnsArray = new int[matrix[0].length];

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sumOfColumnsArray[j] = sumOfColumnsArray[j] + matrix[i][j];
            }
        }
        return sumOfColumnsArray;
    }

    public static int[] accumulateTheNumbersOfRows(int[][] matrix) {

        int[] sumOfRowsArray = new int[matrix.length];

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sumOfRowsArray[i] = sumOfRowsArray[i] + matrix[i][j];
            }
        }
        return sumOfRowsArray;
    }

    public static void printAnArray(int[] anArray, String typeOfArray) {

        // Print either a row or a column
        if (typeOfArray.equals("R") || typeOfArray.equals("r")) {               // Print a row, vertical
            for (int i = 0; i < anArray.length; i++) {
                System.out.println((i + 1) + ".Row: " + anArray[i] + " ");
            }
        } else {                                                                // Print a column, horizontal
            for (int i = 0; i < anArray.length; i++) {
                System.out.print((i + 1) + ".Col: " + anArray[i] + " ");
            }
            System.out.println();
        }
    }
}
