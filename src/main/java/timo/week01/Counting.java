package timo.week01;

public class Counting {
    public static void main(String[] args) {

        int limit = 11;
        int counter2 = 0;

        for (int counter = 0; counter < limit; ++counter) {
            System.out.println(counter);
        }
        System.out.println("----------------------------");

        while (counter2 < limit)
        {
            System.out.println(counter2);
            ++counter2;
        }
    }
}
