package murat.Week1;

public class MethodsAndLoops {

    // Task 1 - Print Chars
    public static void printChars(String x, int counter) {

        System.out.println("Task 1 - Print Chars: ");
        for (int i = 0; i < counter; i++) {
            System.out.print(x);
        }
    }

    // Task 2 - Print Square
    public static void printSquare(String x, int counter) {

        System.out.println("Task 2 - Print Square: ");
        for (int i = 1; i <= counter; ++i) {
            for (int j = 1; j <= counter-1; ++j) {
                System.out.print(x);
            }
            System.out.println(x);
        }
    }

    // Task 3 - Print Rectangle
    public static void printRect(String x, int horizontal, int vertical) {

        System.out.println("Task 3 - Print Rectangle: ");
        for (int i = 1; i <= vertical; ++i) {
            for (int j = 1; j <= horizontal-1; ++j) {
                System.out.print(x);
            }
            System.out.println(x);
        }
    }

    // Task 4 - Print Triangle Bottom Left
    public static void printTriangleBottomLeft(String x, int counter) {

        System.out.println("Task 4 - Print Triangle Bottom Left: ");
        for (int i = 1; i <= counter; ++i) {

            for (int j = counter-i+1; j <= counter-1; ++j) {
                System.out.print(x);
            }
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        //  printChars("M", 5);
        //  printSquare("S", 4);
        //  printRect("R",10,3);
        printTriangleBottomLeft("M", 4);
    }

}

