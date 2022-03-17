package lukas.week1.day4;

import lukas.week1.day3.PrintEmptySquare;

public class Pyramid {
    public static void main(String[] args) {
        printPyramid("o", 10);
    }

    public static void printPyramid(String letter, int height) {
        int spaces = height - 1;
        for (int i = 0; i < height - 1; i++) {
            PrintEmptySquare.printChars(" ", spaces);
            System.out.print(letter);
            PrintEmptySquare.printChars(" ", i * 2 - 1);
            if (i > 0) {
                System.out.println(letter);
            } else {
                System.out.println();
            }
            spaces--;
        }
        PrintEmptySquare.printChars(letter, height * 2 - 1);
    }
}
