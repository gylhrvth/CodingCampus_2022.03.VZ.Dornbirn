package lukas.week2.day4;

public class IfElse {
    public static void main(String[] args) {
        int rounds = 500000000;

        //Big difference (first operator)
        compare(rounds, "+");
        //Smaller difference (second operator)
        compare(rounds, "*");
        //Smaller difference (third operator)
        compare(rounds, "-");
        //Same timeamount (fourth operator)
        compare(rounds, "/");
    }

    private static void compare(int rounds, String symbol) {
        System.out.println("---Testing operator: " + symbol+"---");
        long start = System.currentTimeMillis();
        int sum = 0;
        for (int i = 0; i < rounds; i++) {
            sum += withoutElseIf(symbol);
        }
        System.out.println("Without else if took: " + (System.currentTimeMillis() - start) + " ms.");

        sum = 0;
        start = System.currentTimeMillis();
        for (int i = 0; i < rounds; i++) {
            sum += withElseIf(symbol);
        }
        System.out.println("With else if took: " + (System.currentTimeMillis() - start) + " ms. ");
        System.out.println();
    }

    private static int withoutElseIf(String symbol) {
        int a = 0;
        if (symbol.equals("+")) {
            a++;
        }
        if (symbol.equals("*")) {
            a++;
        }
        if (symbol.equals("-")) {
            a++;
        }
        if (symbol.equals("/")) {
            a++;
        }
        return a;
    }

    private static int withElseIf(String symbol) {
        int a = 0;
        if (symbol.equals("+")) {
            a++;
        } else if (symbol.equals("*")) {
            a++;
        } else if (symbol.equals("-")) {
            a++;
        } else if (symbol.equals("/")) {
            a++;
        }
        return a;
    }
}
