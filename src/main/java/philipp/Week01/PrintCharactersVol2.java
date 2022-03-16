package philipp.Week01;

public class PrintCharactersVol2 {
    public static void main(String[] args) {
        printTriangle("X ", 3);
        System.out.println();
    }

    public static void printChars(String name, int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print(name);
        }
        System.out.println();
    }

    public static void printTriangle(String x, int size) {
        for (int i = 1; i < size; i++) {
            for (int j = 0; j < size * 2 - 1; j++) {
                if (i == size * 2 - 1) {
                    System.out.print(x);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        printChars(x, size * 2 - 1);
    }
}
