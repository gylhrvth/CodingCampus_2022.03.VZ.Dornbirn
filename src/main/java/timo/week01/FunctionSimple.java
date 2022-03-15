package timo.week01;

public class FunctionSimple {

    public static void main(String[] args) {
        simple1(10, 15);
    }
    public static void simple1(int start, int end) {
        int delta = 1;
        if (start > end) {
            delta = -1;
        }

        for (int i = start; i != end ; i += delta) {
            System.out.println(i);
        }
        System.out.println(end);
    }
}
