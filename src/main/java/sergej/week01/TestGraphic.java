package sergej.week01;

public class TestGraphic {
    public static void printChars(String text, int size) {
        for (int i = 0; i < size; ++i) {
            System.out.print(text);
        }
    }

    public static void printSquare(String text, int size){
        for (int i = 0; i < size; ++i){

            for (int j =1; j <= size-1; ++j){
                System.out.print(text);
            }
            System.out.println();
        }
    }

    public static void printRect(String text, int row, int col){
        for (int i = 0; i < row; ++i){
            for (int j = 0; j < col; ++j){
                System.out.print(text);
            }
            System.out.println();

        }
    }

    public static void printTriangleBottomLeft(String text,int size){
        for (int i = 0; i < size; ++i){
            for (int j = 0; j <= i; ++j){
                System.out.print(text);
            }
            System.out.println();
        }
    }

    public static void printTriangleTopLeft(String text,int size){
        for (int i = 0; i < size; ++i){
            for (int j = 0; j < size - i; ++j){
                System.out.print(text);
            }
            System.out.println();
        }
    }



        public static void main (String[]args){
           // printChars("x",10);
           // printSquare("x", 10);
            //printRect("x",3,10);
           //printTriangleBottomLeft("x",5);
           printTriangleTopLeft("x",5);
        }
    }
