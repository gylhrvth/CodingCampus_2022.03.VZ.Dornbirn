package timo.week01;

public class Rewind {
    public static void main(String[] args) {

        int limit = -10;

        for (int counter = 10; counter <= -10; --counter) {
            if (counter <= limit)
            System.out.println(counter);
        }
    }
}
