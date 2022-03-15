package gyula.week01;

public class Drawings {
    public static void printTriangleTopRight(String text, int size){
        for (int i = 0; i < size; i++) {
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


    public static void main(String[] args) {
        printTriangleTopRight("x ", 5);
    }
}
