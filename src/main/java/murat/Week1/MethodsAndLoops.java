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

    public static void main(String[] args) {
        // printChars("b", 5);
        // printSquare("M", 4);
    }

}

