package philipp.Week03;

import java.util.Scanner;

public class GenerateFormula {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Please enter the requested exponent of (a+b):");
        int exponent = readInput(sc, "Please enter a number higher than 1", 1, Integer.MAX_VALUE);
        philipp.Week03.Array2D.printArray(pascalTriangle(exponent+1));

    }

    private static int[][] pascalTriangle(int triangleSize) {
        int[][] pascalTriangle = new int[triangleSize][];
        for (int i = 0; i < pascalTriangle.length; i++) {
            pascalTriangle[i] = new int[triangleSize];
            for (int j = 0; j < pascalTriangle[i].length; j++) {
                if (i == 0 || j == 0) {
                    pascalTriangle[i][j] = 1;
                } else {
                    pascalTriangle[i][j] = pascalTriangle[i][j - 1] + pascalTriangle[i - 1][j];
                }
            }
        }
        return pascalTriangle;
    }

    private static int readInput(Scanner sc, String alertMessage, int sizeMin, int sizeMax) {
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
