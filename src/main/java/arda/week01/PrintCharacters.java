package arda.week01;

public class PrintCharacters {
    public static void main(String[] args) {
        printChars("x", 10);
    }

    public static void printChars(String c, int size){
        for(int i = 0; i < size; ++i){
            System.out.print(c);
        }
    }
}
