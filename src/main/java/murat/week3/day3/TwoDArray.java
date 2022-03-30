package murat.week3.day3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// User enters the size of a matrix between [2,50]
// User chooses to sum the rows or columns (For row R or r, for column C or c)
// The algorithm calculates and prints the sums of columns or rows

public class TwoDArray {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the dimension of the 2 D Array:");
        int size = readUserNumber(input);

        // Create the matrix with random numbers
        int[][] userMatrix = createA2DArrayWithRandNumbers(rand, size);

        System.out.println();
        System.out.println("Please press R for row sum, C for column sum");
        String userChoice = readUserText(input);

        // If the user chooses R for Rows and C for Columns
        if (userChoice.equals("R") || userChoice.equals("r")) {
            int[] accumulatedRows = accumulateTheNumbersOfRows(userMatrix, size);

            System.out.println("Accumulated rows");
            printAnArray(accumulatedRows, userChoice);

        } else {
            int[] accumulatedColumns = accumulateTheNumbersOfColumn(userMatrix, size);
            System.out.println("Accumulated rows");
            printAnArray(accumulatedColumns, userChoice);
        }

    }

    public static int[][] createA2DArrayWithRandNumbers(Random rand, int size) {

        int[][] twoDArray = new int[size][size];
        int randomNumber;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
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

    public static int[] accumulateTheNumbersOfColumn(int[][] matrix, int size) {

        int[] sumOfColumnsArray = new int[size];

        int sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sumOfColumnsArray[j] = sumOfColumnsArray[j] + matrix[i][j];

            }
        }
        return sumOfColumnsArray;
    }

    public static int[] accumulateTheNumbersOfRows(int[][] matrix, int size) {

        int[] sumOfRowsArray = new int[size];

        int sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
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
