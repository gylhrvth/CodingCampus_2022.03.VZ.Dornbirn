package philipp.Week01;

public class ChristmasTree {
    public static void main(String[] args) {
        Tree(15);
        System.out.println();
        Stump(10);
        System.out.println();
    }

    public static void printChars(String name, int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print(name);
        }
        System.out.println();
    }

    public static void printCharsNoNewLine(String name, int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print(name);
        }
    }

    public static void Tree(int amount) {
        for (int i = 0; i < amount; i++) {
            printCharsNoNewLine(" ", (amount-1 - i));
            if (i > 0) {
                System.out.print("*");
                printCharsNoNewLine("*", i * 2 - 1);
            }
            System.out.println("*");
        }
        printChars("O ", amount);
        for (int j = 0; j < amount / 4; j++) {
            int s = (amount / 4 * 2) + 1;
            printCharsNoNewLine(" ", (amount - 1 - s / 2));
            printCharsNoNewLine("+", s);
            System.out.println();
        }
    }

    public static void Stump(int amount) {
        for (int j = 0; j < amount / 4; j++) {
            int s = (amount / 4 * 2) + 1;
            printCharsNoNewLine(" ", (amount - 1 - s / 2));
            printCharsNoNewLine("+", s);
            System.out.println();
        }

    }
}
