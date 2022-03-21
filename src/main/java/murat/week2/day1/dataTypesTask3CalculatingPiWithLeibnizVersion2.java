package murat.week2.day1;

public class dataTypesTask3CalculatingPiWithLeibnizVersion2 {

    public static void main(String[] args) {

        calculatePi(1000000000);
    }

    public static void calculatePi(int iteration) {

        double myPi = 4;
        double constant = 4;

        for (int i = 3; i < iteration; i += 2) {

            if (i % 4 == 1) {
                myPi = myPi + (constant / i);
            } else {
                myPi = myPi - (constant / i);
            }
        }
        System.out.println("Pi: " + myPi);
    }
}
