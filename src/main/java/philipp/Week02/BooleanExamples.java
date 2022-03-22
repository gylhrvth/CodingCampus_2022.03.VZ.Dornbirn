package philipp.Week02;

public class BooleanExamples {

    public static void main(String[] args) {
        boolean b = true;
        b = false;

        System.out.println(b);

        System.out.println(b || true); // OR oder?
        System.out.println(b && true); // AND und
        System.out.println(!b);        // Negation


        boolean c = false || b && true;
        System.out.println(c); // Was ist das Ergebnis von c?

        // Vergleich Operatoren
        boolean d = 5 < 10;
        boolean e = 5.5 > 5.2;
        // >= <=
        boolean f = (d == e); // !=

        printEmptySquare("X",10);
    }

    public static void printEmptySquare(String x, int size) {

        for (int i = 0; i < size; i++) {
            boolean b = i==0;
            if (b || i == size - 1) {
                for (int j = 0; j < size; j++) {
                    System.out.print(x);
                }
            } else {
                for (int j = 0; j < size; j++) {
                    if (j > 0 && j < size - 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print(x);
                    }
                }
            }
            System.out.println();
        }
    }
}

