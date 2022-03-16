package murat.Week1;

public class MethodsAndLoops {

    // Task 1 - Print Chars
    public static void printChars(String text, int size) {

        System.out.println("Task 1 - Print Chars: ");
        for (int i = 0; i < size; i++) {
            System.out.print(text);
        }
    }

    // Task 2 - Print Square
    public static void printSquare(String text, int size) {

        System.out.println("Task 2 - Print Square: ");
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                System.out.print(text);
            }
            System.out.println();
        }
    }

    // Task 3 - Print Rectangle
    public static void printRect(String text, int horizontalSize, int verticalSize) {

        System.out.println("Task 3 - Print Rectangle: ");
        for (int i = 0; i < verticalSize; ++i) {
            for (int j = 0; j < horizontalSize; ++j) {
                System.out.print(text);
            }
            System.out.println();
        }
    }

    // Task 4 - Print Triangle Bottom Left
    public static void printTriangleBottomLeft(String text, int size) {

        System.out.println("Task 4 - Print Triangle Bottom Left: ");
        for (int i = 0; i < size; ++i) {

            for (int j = size - i; j <= size; ++j) {
                System.out.print(text);
            }
            System.out.println();
        }
    }

    // Task 5 - Print Triangle Top Left
    public static void printTriangleTopLeft(String text, int size) {

        System.out.println("Task 5 - Print Triangle Top Left: ");
        for (int i = 0; i < size; ++i) {

            for (int j = i; j < size; ++j) {
                System.out.print(text);
            }
            System.out.println();
        }
    }

    // Task 6 - Print Triangle Top Right
    public static void printTriangleTopRight(String text, int size) {

        System.out.println("Task 6 - Print Triangle Top Right: ");
        for (int i = 0; i < size; ++i) {

            for (int j = 0; j < size - i; ++j) {
                System.out.print(text);
            }

            for (int k = i; k < size; ++k) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // Task 7 - Print Triangle Bottom Right
    public static void printTriangleTBottomRight(String text, int size) {

        System.out.println("Task 7 - Print Triangle Bottom Right: ");
        for (int i = 0; i < size; ++i) {

            for (int j = 0; j < size - i; ++j) {
                System.out.print(" ");
            }

            for (int k = 0; k < i+1; ++k) {
                System.out.print(text);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // printChars("M ", 5);
        // printSquare("S ", 4);
        // printRect("R ",10,3);
        // printTriangleBottomLeft("M ", 4);
        // printTriangleTopLeft("M ", 5);
        // printTriangleTopRight("M", 5);   // Funktioniert nicht, ich muss nochmal bearbeiten
        // printTriangleTBottomRight("M", 5);
    }

}

