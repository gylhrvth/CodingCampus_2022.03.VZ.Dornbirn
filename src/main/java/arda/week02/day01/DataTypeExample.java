package arda.week02.day01;

public class DataTypeExample {
    public static void main(String[] args) {
    }
        public static void IntVariable (String[]args){

            //Integer Variablen
            byte a = 0; // 8 bit
            short b = 0; // 16 bit
            int c = 0; // 32 bit
            long d = 0; // 64 bit

            System.out.println(100);
            a = 100;
            d = 100L; // L = 64 bit breitgestellt
            //a = 100L // Es geht nicht!
            a = (byte) 100L;
            d = 123456789L;
            a = (byte) d;
            System.out.println(d + " " + a);

            System.out.println(2 + a);
            System.out.println(a - 10);
            System.out.println(a * 5);
            System.out.println(d / 1234);
            System.out.println(d % 1234);

            //a + d wird automatisch konvertiert
        }
        public static void floatingPointExpample () {
            //+/- 3.4567307 (*10^ +/- 4)

            // 3.456 * 10^4 ==> 34560 Dezimalstelle wird verschoben
            // 8.112 *10^-3 ==> 0.008112
            float fVariable = (float) 2.25;
            fVariable = 1.55f;
            double dVariable = 2.25;

            System.out.println(2 + fVariable);
            System.out.println(fVariable - 10);
            System.out.println(fVariable * 5);
            System.out.println(fVariable / 1234);
        }
}
