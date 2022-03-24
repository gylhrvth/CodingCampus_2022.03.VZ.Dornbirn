package sergej.week2;

public class Countto100 {


    public static void counter(double value) {

        for (double i = 0.0; i <= value; i = i + 0.1) {
            System.out.println(i);
        }
        System.out.println("##############");

        for (int j = 0; j <= value; ++j) {
            float x = j / 0.1f;
            System.out.println(j);
        }
    }

    public static void divide() {

        System.out.println(4);
        System.out.println(4 / 3f);
        System.out.println(4 / 5f);
        System.out.println(4 / 7f);

    }

    public static void leibniz(int countOfIteration) {

        double myPi = 0.0;
        double denominator = 1;


        for (int i = 0; i <= countOfIteration; ++i) {

            if (i % 2 == 0) {
                myPi = myPi + (1 / denominator);
            } else {
                myPi = myPi - (1 / denominator);
            }
            denominator = denominator + 2;
        }
        myPi = myPi * 4;
        System.out.println(myPi);

    }

    public static void nilakantha() {

        double myPi = 3.0;
        double denominator = 2;

        for (int i = 0; i <= 100; ++i) {
            if (i % 2 == 0) {
                myPi = myPi + (4 / ((denominator) * (denominator + 1) * (denominator + 2)));

            } else {
                myPi = myPi - (4 / ((denominator) * (denominator + 1) * (denominator + 2)));
            }
            denominator = denominator + 2;

            System.out.println(myPi);
        }
    }

    public static void secretRow(int limit){
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

    public static void main(String[] args) {
        //counter(100);
        //divide();
        //leibniz(10000);
        // System.out.println((4 / 1) - (4 / 3) + (4 / 5));
        //nilakantha();
       // task06(5);

    }
}
