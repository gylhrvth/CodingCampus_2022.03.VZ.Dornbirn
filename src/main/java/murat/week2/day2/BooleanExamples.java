package murat.week2.day2;

public class BooleanExamples {
    public static void main(String[] args) {

        boolean b = true;
        b = false;
        System.out.println(b || true);  // Or
        System.out.println(b && true); // And
        System.out.println(!b); // Negation

        // Example
        boolean c = false || b && true;    // boolean c = false || (b && true);
        System.out.println(c);
    }
}
