package murat.week2.day1;

public class dataTypesTask6GuessingGame {

    public static void main(String[] args) {

        guessingGame(100);
    }

    public static void guessingGame(double root) {

        double half = 0;
        double max = 0;
        double min = 0;

        for (int i = 0; i < 10; i++) {

            half = root / 2;
            root = Math.sqrt(root);

            System.out.println(" Root: " + root + " Half: " + half);
            root = half;

            if (root > half) {
                max = half;
            } else {
                min = half;
            }
        }
        System.out.println(" Min: " + min + " Max: " + max);
    }
}
