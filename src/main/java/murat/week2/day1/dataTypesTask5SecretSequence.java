package murat.week2.day1;

public class dataTypesTask5SecretSequence {
    public static void main(String[] args) {

        secretSequence(1000000);
    }

    public static void secretSequence(double limit) {

        double value = 1.0;
        double valueNext = 0.0;

        for (int i = 1; i < limit; i++) {

            valueNext = (value / 2 + 1 / value);
            //  System.out.println("i: " + i + " Value: " + value + " ValueNext " + valueNext);
            value = valueNext;

        }

        System.out.println(value);
    }
}
