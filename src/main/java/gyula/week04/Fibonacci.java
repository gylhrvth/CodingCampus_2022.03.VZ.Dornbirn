package gyula.week04;

public class Fibonacci {
    public static void main(String[] args) {
        for (int i = 0; i < 12; i++) {
            System.out.println(i + " " + fibonacci(i));
        }
    }


    public static int fibonacci(int index){
        if (index <= 2) return 1;
        return fibonacci(index - 1) + fibonacci(index - 2);
    }
}
