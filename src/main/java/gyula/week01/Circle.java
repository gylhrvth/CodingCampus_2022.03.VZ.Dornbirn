package gyula.week01;

public class Circle {
    public static void printCircle(String text, int size){
        for (int a=0; a<=size; ++a){
            int sizeX = (int)Math.round(2.6 * Math.sqrt(a * (size -a)));
            for (int i = 0; i < sizeX; i++) {
                System.out.print(text);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printCircle("A", 100);
    }
}
