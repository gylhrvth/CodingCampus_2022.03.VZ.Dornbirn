package cemil.week01;

import javax.swing.*;

public class DrawingChars {

    public static void printChars(String text, int size){
        for (int i = 0; i < size; i++) {
            System.out.print(text);
        }
        System.out.println();
    }
    public static void printSquare(String text, int size){
        for (int i = 0; i <size ; i++) {
            for (int b = 0; b < size; b++) {
                System.out.print(text);
            }
            System.out.println();


        }


    }

    public static void printRect(String text, int size1, int size2){
        for (int i = 0; i <size2 ; i++) {
            for (int j = 0; j <size1 ; j++) {
                System.out.print(text);
            }
            System.out.println();
        }
    }

    public static void printTriangleBottomLeft(String text, int size){
        for (int i = 0; i <size ; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(text);
            }
            System.out.println();

        }

    }

    public static void printTriangleTopLeft(String text, int size){
        for (int i = 0; i < size ; i++) {
            for (int j = 0; j < size-i; j++) {

                System.out.print(text);
            }
            System.out.println();

        }

    }
    public static void printTriangleTopRight(String text, int size){
        for (int i = 0; i < size ; i++) {
            for (int j = 0; j < size; j++) {
                if (j < i) {
                    System.out.print(". ");
                } else {
                        System.out.print(text);
                }
                 }
            System.out.println();

        }
    }

        public static void main (String[]args){
        printChars("A ", 10);
            System.out.println();
        printSquare("B ", 10);
            System.out.println();
        printRect( "C ", 10, 3);
            System.out.println();
        printTriangleBottomLeft("D ", 4);
            System.out.println();
        printTriangleTopLeft("E ", 4);
            System.out.println();
            printTriangleTopRight("F ", 5);


        }
    }





