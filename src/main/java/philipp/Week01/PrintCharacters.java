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
        printTriangleTopRight("F", 5);
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
                    System.out.print(" ");
                } else {
                    System.out.print(name);
                }
            }
            System.out.println();

        }
    }
}



