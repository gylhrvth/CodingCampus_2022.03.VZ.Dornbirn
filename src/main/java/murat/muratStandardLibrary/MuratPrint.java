package murat.muratStandardLibrary;

import lukas.week3.day4.ConwaysGameOfLife;

public class MuratPrint {
    public static void main(String[] args) {

        int[] numbers = new int[]{3, 4, 5, 7, 8};
        String[] names = new String[]{"Philipp", "Arda", "Murat", "Jimmy \"Cemil\" McGill", "Sergej", "Razvan", "Timo", "Aron", "Gyula", "Lukas"};

        printAStringArray(names, true);
        printAnIntegerArray(numbers);
        printAnInt2DArray(ConwaysGameOfLife.GLEITER);
    }

    public static void printAStringArray(String[] anArray, boolean horizontal) {

        if (!horizontal) {
            for (int i = 0; i < anArray.length; i++) {
                System.out.println(anArray[i]);
            }
        } else {
            for (int i = 0; i < anArray.length; i++) {
                System.out.print(anArray[i] + " ");
            }
        }

    }

    public static void printAnIntegerArray(int[] anArray) {

        for (int i = 0; i < anArray.length; i++) {

            System.out.print(anArray[i] + " ");
        }
        System.out.println();
    }

    public static void printAnInt2DArray(int[][] a2DArray) {

        for (int i = 0; i < a2DArray.length; i++) {
            for (int j = 0; j < a2DArray[i].length; j++) {
                System.out.print(a2DArray[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
