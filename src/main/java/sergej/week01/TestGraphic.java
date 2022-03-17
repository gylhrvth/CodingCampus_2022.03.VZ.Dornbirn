package sergej.week01;

public class TestGraphic {
    public static void printChars(String text, int size) {
        for (int i = 0; i < size; ++i) {
            System.out.print(text);
        }
    }

    public static void printSquare(String text, int size) {
        for (int i = 0; i < size; ++i) {

            for (int j = 1; j <= size - 1; ++j) {
                System.out.print(text);
            }
            System.out.println();
        }
    }

    public static void printRect(String text, int row, int col) {
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                System.out.print(text);
            }
            System.out.println();

        }
    }

    public static void printTriangleBottomLeft(String text, int size) {
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j <= i; ++j) {
                System.out.print(text);
            }
            System.out.println();
        }
    }

    public static void printTriangleTopLeft(String text, int size) {
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size - i; ++j) {
                System.out.print(text);
            }
            System.out.println();
        }
    }

    public static void printTriangleBottomRight(String x, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print(x);
            }
            System.out.println();
        }
    }

    public static void printEmptySquare(String text, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1) {
                    System.out.print(text);
                } else if (j == 0 || j == size - 1) {
                    System.out.print(text);
                } else {
                    System.out.print(".");
                }

            }
            System.out.println();
        }
    }

    public static void printBacksSlash(String text, int size) {
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                if (i == j  ) {
                    System.out.print(text);
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();

        }
    }

    public static void printFrontSlash(String text, int size) {
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                if (i == j  ) {
                    System.out.print(text);
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        // printChars("x",10);
        // printSquare("x", 10);
        //printRect("x",3,10);
        //printTriangleBottomLeft("x",5);
        //printTriangleTopLeft("x",5);
        // printTriangleBottomRight("x",5);
        //printEmptySquare("x", 10);
        //printEmptySquare("a",3);
        printBacksSlash("x",5);
        //printSlash("x", 5, true);
    }
}

