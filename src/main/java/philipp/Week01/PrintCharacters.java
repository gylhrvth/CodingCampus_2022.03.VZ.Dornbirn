package philipp.Week01;

public class PrintCharacters {
    public static void main(String[] args) {
        //printChars("A ", 3);
        //printSquare("B ", 5);
        //printRect("C ", 5, 2);
        //printTriangleBottomLeft("D ", 4);
        //System.out.println();
        //printTriangleTopLeft("E ", 5);
        //System.out.println();
        //printTriangleTopRight("F ", 5);
        //System.out.println();
        //printTriangleBottomRight("G ", 5);
        //System.out.println();
        printEmptySquare("H ", 10);
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
                System.out.print("  ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print(x);
            }
            System.out.println();
        }
    }

    public static void printEmptySquare(String x, int size) {
        for (int i = 0; i < size; i++) {
            if (i == 0 || i==size-1) {
                for (int j = 0; j < size; j++) {
                    System.out.print(x);
                }
            } else {
                for (int j = 0; j < size; j++) {
                    if (j > 0 && j < size - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print(x);
                    }
                }
            }
            System.out.println();
        }
    }
}





