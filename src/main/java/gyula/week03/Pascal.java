package gyula.week03;

public class Pascal {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            potenzen(i);
        }
    }

    public static long coeff(long up, long down){
        int result = 1;
        for (int i = 1; i <= up; i++) {
            result *= i;
        }
        for (int i = 1; i <= down; i++) {
            result /= i;
        }
        for (int i = 1; i <= (up-down); i++) {
            result /= i;
        }
        return result;
    }

    public static void potenzen(int potenz){
        System.out.print("(a + b)^" + potenz + " = ");
        for (int i = 0; i <= potenz; i++) {
            long coefficient = coeff(potenz, i);
            if (coefficient > 1) {
                System.out.print(coefficient);
            }
            if (potenz-i > 1) {
                System.out.print("a^" + (potenz - i));
            } else if (potenz-i == 1 ) {
                System.out.print("a");
            }
            if (i > 1) {
                System.out.print("b^" + i);
            } else if (i == 1 ) {
                System.out.print("b");
            }
            if (i != potenz) {
                System.out.print(" + ");
            }
        }
        System.out.println();
    }
}
