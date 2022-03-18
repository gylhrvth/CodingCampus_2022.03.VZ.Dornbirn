package sergej.week01;

public class ChristmasTree {


    public static void printChristmasTreeTop(int size) {

        for (int i = 0; i < size; i++) {
            for (int j = i; j < size - 1; j++) {

                System.out.print(" ");
            }
            if (i > 0) {
                System.out.print("*");
                for (int k = 0; k < i * 2 - 1; k++) {
                    System.out.print("*");
                }
            }
            System.out.println("*");
        }
    }

    public static void printChristmasTreeMid(int size) {

        for (int i = 0; i < size; i++) {
            System.out.print("O ");

        }
        System.out.println();
    }

    public static void printChristmasTreeStump(int size) {


        for (int i = 0; i < size / 4; ++i) {
            for (int j = 0; j < (size * 2 - 1 - size / 2) / 2; j++) {
                System.out.print(" ");
            }


            for (int k = 0; k <= size / 2; ++k) {
                System.out.print("+");
            }
            System.out.println();

        }
    }

    public static void printChristmasTreeFinal(int size) {
        printChristmasTreeTop(size);
        printChristmasTreeMid(size);
        printChristmasTreeStump(size);

    }

    public static void main(String[] args) {

        //printChristmasTreeTop(9);
        //printChristmasTreeMid(9);
        //printChristmasTreeStump(9);

        printChristmasTreeFinal(33);


    }
}
