package arda.week02.day01;

public class NativeDatatypes {
    public static void main(String[] args) {
        //task01();
        //task02();
        //task03(100000);
        //task04(100);
        //task05(10);
        task06(100);
    }

    public static void task01() {
        for (float i = 0.0f; i <= 10.0f; i += 0.1) {
            System.out.println(i);
        }

        for (int i = 0; i <= 100; i++) {
            System.out.println(i / 10.0);
        }
    }

    public static void task02() {
        System.out.println(4f);
        System.out.println(4f / 3);
        System.out.println(4f / 5);
        System.out.println(4f / 7);
    }

    public static void task03(int countofiteration) {
        double myPi = 0d;
        double denominator = 1; //denominator = Nenner

        for (int i = 0; i < countofiteration; i++) {
            if (i % 2 == 0) {
                myPi += (4 / denominator);
            } else {
                myPi -= (4 / denominator);
            }
            denominator += 2;
        }
        System.out.println(myPi);
    }

    public static void task04(int countofiteration) {
        double myPi = 3.0;
        int denominator = 2;

        for (int i = 0; i < countofiteration; i++) {
            if (i % 2 == 0) {
                myPi += 4.0 / (denominator * (denominator + 1) * (denominator + 2));
            } else {
                myPi -= 4.0 / (denominator * (denominator + 1) * (denominator + 2));
            }
            denominator += 2;
            System.out.println(myPi);
        }
        System.out.println(Math.PI);
    }

    public static void task05(int limit) {
        double value = 1.0;

        for (int i = 0; i < limit; i++) {
            value = (value / 2 + (1 / value));
            System.out.println(value);
        }
    }

    public static void task06(double inputvalue) {
        double max = inputvalue;
        double min = 1;
        double mid = 0;

        while (mid * mid != inputvalue) {
            mid = (min + max) / 2;
            if (mid*mid > inputvalue) {
                max = mid;
            } else {
                min = mid;
            }
            System.out.println(mid);
        }
    }
}
