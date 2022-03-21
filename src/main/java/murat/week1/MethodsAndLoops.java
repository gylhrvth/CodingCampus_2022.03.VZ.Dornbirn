package murat.week1;

public class MethodsAndLoops {

    // Task 1 - Print Chars
    public static void printChars(String text, int size) {

        System.out.println("Task 1 - Print Chars: ");
        for (int i = 0; i < size; i++) {
            System.out.print(text);
        }
        System.out.println();
        System.out.println();
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
        System.out.println();
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
        System.out.println();
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
        System.out.println();
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
        System.out.println();
    }

    // Task 6 - Print Triangle Top Right
    public static void printTriangleTopRight(String text, int size) {

        System.out.println("Task 6 - Print Triangle Top Right: ");
        for (int i = 0; i < size; ++i) {

            for (int j = 0; j < size; ++j) {
                if (j < i) {
                    System.out.print(" ");  // TOp Right
                } else {
                    System.out.print("K");  // Bottom left
                }
            }
            System.out.println();
        }
        System.out.println();
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
        System.out.println();
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
        System.out.println();
    }

    // Task 9 - Print Slash
    public static void printSlash(String text, int size, boolean switcher) {

        // Switch is a key to change the tasks
        // True: Left diagonal False: Right diagonal
        System.out.println("Task 9 - Print Slash: ");
        if (switcher) {
            for (int i = 0; i < size; ++i) {            // Left diagonal block

                for (int j = 0; j < size; ++j) {

                    if (i == j) {                       // Left diagonal
                        System.out.print(text);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else {                                        // Right diagonal block
            for (int i = 0; i < size; ++i) {

                for (int j = 0; j < size; ++j) {

                    if (i + j == size - 1) {           // i + j is always the same with the size
                        System.out.print(text);
                    } else {
                        System.out.print(" ");         // Leaving empty spaces
                    }
                }
                System.out.println();
            }
        }
        System.out.println();
    }

    // Task 10 - Print Triangle
    public static void printTriangle(String text, int size) {

        System.out.println("Task 10 - Print Triangle: ");

        // Formating the size for the base number For Example:The size is 3, but the base is 5
        int newSize = (size * 2) - 1;

        // Creating a full rectangle with the new base
        for (int i = 0; i < newSize; ++i) {
            for (int j = 0; j < newSize; ++j) {

                // (Slash bottom right && slash top left) or (Backslash bottom left && backslash top right) or (Base line)
                if ((((i == j) && !(i + j < newSize)) || ((i + j == newSize - 1) && (i >= j))) || i == newSize - 1) {
                    System.out.print(text);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    // Task 11 - Print Rhombus
    public static void printRhombus(String text, int size) {

        System.out.println("Task 11 - Print Rhombus: ");

        // Creating a full rectangle with the new base
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {

                // Bottom left or top right or top left or bottom right
                // Example: Size= 9   Bottom Left: i-j = 4   Top Right: j-i = 4  Top Left: i+j=4  Bottom Right: i+j = 1
                if ((i - j == ((size - 1) / 2)) || (j - i == ((size - 1) / 2)) || ((i + j) == ((size - 1) / 2)) || ((i + j) == ((size - 1) + ((size - 1) / 2)))) {
                    System.out.print(text);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    // Task 12 - Print X
    public static void printX(String text, int size) {

        System.out.println("Task 12 - Print X: ");

        // Creating a full rectangle with the new base
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {

                // Creating respectively slash and backslash
                if ((i == j) || (i + j == size - 1)) {
                    System.out.print(text);        // Full cells
                } else {
                    System.out.print(" ");         // Empty cells
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    // Task 13 - Print Christmas Tree
    public static void printChristmasTree(int size) {

        System.out.println("Task 13 - Print Christmas Tree: ");

        // Formating the size for the base number For Example:The size is 3, but the base is 5
        int newSize = (size * 2) - 1;
        int peakOFTree = (newSize - 1) / 2;

        // Beginning from the peak point of the tree we generate it to the bottom.
        for (int i = peakOFTree; i < newSize; ++i) {
            for (int j = 0; j <= i; ++j) {
                if (((i + j) <= (peakOFTree * 2 - 1))) {
                    System.out.print(" ");             // Shoving the tree to the right, otherwise we have a triangle leaning to the left.
                } else {
                    System.out.print("*");             // Tree leaves
                }
            }
            System.out.println();
        }

        // Bottom - Null
        for (int z = 0; z < newSize; ++z) {
            System.out.print("O");
        }
        System.out.println();

        // Bottom - Plus
        for (int x = 0; x < 2; ++x) {
            for (int y = 0; y < newSize; ++y) {
                if (y < peakOFTree - 2 || y > newSize - peakOFTree + 1) {
                    System.out.print(" ");     // Blank cells
                } else {
                    System.out.print("+");     // Plus cells
                }
            }
            System.out.println();
        }
    }

    // Task 14 - Print Circle with Pythagoras
    public static void printCirclePythagoras(int size) {
        /* I divided the circle into 2 semicircles as upper and lower part.
        Then I created the full cells.
        Pushing the empty cells to the right gives us a semicircle */

        System.out.println("Task 14 - Print Circle with Pythagoras");
        int newSize = size * 2;    // Size is radius. An upper part requires 2*size in with or so called X Axis
        int xAxis;          // Width
        double yAxis;       // Height

        // Upper semicircle
        for (int i = newSize / 2; i >= 1; i--) {
            yAxis = i;           // Top to the bottom, lowered by 1

            // if X axis decreases, X axis should be more in accordance with Pythagoras
            xAxis = (int) Math.round(Math.sqrt(size * size - yAxis * yAxis));            // Rounding the X Axis (Width) to the nearest number.

            // Empty cells push the full cells to the right
            if (i != size) {         // To erase the empty upper line
                for (int k = 0; k < size - xAxis; ++k) {
                    System.out.print(".");
                }
            }

            // Full cells
            for (int j = 1; j <= xAxis * 2; ++j) {
                System.out.print("A");
            }
            System.out.println();
        }

        // Lower semicircle
        for (int i = 1; i <= newSize / 2; i++) {
            yAxis = i;           // Top to the bottom, increased by 1

            // if X axis increases, Y axis should be less in accordance with Pythagoras
            xAxis = (int) Math.round(Math.sqrt(size * size - yAxis * yAxis));    // Rounding the X Axis (Width) to the nearest number.

            // Empty cells push the full cells to the right
            if (i != size) {      // To erase the empty bottom line
                for (int k = 0; k < (size - xAxis); ++k) {
                    System.out.print(",");
                }
            }

            // Full cells
            for (int j = 1; j <= xAxis * 2; ++j) {
                System.out.print("B");
            }
            System.out.println();
        }
    }

    // Task 15 - Print Circle with Sinus and Cosinus
    public static void printCircleSinCos(int size){

        double dene = Math.sin(0);

        System.out.println(dene);

    }

    public static void main(String[] args) {
        // printChars("M", 5);                          // Task 1 - Print Chars
        // printSquare("M", 4);                         // Task 2 - Print Square
        // printRect("M",10,3);                         // Task 3 - Print Rectangle
        // printTriangleBottomLeft("M", 4);             // Task 4 - Print Triangle Bottom Left
        // printTriangleTopLeft("M", 5);                // Task 5 - Print Triangle Top Left
        // printTriangleTopRight("M", 6);                // Task 6 - Print Triangle Top Right
        // printTriangleTBottomRight("M", 5);            // Task 7 - Print Triangle Bottom Right
        // printEmptySquare("M", 5);                     // Task 8 - Print Empty Square
        // printSlash("M", 3, false);                    // Task 9 - Print Slash
        // printTriangle("M", 7);                        // Task 10 - Print Triangle
        // printRhombus("M", 101);                       // Task 11 - Print Rhombus
        // printX("M", 10);                               // Task 12 - Print X
        // printChristmasTree(15);                       // Task 13 - Print Christmas Tree
        // printCirclePythagoras(10);                    // Task 14 - Print Circle with Pythagoras
        printCircleSinCos(5);
    }
}

