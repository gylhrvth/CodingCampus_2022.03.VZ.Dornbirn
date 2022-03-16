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

            for (int j = 0; j < size; ++j) {
                if (j < i) {
                    System.out.print(" ");  // Obere rechte Zelle
                } else {
                    System.out.print("K");  // Untere linke Zelle
                }
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

            for (int k = 0; k < i + 1; ++k) {
                System.out.print(text);
            }
            System.out.println();
        }
    }

    // Task 8 - Print Empty Square
    public static void printEmptySquare(String text, int size) {

        System.out.println("Task 8 - Print Empty Square: ");
        for (int i = 0; i < size; ++i) {

            // Die erste vertikale Linie
            for (int j = 0; j < 1; ++j) {
                System.out.print(text);
            }

            // Die mittlere vertikale Linien
            for (int k = 1; k < size - 1; ++k) {

                if (i == 0 || i == size - 1) {
                    System.out.print(text);   // Obere und untere mittlere Zellen"
                } else {
                    System.out.print(" ");   // Mittlere Zellen
                }
            }

            // Die letzte vertikale linie
            for (int x = 0; x < 1; ++x) {
                System.out.print(text);
            }
            System.out.println();
        }
    }

    // Task 9 - Print Slash
    public static void printSlash(String text, int size, boolean switcher) {

        // Switch is a key to change the tasks
        // True: Left diagonal False: Right diagonal
        if (switcher) {
            for (int i = 0; i < size; ++i) {            // Left diagonal block

                for (int j = 0; j < size; ++j) {

                    if (i == j) {                       // left diagonal
                        System.out.print(text);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else {                                        // Right diagonal block
            for (int i = 0; i < size; ++i) {

                for (int j = 0; j < size - i; ++j) {

                    if (i + j == size - 1) {           // i + j is always the same with the size
                        System.out.print(text);
                    } else {
                        System.out.print(" ");         // Emptying upper left side
                    }
                }

                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        // printChars("M ", 5);                      // Task 1 - Print Chars
        // printSquare("S ", 4);                     // Task 2 - Print Square
        // printRect("R ",10,3);                     // Task 3 - Print Rectangle
        // printTriangleBottomLeft("M ", 4);         // Task 4 - Print Triangle Bottom Left
        // printTriangleTopLeft("M ", 5);            // Task 5 - Print Triangle Top Left
        // printTriangleTopRight("M", 6);            // Task 6 - Print Triangle Top Right
        // printTriangleTBottomRight("M", 5);        // Task 7 - Print Triangle Bottom Right
        // printEmptySquare("M", 5);                 // Task 8 - Print Empty Square
        // printSlash("M", 5, false);   // Task 9 - Print Slash
    }
}

