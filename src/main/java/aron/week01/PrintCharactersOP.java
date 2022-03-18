package aron.week01;

public class PrintCharactersOP {


    public static void main(String[] args) {
        //printChars("x ", 10);
        System.out.println();
        //printSquare("B ", 5);
        System.out.println();
        //printRect("C ", 5, 2);
        System.out.println();
        printTriangleBottomLeft("D ", 4);
        System.out.println();
        //printTriangleTopLeft("E ", 5);
        System.out.println();
        //printTriangleTopRight("F ", 5);
        System.out.println();
        //printTriangleBottomRight("G", 5);
        System.out.println();
        //printEmptySquare("H", 10);
        System.out.println();
        //printEmptySquare3("A", 3);
        System.out.println();
    }

    public static void printChars(String name, int amount) {

        //Wird eine Zeile erstellt
        for (int i = 1; i <= amount; ++i) {
            System.out.print(name);
        }
        System.out.println();
    }

    public static void printSquare(String name, int amount) {

        //Wir ein Rechteck erstellt
        //Das ist die Schleife fuer die Zeile
        for (int row = 0; row < amount; row++) {
            //Das ist die Schleife fuer die Spalte
            for (int col = 0; col < amount; col++) {
                System.out.print(name);
            }
            System.out.println();
        }
    }

    public static void printRect(String name, int amount, int line) {

        //Wir ein Rechteck erstellt
        //Das ist die Schleife fuer die Zeile
        for (int row = 0; row < line; row++) {
            //Das ist die Schleife fuer die Spalte
            for (int j = 0; j < amount; j++) {
                System.out.print(name);
            }
            System.out.println();
        }
    }

    public static void printTriangleBottomLeft(String name, int amount) {



}}


