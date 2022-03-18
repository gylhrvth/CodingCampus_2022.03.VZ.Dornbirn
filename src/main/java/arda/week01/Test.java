package arda.week01;

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {
        printcharsTriangle("x", 5);
    }
    public static void printcharsTriangle(String c, int size){
        for (int i = 0; i < size; ++i) {
            for (int l = 0; l < size; l++){
                System.out.print(" a");
            }
            System.out.println(" A");
        }
    }
}
