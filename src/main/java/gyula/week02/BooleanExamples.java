package gyula.week02;

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


    }
}
