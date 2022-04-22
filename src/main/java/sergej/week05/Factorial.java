package sergej.week05;

public class Factorial {

    public static long factorial(int number) {
        if (number == 1) {
            return 1;
        }
        return (number * factorial(number - 1));
    }

    public static void main(String[] args) {

        for (int i = 1; i < 25; i++) {
            long fac = factorial(i);
            System.out.println(fac);

        }


    }
}
