package zah.week02;

public class Day2Bolean {
    public static void main(String[] args) {
        printTrianglefNew("x", 2);
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


    }
    public static void printTrianglefNew(String text, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size * 2 - 1; j++) {
                if ((i+j < size-1)||
                    (j -i > size - 1)){
                    System.out.print(" .");
                }
                else {
                    System.out.print(" X");
                }
            }
            System.out.println();
        }


    }
}
