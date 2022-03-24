package lukas.week1.day4;

import lukas.week1.day3.PrintEmptySquare;

public class Rhombus {
    public static void main(String[] args) {
        //printRhombus("x", 111);
        printRhombus2("x", 5);
    }

    public static void printRhombus(String letter, int height) {
        int upperHalf = height / 2;
        int lowerHalf = height - upperHalf;
        for (int i = 0; i < upperHalf; i++) {
            PrintEmptySquare.printChars(" ", upperHalf - i);
            if (i > 0) {
                System.out.print(letter);
                PrintEmptySquare.printChars(" ", i * 2 - 1);
            }
            System.out.println(letter);
        }
        for (int i = lowerHalf; i > 0; i--) {
            PrintEmptySquare.printChars(" ", lowerHalf - i);
            if (i > 1) {
                System.out.print(letter);
                PrintEmptySquare.printChars(" ", i * 2 - 3);
            }
            System.out.println(letter);
        }
    }

    private static void printRhombus2(String letter, int height) {
        int upperhalf = height/2;
        int lowerhalf = height - upperhalf;
        Pyramid.printPyramid(letter, upperhalf);
        System.out.println();
        Pyramid.printPyramid(letter, lowerhalf);
    }
}
