package arda.week01;

public class PrintCharacters {
    public static void main(String[] args) {
        //printChars("x", 10);
        //printSquare("x ",5);
        //printRectangle("x ",10,3);
        //printTriangle("x ", 4);
        printTriangleTopLeft("x ", 5);
    }

    public static void printChars(String c, int size){
        for(int i = 0; i < size; ++i){
            System.out.print(c);
        }
    }

    public static void printSquare(String c, int size){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
    public static void printRectangle(String c, int size1, int size2){
        for(int i = 0; i < size2; i++){
            for(int j = 0; j < size1; j++){
                System.out.print(c);
            }
            System.out.println(c);
        }
    }
    public static void printTriangle(String c, int size){
        for(int i = 0; i < size; i++){ // Zuständig für die Anzahl Zeilen
            for(int j = 0; j <= i; j++){ // Buchstaben innerhalb einer Zeile
                System.out.print(c);
            }
            System.out.println();
        }
    }
    public static void printTriangleTopLeft(String c, int size){
        for(int i = 0; i < size; i++){ // Zuständig für die Anzahl Zeilen
            for(int j = 0; j < size-i; j++){ // Buchstaben innerhalb einer Zeile
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
