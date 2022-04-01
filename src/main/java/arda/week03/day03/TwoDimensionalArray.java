package arda.week03.day03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TwoDimensionalArray {
    static Random rand = new Random();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("=====wake-up-neo=====");
        int[][] matrix = new int[15][9];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rand.nextInt(100);
            }
        }


        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        String choice = userInput(sc);
        redOrBlue(choice, matrix);
        rowCalculation(matrix);
        columnCalculationByGyula(matrix);

    }

    public static String userInput(Scanner sc) {
        System.out.println();
        System.out.println("pick the red pill and you'll calculate the rows of the matrix\n" +
                "take the blue pill and you'll calculate the columns of the matrix");
        System.out.println();
        System.out.println("which one will it be? neo...");

        String userInput = "";
        while (true) {
            userInput = sc.nextLine();
            if (!(userInput.equals("red") || userInput.equals("blue"))) {
                System.out.println("either red or blue neo. there is nothing else.");
            } else {
                break;
            }
        }
        return userInput;
    }


    public static void columnCalculationByGyula(int[][] matrix) {
        System.out.println("columnCalculationByGyula(): your answer:");
        System.out.println();

        for (int iColumn = 0; iColumn < matrix[0].length; iColumn++) {
            int sumOfColumn = 0;
            for (int iRow = 0; iRow < matrix.length; iRow++) {
                sumOfColumn += matrix[iRow][iColumn];
            }
            System.out.println("Column " + iColumn + " sum is " + sumOfColumn);
        }
    }

    /*
    public static void columnCalculation(int[][] matrix) {
        System.out.println("columnCalculation(): your answer:");
        System.out.println();

        int [] columResultArr = new int[matrix[0].length];
        for (int iRow = 0; iRow < matrix.length; iRow++) {
            for (int iColumn = 0; iColumn < matrix[iRow].length; iColumn++) {
                columResultArr[iColumn] = columResultArr[iColumn] + matrix[iRow][iColumn];
            }
        }
        for (int iColumn = 0; iColumn < columResultArr.length; iColumn++) {
            System.out.println("Column " + iColumn +  " sum is " + columResultArr[iColumn]);
        }
    }

     */

    public static void rowCalculation(int[][] matrix) {
        System.out.println("rowCalculation(): your answer:");
        System.out.println();


        for (int iRow = 0; iRow < matrix.length; iRow++) {
            int rowResult = 0;
            for (int iColumn = 0; iColumn < matrix[iRow].length; iColumn++) {
                rowResult += matrix[iRow][iColumn];
            }
            System.out.println(rowResult);
        }
    }


    public static void redOrBlue(String choice, int[][] matrix) {

        while (true) {
            if (choice.equals("red")) {
                rowCalculation(matrix);
                break;
            } else if (choice.equals("blue")) {
                columnCalculationByGyula(matrix);
                break;
            } else {
                System.out.println("I don't know what went wrong");
                break;
            }
        }
    }
}