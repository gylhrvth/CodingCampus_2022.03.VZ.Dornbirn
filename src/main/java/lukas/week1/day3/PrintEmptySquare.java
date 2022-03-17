package lukas.week1.day3;

public class PrintEmptySquare {
    public static void main(String[] args) {
        printEmptySquare("x", 10);
    }

    public static void printChars(String letter, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(letter);
        }
    }

    public static void printEmptySquare(String letter, int size) {
        printChars(letter, size);
        System.out.println();
        for (int i = 0; i < size - 2; i++) {
            System.out.print(letter);
            printChars(" ", size - 2);
            System.out.println(letter);
        }
        printChars(letter, size);
        System.out.println();
    }

    public static void printEmptySquare2(String letter, int size) {
        for (int i = 0; i < size; i++) {
            if (i == 0 || i == size - 1) {
                printChars(letter, size);
                System.out.println();
            } else {
                System.out.print(letter);
                printChars(" ", size - 2);
                System.out.println(letter);
            }
        }
    }
}
