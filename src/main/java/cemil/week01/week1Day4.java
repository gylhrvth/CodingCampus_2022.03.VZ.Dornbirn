package cemil.week01;

public class week1Day4 {
    public static void printChars(String letter, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(letter);

        }
    }

    public static void printTriangle(String text, int size) {

//        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < size / 2; j++) {
//                System.out.print(" ");
//            }
//        }
//        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < size - 2 - i; j++) {
//                System.out.print(text);
//            }
//        }
//        System.out.println();
//        for (int i = 0; i < size + 2; i++) {
//            System.out.print(text);
//        }
//        System.out.println();
//        for (int i = 0; i < size + 2; i++) {
//            System.out.print(text);
//        }
//        System.out.println();
//    }
        System.out.println();

        for (int i = 0; i < size - 1; i++) {
            printChars(" ", size - 1 - i);

//            for (int j = 0; j < size - 1 - i; j++) {
//                System.out.print(".");
//            }

//            printChars(text, i == 0 ? 0 : 1);
//            printChars(".", i == 0 ? 0 : i * 2 - 1);
//            printChars(text, 1);
            System.out.print(text);
            if (i > 0) {
                printChars(" ", i * 2 - 1);
                System.out.print(text);
            }


//            for (int j = 0; j < i + 1; j++) {
//                System.out.print(text);
//            }


            System.out.println();
        }
        printChars(text, size * 2 - 1);
        System.out.println();
    }


    public static void printRhombus(String text, int size) {
        System.out.println();

        for (int i = 0; i < size - 3; i++) {
            printChars(".", size - 4 - i);
            System.out.print(text);
            if (i > 0) {
                printChars(".", i * 2 - 1);
                System.out.print(text);
            }
            System.out.println();
        }
        for (int i = 0; i < size - 1; i++) {
            System.out.print(text);

        }

        System.out.println();

    }

    public static void main(String[] args) {
        printTriangle("A", 7);
        printRhombus("X", 7);
    }

}
