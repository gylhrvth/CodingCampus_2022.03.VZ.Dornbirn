package arda.week01;

public class PrintCharacters {
    public static void main(String[] args) {
        //printChars("x", 10);
        //printSquare("x ",5);
        //printRectangle("x ",10,3);
        //printTriangle("x ", 4);
        //printTriangleTopLeft("x ", 5);
        //printTriangleTopRight("x", 5);
        //printTriangleBottomRight("x", 5);
        //printEmptySquare("x", 10);
        //printEmptySquareSmall("x", 3);
        //printSlash("x ", "y", 3, 4, true);
        //printTriangle1("x", 3);
        //printTriangle2("x", 5);
        //printTriangle3("x", 1);
        printRhombus("x", 7);
    }

    public static void printChars(String c, int size) {
        for (int i = 0; i < size; ++i) {
            System.out.print(c);
        }
    }

    public static void printSquare(String c, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void printRectangle(String c, int size1, int size2) {
        for (int i = 0; i < size2; i++) {
            for (int j = 0; j < size1; j++) {
                System.out.print(c);
            }
            System.out.println(c);
        }
    }

    public static void printTriangle(String c, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void printTriangleTopLeft(String c, int size) {
        for (int i = 0; i < size; i++) { // Zuständig für die Anzahl Zeilen
            for (int j = 0; j < size - i; j++) { // Buchstaben innerhalb einer Zeile
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void printTriangleTopRight(String c, int size) {
        for (int i = 0; i < size; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j < size - i; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void printTriangleBottomRight(String c, int size) {
        for (int i = 0; i < size; i++) {
            for (int k = 0; k < size - i - 1; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void printEmptySquare(String c, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(c);
        }
        System.out.println();


        for (int j = 0; j < size - 2; j++) {
            System.out.print(c);
            for (int l = 0; l < size - 2; l++) {
                System.out.print(" ");
            }
            System.out.print(c);
            System.out.println();
        }


        for (int k = 0; k < size; k++) {
            System.out.print(c);
        }
        System.out.println();


    }

    public static void printEmptySquareSmall(String c, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(c);
        }
        System.out.println();


        for (int j = 0; j < size - 2; j++) {
            System.out.print(c);
            for (int l = 0; l < size - 2; l++) {
                System.out.print(" ");
            }
            System.out.print(c);
            System.out.println();
        }


        for (int k = 0; k < size; k++) {
            System.out.print(c);
        }
        System.out.println();
    }

    public static void printSlash(String c, String d, int size, int size2, boolean key) {

        if (key) {
            for (int i = 0; i < size; i++) {
                for (int k = 0; k < size; k++) {
                    if (i == k) {//or (i-j==0)
                        System.out.print(c);
                    } else {
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }
        } else {
            for (int i = 0; i < size2; i++) {
                for (int k = 0; k < size2; k++) {
                    if (i + k == size2 - 1) {
                        System.out.print(d);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void printTriangle1(String c, int size) {
        for (int i = 0; i < size - 1; i++) {
            for (int k = 0; k < size - i - 1; k++) {
                System.out.print(" ");
            }
            System.out.print(c);
            if (i > 0) {
                printChars(" ", i * 2 - 1);
                System.out.print(c);
            }

            System.out.println();
        }
        printChars(c, size * 2 - 1);
    }

    public static void printTriangle2(String c, int size) {
        for (int i = 0; i < size - 1; i++) {
            for (int k = 0; k < size - i - 1; k++) {
                System.out.print(" ");
            }
            System.out.print(c);
            if (i > 0) {
                printChars(" ", i * 2 - 1);
                System.out.print(c);
            }

            System.out.println();
        }
        printChars(c, size * 2 - 1);
    }

    public static void printTriangle3(String c, int size) {
        for (int i = 0; i < size - 1; i++) {
            for (int k = 0; k < size - i - 1; k++) {
                System.out.print(" ");
            }
            System.out.print(c);
            if (i > 0) {
                printChars(" ", i * 2 - 1);
                System.out.print(c);
            }

            System.out.println();
        }
        printChars(c, size * 2 - 1);
    }

    public static void printRhombus(String c, int size) {
        for (int i = 0; i < size; i++) {
            for (int k = 0; k < size - i - 1; k++) {
                System.out.print(" ");
            }
            System.out.print(c);
            if (i > 0) {
                printChars(" ", i * 2 - 1);
                System.out.print(c);
            }

            System.out.println();
        }
        for (int i = 0; i < size; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print(".");
            }
            System.out.print(c);
            if (i <= size) {
                //printChars(".", i + 9);
                for (int n = 0; n < i; n++){
                    System.out.print(".");
                }
                System.out.println();
            }
        }
    }
}