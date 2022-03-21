package murat.week2.day1;

public class dataTypesTask3CalculatingPiWithLeibnizVersion2 {

    public static void main(String[] args) {

        calculatePi(1000000000);
    }

    public static void calculatePi(int iteration) {

        double myPi = 4;
        double constant = 4;

        for (int i = 3; i < iteration; i += 2) {

            // Example: (3-1)/2 = 1 to sum,  (5-1)/2 = 2 = substract, (7-1)/2 = 3 sum
            if (((i - 1) / 2) % 2 == 0) {
                myPi = myPi + (constant / i);
            } else {
                myPi = myPi - (constant / i);
            }
        }
        System.out.println("Pi: " + myPi);
    }
}
