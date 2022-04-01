package philipp.Week03;

import java.util.Arrays;
import java.util.Scanner;

public class GenerateFormula {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Please enter the requested exponent of (a+b):");
        int exponent = readInput(sc, "Please enter a number higher than 1", 0, Integer.MAX_VALUE);
        philipp.Week03.Array2D.printArray(pascalTriangle(exponent));
        int[] consonants = consonants(pascalTriangle(exponent), exponent);
        System.out.println();
        System.out.println(Arrays.toString(consonants));
        printFormula(consonants);

    }

    private static void printFormula(int[] input) {
        int i = 0;
        for (int f = 0; f < input.length; f++) {
            if (input.length == 1) {
                System.out.println("1");
                break;
            }
            if (input.length == 2) {
                System.out.println("a + b");
                break;
            }
            if (input.length == 3) {
                System.out.println("a^2 + 2ab + b^2");
                break;
            }
            if (f == 0) {
                System.out.print("a^" + (input.length - 1) + " + ");
            } else if (f == input.length - 1) {
                System.out.println("b^" + (input.length - 1));
            } else if (f == 1) {
                System.out.print(input[f] + "a^" + (input.length - 1 - f) + "b + ");
            } else if (f == input.length - 2) {
                System.out.print(input[f] + "ab^" + f + " + ");
            } else {
                System.out.print(input[f] + "a^" + (input.length - 1 - f) + "b^" + f + " + ");
            }
//            else if (f == input.length - 2) {
//                System.out.print(input[f] + "ab^" + (input.length - 2) + " + ");
//            }
//            else if (input.length % 2 != 0) {
//                if (f <= ((input.length) / 2)) {
//                    System.out.print(input[f] + "a^" + (f + 2) + "b^" + f + " + ");
//                } else if (f > ((input.length) / 2)) {
//                    System.out.print(input[f] + "a^" + (f - 2) + "b^" + f + " + ");
//                }
//            }else if (input.length % 2 == 0) {
//                if (f < ((input.length) / 2)) {
//                    System.out.print(input[f] + "a^" + (f + 1) + "b^" + f + " + ");
//                } else if (f >= ((input.length) / 2)) {
//                    System.out.print(input[f] + "a^" + (f - 1) + "b^" + f + " + ");
//                }
//            }
        }
    }

    private static int[] consonants(int[][] input, int exponent) {
        int[] consonants = new int[exponent + 1];
        int i = 0;
        for (int k = 0; k < consonants.length; k++) {
            consonants[k] = input[i][input.length - 1 - i];
            i++;
        }
        return consonants;
    }

    private static int[][] pascalTriangle(int triangleSize) {
        int[][] pascalTriangle = new int[triangleSize + 1][];
        for (int i = 0; i < pascalTriangle.length; i++) {
            pascalTriangle[i] = new int[triangleSize + 1];
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
