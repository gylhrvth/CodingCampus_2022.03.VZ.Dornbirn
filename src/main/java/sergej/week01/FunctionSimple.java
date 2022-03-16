package sergej.week01;

public class FunctionSimple {
    public static void simple1(int start, int end){
        int i = 0;
        while (start < end){
            System.out.println(i);
            ++i;

        }

    }



    public static void main(String[] args) {
        simple1(10,50);
    }
}

