package lukas.week1.day3;

public class Rehearsal {
    public static void main(String[] args) {
        System.out.println("Heute wird ein guter Tag!");

        for (int i = -100; i <= 100; i += 10) {
            System.out.println(i);
        }

        int a = 10;
        String s = "Hallo";
        float f = 10.0f;
        double d = 20.0;
        long l = 612378132687613L;

        boolean b = true;

        char c = 'a';
        c = 100;

        System.out.println(c);

        //int myInt = (int) b --> Nicht möglich
        int myInt = b ? 1 : 0;

        System.out.println((int) c);
    }
}
