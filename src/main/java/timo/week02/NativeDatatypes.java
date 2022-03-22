package timo.week02;

public class NativeDatatypes {

    public static void main(String[] args) {

        //floatCounter(100);
        //divide();
        //piLeibniz(100);
        //piNilakantha(100);
        //secretRow(1.0);
        guessingGame(2);

    }


    public static void floatCounter(float value) {

        for (float i = 0.0f; i <= value; i = i + 0.1f) {
            System.out.println(i);
        }
    }

    public static void divide() {

        System.out.println("4");
        System.out.println(4f / 3f);
        System.out.println(4f / 5f);
        System.out.println(4f / 7f);
    }


    public static void piLeibniz(int precision) {

        double myPi = 0.0;
        int denominator = 1;

        for (int i = 0; i < precision; i++) {
            if (i % 2 == 0) {
                myPi = myPi + (4.0 / denominator);
            } else {
                myPi = myPi - (4.0 / denominator);
            }
            denominator = denominator + 2;

        }
        System.out.println(myPi);
    }


    public static void piNilakantha(int precision) {

        double myPi = 3.0;
        int denominatorA = 2;
        int denominatorB = 3;
        int denominatorC = 4;

        for (int i = 0; i < precision; i++) {
            if (i % 2 == 0) {
                myPi = myPi + (4.0 / (denominatorA * denominatorB * denominatorC));
            } else {
                myPi = myPi - (4.0 / (denominatorA * denominatorB * denominatorC));
            }

            denominatorA = denominatorA + 2;
            denominatorB = denominatorB + 2;
            denominatorC = denominatorC + 2;

        }
        System.out.println(myPi);
    }


    public static void secretRow(double value) {

        for (int i = 0; i < 100; i++) {

            value = value / 2 + 1 / value;
            {
                System.out.println(value);
            }
        }

    }

    public static void guessingGame(double root) {

        double max = root;
        double min = 1.0;
        double x = 0.0;

        while (x * x != root) {

            x = min + ((max - min) / 2);

            if (x * x > root) {
                max = x;
            } else {
                min = x;
            }
            System.out.println(x);
        }

    }
}