package murat.week2.day1;

public class dataTypesTask6GuessingGame {

    public static void main(String[] args) {

        guessingGame(0.01);
    }

    public static void guessingGame(double target) {

        double max = target;
        double min = 1;
        double test = 0;
        double testOld = -1;

        // If target is smaller than 1
        if (target < 1) {
            min = target;
            max = 1;
        }

        // If we reach the target and for infinite loops (For Example Target:2)
        while ((test * test != target) && (test != testOld)) {

            testOld = test;
            test = min + (max - min) / 2;   // (Max + Min)/2

            if (test * test > target) {
                max = test;
            } else {
                min = test;
            }
            System.out.println("Target: " + target + " Test: " + test + " Max: " + max + " Min: " + min);
        }
    }
}
