package philipp.Week03;

import java.util.Scanner;

public class PascalTriangle {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter size of PascalTriangle");
        int pascalTriangleSize = readInput(sc, "Please enter a number!", 0, Integer.MAX_VALUE);
        philipp.Week03.Array2D.printArray(createPascalTriangle(pascalTriangleSize));

    }

    private static int[][] createPascalTriangle(int triangleSize) {
        int[][] createPascalTriangle = new int[triangleSize][];
        for (int i = 0; i < createPascalTriangle.length; i++) {
            createPascalTriangle[i] = new int[triangleSize];
            for (int j = 0; j < createPascalTriangle[i].length; j++) {
                createPascalTriangle[i][j] = 1;
            }
        }
        for (int i = 1; i < createPascalTriangle.length; i++) {
            for (int j = 1; j < createPascalTriangle.length; j++) {
                createPascalTriangle[i][j]= createPascalTriangle[i][j-1] +createPascalTriangle[i-1][j];
            }
        }
        return createPascalTriangle;
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

