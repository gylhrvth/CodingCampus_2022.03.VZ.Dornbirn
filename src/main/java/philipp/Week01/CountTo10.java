package philipp.Week01;

public class CountTo10 {
    public static void main(String[] args) {
        int limit = 10;
        for (int counter = 0; counter <= limit; ++counter) {
            System.out.println(counter);

        }
        System.out.println("-----");
        int counterWhile = 0;
        while (counterWhile <= limit) {
            System.out.println(counterWhile);
            ++counterWhile;

        }
        System.out.println("-----");
        for (int counter = 0; counter < limit; ++counter) {
            System.out.println(counter);
        }

        System.out.println("-----");
        for (int counter = 0; counter <= limit; ++counter) {
            if (counter % 2 == 0) {
                System.out.println(counter);

            }
        }
        System.out.println("-----");
        int limit2 = -10;
        for (int counter = 10; counter >= limit2; --counter) {
            System.out.println(counter);
        }
    }
}


