package timo.week01;

import java.sql.SQLOutput;

public class MethodenSchleifen {

    public static void main(String[] args) {
        //printChars("x ", 5);
        //printSquare("x ", 4);
        //printRectangle("x ", 10, 3);
        //printTriangleBottomLeft("x ", 4);
        //printTriangleTopLeft("x ", 5);
        //printTriangleBottomRight("x", 5);
        printEmptySquare("x", 10);


    }

    public static void printChars(String letter, int number) {

        for (int i = 0; i < number; i++) {
            System.out.print(letter);
        }
        System.out.println();
    }

    public static void printSquare(String letter, int size) {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(letter);
            }
            System.out.println();
        }
    }

    public static void printRectangle(String letter, int row, int col) {

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(letter);
            }
            System.out.println();
        }
    }

    public static void printTriangleBottomLeft(String letter, int size) {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(letter);
            }
            System.out.println();
        }
    }

    public static void printTriangleTopLeft(String letter, int size) {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(letter);
            }
            System.out.println();
        }
    }

    public static void printTriangleBottomRight(String letter, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print(letter);
            }
            System.out.println();
        }
    }

    public static void printEmptySquare(String letter, int size) {
        for (int i = 0; i < size; i++) {
            if (i == 1 || i == size-1) {
                System.out.println("--------");
                }
            for (int j = 0; j <= size; j++) {
            }
            System.out.println(letter);
        }
    }
}
