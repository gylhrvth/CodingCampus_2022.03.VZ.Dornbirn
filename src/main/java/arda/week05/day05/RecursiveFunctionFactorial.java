package arda.week05.day05;

public class RecursiveFunctionFactorial {
    public static void main(String[] args) {
        for (int n = 1; n <= 20; n++) {
            System.out.println(n + "! = " + factorial(n));
        }
    }
    public static long factorial(int n){
        if (n <= 1){
            return 1;
        }
        return n * factorial(n - 1);
    }
}
