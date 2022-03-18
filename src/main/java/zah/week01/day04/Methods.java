package zah.week01.day04;

public class Methods {


    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            printGreetings(i % 2 == 0);

        }
        System.out.println("----------------------");
        printChars("x ", 10);
        System.out.println("----------------------");
        printSquare("A ", 5);
        System.out.println("-----------------");
        printRectangle("x", 10, 3);
        System.out.println("----------------------------");
        printTriangleTopRight("x", 5);
        System.out.println("--------------------------");
        printTriangle("x", 3);
        System.out.println("----------------------");
        printTrianglefNew("x", 2);
        System.out.println("------------------------------");
        printRombus("x",5);

    }

    public static void printGreetings(boolean printGoodDay) {
        if (printGoodDay) {
            System.out.println("GutenTag!");
        } else {
            System.out.println("GuteNacht!");
        }
    }

    public static void printChars(String text, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(text);
        }
        System.out.println();
    }

    public static void printSquare(String text, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(text);
            }
            System.out.println();
        }
    }

    public static void printRectangle(String text, int sizeX, int sizeY) {
        for (int i = 0; i < sizeY; i++) {
            for (int j = 0; j < sizeX; j++) {
                System.out.print(text);
            }
            System.out.println();
        }
    }

    public static void printTriangleTopRight(String text, int size) {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print(text);
            }
            System.out.println();
        }
    }

    public static void printTriangle(String text, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size * 2 - 1; j++) {
                if ((j == size - i - 1) ||  // Left side
                        (j == size + i - 1) ||   // Right side
                        (i == size - 1)) {       // Bottom line
                    System.out.print(text);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }

    public static void printTrianglefNew(String text, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size * 2 - 1; j++) {
                if (i+j < size-1){
                    System.out.print(" .");
                } else if (j -i > size - 1){
                    System.out.print(" .");
                }
                else {
                    System.out.print(" X");
                }
            }
            System.out.println();
        }


    }
    public static void printRombus(String text, int size) {
        for (int i = 0; i < size*2 +1 ; i++) {
            for (int j = 0; j < size * 2 - 1; j++) {

                System.out.println();

            }
            System.out.print(text);

        }
    }
}








