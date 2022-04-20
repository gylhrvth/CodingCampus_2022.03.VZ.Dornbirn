package cemil.easterHomework;

public class Loops {
    public static void main(String[] args) {
        counter10();
        counterMinus30();
    }

    public static void counter10() {
        for (int i = 10; i >= 0; i--) {
            System.out.print(" " + i);

        }
        System.out.println();
    }

    public static void counterMinus30() {
        for (int i = -30; i <= 30; i += 3) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

}
