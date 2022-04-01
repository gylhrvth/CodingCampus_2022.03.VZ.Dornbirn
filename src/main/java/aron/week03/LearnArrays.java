package aron.week03;

import gyula.week03.ArrayExample;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LearnArrays {

    public static int readNumber (Scanner sc, String message,int minValue, int maxValue) {
        int result = Integer.MIN_VALUE;

        while ((result < minValue) || (result > maxValue)) {
            System.out.println(message);
            System.out.print(">>>");
            String text = sc.nextLine();
            try {
                result = Integer.parseInt(text);
            } catch (NumberFormatException nfe) {
                System.out.println("Bitte geben Sie eine Zahl ein.");
            }
        }

        return result;
    }


    public static void main(String[] args) {
        String message;
        Scanner sc = new Scanner(System.in);
        int[] temperatuar = {-10, 1, 5, 6, -5, 0, 2, 2, 4};

        System.out.println(temperatuar);
        for (int i = 0; i < temperatuar.length; i++) {
            System.out.print(temperatuar[i] + " ");
        }

        System.out.println();
        System.out.println(Arrays.toString(temperatuar));

        ++temperatuar[2];
        System.out.println(Arrays.toString(temperatuar));

        try {
            temperatuar[100] = 10;

        } catch (IndexOutOfBoundsException iob) {
            System.out.println(iob.getMessage());

            }
        int size = readNumber(sc, "Gib mir eine Größe ein:", 1, 10);
            int[] data = new int[size];
            for (int i = 0; i < data.length; i++) {
                data[i] = 2 * i;
            }
            System.out.println(Arrays.toString(data));

            int testNumber = 5;
            int[] testArray = {5, 6, 7, 8, 9, 10};
            System.out.println(testNumber);
            System.out.println(Arrays.toString(testArray));
            increaseByOne(testNumber, testArray);
            System.out.println(testNumber);
            System.out.println(Arrays.toString(testArray));
        }
        private static void increaseByOne(int testNumber, int[] testArray){
            ++testNumber;
            for (int i = 0; i < testArray.length; i++) {
                ++testArray[i];
            }
        }
    static Random rand = new Random();

    public static void twoD(String[] args) {
        int [][] matrix = new  int [20][];
        for (int i = 0; i < matrix.length; i++){
            matrix[i] = new int[1+i];
            for (int j = 0; j < matrix [i].length;j++){
                matrix[i][j] = rand.nextInt(1000);
            }
        }
        for (int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }

    }
}




