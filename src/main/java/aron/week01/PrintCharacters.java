package aron.week01;

import java.util.jar.JarEntry;

public class PrintCharacters {
    public static void main(String[] args) {
        //printChars("A ", 3);
        System.out.println();
        //printSquare("B ", 5);
        System.out.println();
        //printRect("C", 5, 2);
        System.out.println();
        //printTriangleBottomLeft("D ", 4);
        System.out.println();
        //printTriangleTopLeft("E ", 5);
        System.out.println();
        //printTriangleTopRight("F ", 5);
        System.out.println();
        //printTriangleBottomRight("G", 5);
        System.out.println();
        //printEmptySquare("H", 10);
        System.out.println();
        //printEmptySquare3("I", 3);
        System.out.println();
        //printSlashTop("J", 3, true);
        System.out.println();
        //printSlashBottom("K", 4, false);
        System.out.println();
        //printTriangle("L", 3);
        System.out.println();
        //printTriangleBig("M", 5);
        System.out.println();
        //printRhombus("N", 7);
        System.out.println();
        //printX("O", 5);
        System.out.println();
        printChristmastree("P", 9);
        System.out.println();
    }

    public static void printChars(String name, int amount) {
        int i = 1;
        while (i <= amount) {
            System.out.print(name);
            ++i;
        }
        System.out.println();
    }

    public static void printSquare(String name, int amount) {
        for (int i = 0; i < amount; i++) {
            for (int j = 0; j < amount; j++) {
                System.out.print(name);
            }
            System.out.println();
        }
    }

    public static void printRect(String name, int amount, int line) {
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < amount; j++) {
                System.out.print(name);
            }
            System.out.println();
        }
    }

    public static void printTriangleBottomLeft(String name, int amount) {
        for (int i = 0; i < amount; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(name);
            }
            System.out.println();
        }
    }

    public static void printTriangleTopLeft(String name, int amount) {
        for (int i = 0; i < amount; i++) {
            for (int j = i; j < amount; j++) {
                System.out.print(name);
            }
            System.out.println();
        }
    }

    public static void printTriangleTopRight(String name, int amount) {
        for (int i = 0; i < amount; i++) {
            for (int j = 0; j < amount; j++) {
                if (j < i) {
                    System.out.print("  ");
                } else {
                    System.out.print(name);
                }
            }
            System.out.println();

        }
    }

    public static void printTriangleBottomRight(String x, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                System.out.print(" +");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print(x);
            }
            System.out.println();
        }
    }

    public static void printEmptySquare(String x, int size) {
        printChars(x, size);

        for (int i = 0; i < size - 2; i++) {
            System.out.print("x");
            for (int j = 0; j < size - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("x");
        }
        printChars(x, size);
    }

    public static void printEmptySquare3(String A, int size) {
        printChars(A, size);

        for (int i = 0; i < size - 2; i++) {
            System.out.print("A");
            for (int j = 0; j < size - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("A");
        }
        printChars(A, size);

    }

    public static void printSlashTop(String x, int size, boolean b) {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println(x);
        }
    }

    public static void printSlashBottom(String y, int size, boolean b) {
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                System.out.print(" ");
            }
            System.out.println(y);
        }
    }

    public static void printTriangle(String x, int size) {
        for (int i = 1; i < size; i++) {
            for (int j = i; j < size; j++) {

                System.out.print(" ");
            }
            if (i > 1) {
                System.out.print(x);
                for (int k = 0; k < (i - 1) * 2 - 1; k++) {
                    System.out.print(" ");
                }
            }
            System.out.println(x);
        }
        printChars(x, size * 2 - 1);
    }


    public static void printTriangleBig(String x, int size) {
        for (int i = 1; i < size; i++) {
            for (int j = i; j < size; j++) {

                System.out.print(" ");
            }
            if (i > 1) {
                System.out.print(x);
                for (int k = 0; k < (i - 1) * 2 - 1; k++) {
                    System.out.print(" ");
                }
            }
            System.out.println(x);
        }
        printChars(x, size * 2 - 1);
    }

    public static void printRhombus(String x, int size) {
        for (int i = 0; i < size / 2; i++) {
            for (int j = i; j < size; j++) {

                System.out.print(" ");
            }
            if (i > 0) {
                System.out.print(x);
                for (int k = 0; k < i * 2 - 1; k++) {
                    System.out.print(" ");
                }
            }
            System.out.println(x);

        }
        for (int i = size / 2; i >= 0; i--) {
            for (int j = i; j < size; j++) {

                System.out.print(" ");
            }
            if (i > 0) {
                System.out.print(x);
                for (int k = 0; k < i * 2 - 1; k++) {
                    System.out.print(" ");
                }
            }
            System.out.println(x);
        }
    }

    public static void printX(String x, int size) {


        for (int i = size / 2; i >= 0; i--) {
            for (int j = i; j < size; j++) {

                System.out.print(" ");
            }
            if (i > 0) {
                System.out.print(x);
                for (int k = 0; k < i * 2 - 1; k++) {
                    System.out.print(" ");
                }
            }
        }
        System.out.println(x);
        for (int i = 0; i < size / 2; i++) {
            for (int j = i; j < size; j++) {

                System.out.print(" ");
            }
            if (i > 0) {
                System.out.print(x);
                for (int k = 0; k < i * 2 - 1; k++) {
                    System.out.print(" ");
                }
            }
            System.out.println(x);
        }

    }

    public static void printChristmastree(String x, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {

                System.out.print(" ");
            }
            if (i > 0) {
                System.out.print(x);
                for (int k = 0; k < i  * 2 - 1; k++) {
                    System.out.print("P");
                }
            }
            System.out.println(x);
        }
        printChars(x , size * 2 - 1);
        printRect("C", 5, 2);
    }


}








































