package zah.week01;


import java.sql.SQLOutput;

public class MethodenUndSchleifen {
    public static void printChars(String text, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(text);
        }
        System.out.println();
    }

    public static void printSquare(String text, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(text);
            }
            System.out.println();
        }
    }

    public static void printTriangleTopLeft(String text, int sizeX, int sizeY) {
        for (int i = 0; i < sizeY; i++) {
            for (int j = 0; j < sizeX; j++) {
                System.out.print(text);
            }
            System.out.println();
        }
    }

    public static void printTriangleTopLeft(String text, int size) {
        for (int i = 5; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                System.out.print(text);
            }
            System.out.println();
        }
    }

    public static void printTriangleTopRight(String text, int size) {
        for (int i = 0; i < size; i--) {
            for (int j = 0; j < size + 1; j--) {
                System.out.print(text);
            }
            System.out.println();
        }
    }

    public static void printTest(String text, int size) {

    }
    public static void printEmptySquare(String text, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(text);
        }
        // Had
        System.out.println();
        for (int j = 0; j < size; j++) {
            if (j == 0 || j == size - 1) {
                System.out.print(text);
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
        for (int j = 0; j< size-2;j++) {
            printTest(text, size);
        }
        //body

        for (int i = 0; i < size; i++) {
            System.out.print(text);
        }
        System.out.println();

    }
    //down




    public static void main(String[] args) {
        //printChars("x ", 10);
        //printSquare("A ", 12);
        // printRect("x", 10, 3);
        //printTriangleTopRight("x", 5);
        //printTriangleTopLeft("x", 5);
        //printTriangleTopRight("x", 5);
        //printEmptySquare("M", 5);

    }
}


