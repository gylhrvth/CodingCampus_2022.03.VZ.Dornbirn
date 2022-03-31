package murat.week3.day4;

import java.util.Arrays;
import java.util.Scanner;

public class FourInRows {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] gameMatrix = new int[6][7];
        int[] keepInMind = new int[7];
        int height = gameMatrix.length - 1;

        // Generate an array to keep the positions in mind
        for (int j = 0; j < keepInMind.length; j++) {
            keepInMind[j] = 0;

        }
        printAnArray(keepInMind);
        int userTurn = 0;
        System.out.println();

        while (true) {      // Game stop condition

            System.out.println("Please enter a number between [1-7]");
            int colNo = readUserNumber(input) - 1;

            if (userTurn == 0) {
                gameMatrix[height - keepInMind[colNo]][colNo] = 1;
                keepInMind[colNo]++;
                System.out.println();
                printAnArray(keepInMind);
            } else {
                gameMatrix[height - keepInMind[colNo]][colNo] = 2;
                keepInMind[colNo]++;
                System.out.println();
                printAnArray(keepInMind);
            }

            // if the columns are full!
            // while (keepInMind[colNo] <= gameMatrix.length - 1) {
            //    System.out.println("Enter again");
            //    colNo = readUserNumber(input) - 1;
            //     System.out.println("full");
            // }
            printAMatrix(gameMatrix);

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

    public static int readUserNumber(Scanner sc) {

        int number = Integer.MAX_VALUE;

        while (number == Integer.MAX_VALUE) {
            try {
                String userText = sc.nextLine();
                number = Integer.parseInt(userText);
                if (number < 1 || number > 7) {
                    System.out.println("Please enter a number between [1-3]");
                    number = Integer.MAX_VALUE;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("A number is required!");
            }
        }

        return number;
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
