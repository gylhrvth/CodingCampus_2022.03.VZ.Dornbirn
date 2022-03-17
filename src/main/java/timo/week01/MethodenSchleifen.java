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
        //printEmptySquare("A", 3);
        //printSlash("y", 4, false);
        printTriangle("x", 5);

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

        //Deckel
        for (int i = 0; i < size; i++) {
            System.out.print(letter);
        }
        System.out.println();

        //Body
        for (int i = 0; i < size - 2; i++) {
            System.out.print(letter);
            for (int j = 0; j < size - 2; j++) {
                System.out.print(" ");
            }
            System.out.println(letter);
        }

        //Boden
        for (int i = 0; i < size; i++) {
            System.out.print(letter);
        }
    }



    public  static void printSlash(String letter, int size, boolean backslash) {
        if(backslash) {
            printBackslash(letter, size);
        } else {
            printSlash(letter, size);
        }
    }

    public static void printSlash(String letter, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                if (i == size - 1 - j) {
                    System.out.print(letter);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void printBackslash(String letter, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    System.out.print(letter);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void printTriangle(String letter, int size) {

        //Top



        //Body
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size * 2 -1; j++) {
                if (i == size - 1 - j) {
                    System.out.print(letter);
                } else if (i == j - size + 1) {
                    System.out.print(letter);
                } else {
                    System.out.print(" ");
                }


            }
            System.out.println();
        }




        //Bottom
        printChars(letter, 2 * size - 1);
    }
}
