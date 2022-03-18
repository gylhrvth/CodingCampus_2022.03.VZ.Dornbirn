package philipp.Week01;

public class PrintCharactersVol2 {
    public static void main(String[] args) {
        //printEmptySquare2("X ", 6);
        //System.out.println();
        //printTriangle("X ", 3);
        //System.out.println();
        //printTriangle("X ", 5);
        //System.out.println();
        //printTriangle2("X ", 3);
        //System.out.println();
        //printTriangle2("X ", 5);
        //System.out.println();
        //printTriangle2("X ", 7);
        //System.out.println();
        //printTriangle2("X ", 9);
        //System.out.println();
        //printTriangle3("X ", 5);
        //System.out.println();
        //printTriangle4("X ", 5);
        //printX("X", 5);
        //System.out.println();
        //printX("X ", 3);
        //System.out.println();
        //printX("X  ", 5);
        printX("Gabriel", 15);
        System.out.println();
        printX("Romeu", 15);
        System.out.println();
        printRhombus("X ", 7);
        System.out.println();
        printRhombus2("X ", 7);
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

    public static void printEmptySquare2(String x, int size) {
        printChars(x, size);
        for (int j = 0; j < size - 2; j++) {
            System.out.print(x);
            for (int k = 0; k < size - 2; k++) {
                System.out.print("  ");
            }
            System.out.println(x);
        }
        printChars(x, size);
    }

    public static void printTriangle(String x, int size) {
        for (int i = 0; i < size - 1; i++) {
            System.out.print("  ");
            for (int j = 0; j < size * 2 - 3; j++) {
                if (i % 2 == 0) {
                    if (j % 2 != 0) {
                        System.out.print(x);
                    } else {
                        System.out.print("  ");
                    }
                } else {
                    if (j % 2 != 0) {
                        System.out.print("  ");
                    } else {
                        System.out.print(x);
                    }
                }
            }
            System.out.println("  ");
        }
        printChars(x, size * 2 - 1);
    }

    public static void printTriangle2(String x, int size) {
        for (int i = 0; i < size - 1; i++) {
            System.out.print("  ");
            for (int j = 0; j < size * 2 - 3; j++) {
                if (j == size - 2 + i || j == size - 2 - i) {
                    System.out.print(x);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("  ");
        }
        printChars(x, size * 2 - 1);
    }

    public static void printTriangle3(String x, int size) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size * 2 - 2; j++) {
                if (j == size - 1 + i || j == size - 1 - i) {
                    System.out.print(x);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        printChars(x, size * 2 - 1);
    }

    public static void printTriangle4(String x, int size) {
        for (int i = 0; i < size - 1; i++) {
            printCharsNoNewLine("  ", size - 1 - i);
            if (i > 0) {
                System.out.print(x);
                printCharsNoNewLine("  ", i * 2 - 1);
            }
            System.out.println(x);
        }
        printChars(x, size * 2 - 1);
    }

    public static void printX(String x, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i - j == 0 || size - 1 == i + j)
                    System.out.print(x);
                else {
                    printCharsNoNewLine(" ", x.length());
                }
            }
            System.out.println();
        }
    }

    public static void printRhombus(String x, int size) {
        for (int i = 0; i < (size + 1) / 2; i++) {
            for (int j = 0; j < size; j++) {
                if (j == (size - 1) / 2 + i || j == (size - 1) / 2 - i) {
                    System.out.print(x);
                } else {
                    printCharsNoNewLine(" ", x.length());
                }
            }
            System.out.println();
        }
        for (int i = 0; i < (size - 1) / 2; i++) {
            for (int j = 0; j < size; j++) {
                if (j == 1 + i || j == (size - 2) - i) {
                    System.out.print(x);
                } else {
                    printCharsNoNewLine(" ", x.length());
                }
            }
            System.out.println();
        }
    }

    public static void printRhombus2(String x, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i < (size + 1) / 2) {
                    if (j == (size - 1) / 2 + i || j == (size - 1) / 2 - i) {
                        System.out.print(x);
                    } else {
                        printCharsNoNewLine(" ", x.length());
                    }
                } else {
                    if (i == (size - 1) / 2 + j || j == size +((size-2)/2)-i) {
                        System.out.print(x);
                    } else {
                        printCharsNoNewLine(" ", x.length());
                    }
                }
            }
            System.out.println();
        }
    }


/*
    public static void printXY(String x, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i - j == 0 || size - 1 == i + j)
                    System.out.print(x);
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

 */
}

